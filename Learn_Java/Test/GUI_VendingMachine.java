package com.test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_VendingMachine
{
	static int sel_bt_no=0;
	static int money=0;
	static int numItems=0;
	static int mode = 0;
	
	public static void main(String[] args) throws Exception
	{
		Runtime rt = Runtime.getRuntime();
        
		JFrame f = new JFrame("자판기");
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		
		JPanel nPanel = new JPanel();
		JLabel l1 = new JLabel("자판기");
		
		nPanel.add(l1);
		
		l1.setFont(fnt1);
		f.setLayout(new BorderLayout());
		f.add(nPanel, BorderLayout.NORTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		ArrayList<Integer> menuNum = new ArrayList<Integer>();
		ArrayList<String> menuName = new ArrayList<String>();
		ArrayList<Integer> menuPrice = new ArrayList<Integer>();
		ArrayList<Integer> menuCount = new ArrayList<Integer>();
		ArrayList<JButton> button = new ArrayList<JButton>();
		ArrayList<JLabel> priceLabel = new ArrayList<JLabel>();
		ArrayList<JLabel> countLabel = new ArrayList<JLabel>();
		
		if(!isExists) // 메뉴 파일이 없다면 물품 새로 만들기
		{
			JDialog dialog = new JDialog(f, "메뉴 생성", true);
			dialog.setSize(500, 140);
			
			JPanel dpanel = new JPanel(new BorderLayout());
			JPanel dp = new JPanel();
			JPanel dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JLabel dl1 = new JLabel("메뉴");
			JLabel dl2 = new JLabel("이름");
			JLabel dl3 = new JLabel("가격");
			JLabel dl4 = new JLabel("수량");
			
			dp1.add(dl1);
			dp1.add(dl2);
			dp1.add(dl3);
			dp1.add(dl4);
			
			JComboBox<String> dcb = new JComboBox<String>();
			dcb.addItem(String.valueOf(1));
			
			JTextField dt1 = new JTextField(10);
			JTextField dt2 = new JTextField(10);
			JTextField dt3 = new JTextField(10);
			
			dp1.add(dcb);
			dp1.add(dt1);
			dp1.add(dt2);
			dp1.add(dt3);
			
			JButton btDialog = new JButton("제거");
			JButton btDialog_2 = new JButton("저장");
			JButton btDialog_3 = new JButton("확인");
			
			dp.add(dp1);
			dp.add(btDialog);
			dp.add(btDialog_2);
			dp.add(btDialog_3);
			
			dpanel.add(dp);

			dialog.add(dpanel);
			
			btDialog.addActionListener(new ActionListener() // 메뉴 제거 버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int dcb_idx = dcb.getSelectedIndex();
						
						dcb.removeItemAt(numItems);
						menuName.remove(dcb_idx);
						menuPrice.remove(dcb_idx);
						menuCount.remove(dcb_idx);
						
						numItems--;
						
						if (numItems != dcb_idx) // 마지막 물품을 삭제하려고 했는지 검사
						{
							dt1.setText(menuName.get(dcb_idx));
							dt2.setText(String.valueOf(menuPrice.get(dcb_idx)));
							dt3.setText(String.valueOf(menuCount.get(dcb_idx)));
						}
						else
						{
							if (numItems == 0) // 더이상 삭제할 물품이 없다면
							{
								dt1.setText("");
								dt2.setText("");
								dt3.setText("");
							}
							else
							{
								dt1.setText(menuName.get(numItems - 1));
								dt2.setText(String.valueOf(menuPrice.get(numItems - 1)));
								dt3.setText(String.valueOf(menuCount.get(numItems - 1)));
							}
						}
					}
				}
			});
			
			btDialog_2.addActionListener(new ActionListener() // 메뉴 추가 저장버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						menuName.add(dt1.getText());
						menuPrice.add(Integer.valueOf(dt2.getText()));
						menuCount.add(Integer.valueOf(dt3.getText()));
						
						numItems++;
						dcb.addItem(String.valueOf(numItems + 1));
					}
				}
			});
			
			btDialog_3.addActionListener(new ActionListener() // 메뉴 추가 확인버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					FileWriter fw;
          
					try  // 파일 저장
					{
						fw = new FileWriter("c:\\Temp\\menu.txt");
						
						String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
						fw.write(out);
						
						for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
						{
							out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
							fw.write(out);
						}
						
						fw.close();
					}
					catch (IOException e1) // 실패시 에러문구
					{
						String str = "저장에 실패하였습니다.";
						JOptionPane.showMessageDialog(f, str);
						
						e1.printStackTrace();
					}
					dialog.dispose();
				}
			});
			
			dcb.addItemListener(new ItemListener() // 메뉴파일 생성 콤보박스 선택
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					int index = ((JComboBox<String>)dcb).getSelectedIndex();
					
					if (numItems > index)
					{
						dt1.setText(menuName.get(index));
						dt2.setText(String.valueOf(menuPrice.get(index)));
						dt3.setText(String.valueOf(menuCount.get(index)));
					}
					else
					{
						dt1.setText("");
						dt2.setText("");
						dt3.setText("");
					}
				}
			});
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패시 에러문구
							{
								String str = "저장에 실패하였습니다.";
								JOptionPane.showMessageDialog(f, str);
								
								e.printStackTrace();
							}
							
						}
					});
			
			dialog.setVisible(true);
		}
		
		if(file.exists())
		{
			Scanner fileIn = new Scanner(file);
			numItems = fileIn.nextInt();
			GridLayout gl = new GridLayout(1, 0, 10, 10);
      
			if (numItems > 0) // 구이창의 크기 초기 조절
			{
				gl.setRows((numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)));
			}
			JPanel cPanel = new JPanel(gl);
			JPanel cPanel_2 = new JPanel();
			
			JPanel sPanel = new JPanel(new BorderLayout());
			JPanel subPanel = new JPanel();
			JPanel subPanel_2 = new JPanel();
			
			JTextField txtf1 = new JTextField(10); 
			JButton bt1 = new JButton("입력");
			JButton bt2 = new JButton("잔돈 반환");
			JLabel l2 = new JLabel("잔돈 : 0원");
			
			JMenuBar mbar = new JMenuBar();
			
			JMenu menu1 = new JMenu("관리자 메뉴");
			JMenuItem m1_item1 = new JMenuItem("기존 메뉴 수정");
			JMenuItem m1_item2 = new JMenuItem("신규 메뉴 추가");
			JMenuItem m1_item3 = new JMenuItem("종료");
			menu1.add(m1_item1);
			menu1.add(m1_item2);
			menu1.addSeparator();
			menu1.add(m1_item3);
			
			f.setJMenuBar(mbar);
			
			JDialog editDialog = new JDialog(f, "기존 메뉴 수정", true);
			JDialog newDialog = new JDialog(f, "신규 메뉴 추가", true);
			editDialog.setSize(500, 140);
			newDialog.setSize(370, 130);
			
			JPanel dpanel = new JPanel(new BorderLayout());
			JPanel dp = new JPanel();
			JPanel dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JPanel n_dpanel = new JPanel(new BorderLayout());
			JPanel n_dp = new JPanel();
			JPanel n_dp1 = new JPanel(new GridLayout(2, 0, 10, 0));
			
			JLabel dl1 = new JLabel("메뉴", JLabel.CENTER);
			JLabel dl2 = new JLabel("이름", JLabel.CENTER);
			JLabel dl3 = new JLabel("가격", JLabel.CENTER);
			JLabel dl4 = new JLabel("수량", JLabel.CENTER);
			
			JLabel n_dl1 = new JLabel("이름", JLabel.CENTER);
			JLabel n_dl2 = new JLabel("가격", JLabel.CENTER);
			JLabel n_dl3 = new JLabel("수량", JLabel.CENTER);
			
			
			dp1.add(dl1);
			dp1.add(dl2);
			dp1.add(dl3);
			dp1.add(dl4);
			
			n_dp1.add(n_dl1);
			n_dp1.add(n_dl2);
			n_dp1.add(n_dl3);
			
			JComboBox<String> dcb = new JComboBox<String>();
      
			for (int i = 0; i < numItems; i++) // 아이템 번호 리스트 추가
			{
				dcb.addItem(String.valueOf(i + 1));
			}
			
			JTextField dt1 = new JTextField(10);
			JTextField dt2 = new JTextField(10);
			JTextField dt3 = new JTextField(10);
			
			JTextField n_dt1 = new JTextField(10);
			JTextField n_dt2 = new JTextField(10);
			JTextField n_dt3 = new JTextField(10);
			
			dp1.add(dcb);
			dp1.add(dt1);
			dp1.add(dt2);
			dp1.add(dt3);
			
			n_dp1.add(n_dt1);
			n_dp1.add(n_dt2);
			n_dp1.add(n_dt3);
			
			JButton btDialog = new JButton("저장");
			JButton btDialog_2 = new JButton("삭제");
			JButton btDialog_3 = new JButton("확인");
			JButton n_btDialog = new JButton("확인");
			
			dp.add(dp1);
			dp.add(btDialog);
			dp.add(btDialog_2);
			dp.add(btDialog_3);
			
			dpanel.add(dp);
			
			n_dp.add(n_dp1);
			n_dp.add(n_btDialog);
			
			n_dpanel.add(n_dp);
			
			editDialog.add(dpanel);
			newDialog.add(n_dpanel);
			
			for(int i = 0; i < numItems; i++) // 물건의 갯수만큼 반복
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
				
				JLabel label = new JLabel(String.valueOf(menuPrice.get(i)) + "원", JLabel.CENTER); // 버튼 아래 가격 추가
				JLabel label_2 = new JLabel(String.valueOf(menuCount.get(i)) + "개", JLabel.CENTER); // 버튼 아래 수량 추가
				button.add(new JButton(menuName.get(i))); // 버튼 배열에 추가
				priceLabel.add(label);
				countLabel.add(label_2);
				JPanel btp = new JPanel(new GridLayout(2, 0));
				JPanel btp_2 = new JPanel(new GridLayout(2, 0, 0, -5));
				button.get(i).addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) // 물품 구매 버튼
					{
						String str = e.getActionCommand();
						
						for (int j = 0; j < numItems; j++) // 몇번째 버튼인지 찾음
						{
							if(str.equals(menuName.get(j)))
							{
								sel_bt_no = j;
							}
						}
						
						if (menuCount.get(sel_bt_no) > 0) // 수량 확인
						{
							money -= menuPrice.get(sel_bt_no);
							menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
							
							if (menuCount.get(sel_bt_no) > 0) // 1개 이상 남았을때
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
								countLabel.get(sel_bt_no).setText(String.valueOf(menuCount.get(sel_bt_no)) + "개");
							}
							else // 마지막 수량
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
								countLabel.get(sel_bt_no).setText("품절");
							}
							
							
							try // 로그파일 생성
							{
								LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
								FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
								String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
										currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
										menuNum.get(sel_bt_no), menuName.get(sel_bt_no), menuPrice.get(sel_bt_no), menuCount.get(sel_bt_no), money);
								
								lfw.append(out);
								lfw.close();
							}
							catch (IOException e1)
							{
								e1.printStackTrace();
							}
							
							
							JOptionPane.showMessageDialog(f, str);
							l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
							
							for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(GUI_VendingMachine.money >= menuPrice.get(i))
									{
										button.get(i).setEnabled(true);
									}
									else
									{
										button.get(i).setEnabled(false);
									}
								}
							}
						}
					}
				});
				
				btp_2.add(label);
				btp_2.add(label_2);
				btp.add(button.get(i));
				btp.add(btp_2);
				cPanel.add(btp);
				button.get(i).setEnabled(false);
			}
			
			rt.addShutdownHook( // 프로그램 종료 감지
					new Thread()
					{
						public void run()
						{
							FileWriter fw;
              
							try  // 파일 저장
							{
								fw = new FileWriter("c:\\Temp\\menu.txt");
								
								String out = String.format("%d\r\n", numItems); // 전체 메뉴의 갯수 저장
								fw.write(out);
								
								for (int i = 0; i < numItems; i++) // 전체 메뉴 저장
								{
									out = String.format("%d %s %d %d\r\n", i + 1, menuName.get(i), menuPrice.get(i), menuCount.get(i));
									fw.write(out);
								}
								
								fw.close();
							}
							catch (IOException e) // 실패시 에러문구
							{
								String str = "저장에 실패하였습니다.";
								JOptionPane.showMessageDialog(f, str);
								
								e.printStackTrace();
							}
							
						}
					});
			
			fileIn.close();
			
			cPanel_2.add(cPanel);
			subPanel.add(txtf1);
			subPanel.add(bt1);
			subPanel.add(bt2);
			subPanel_2.add(l2);
			
			f.add(cPanel_2, BorderLayout.CENTER);
			f.add(sPanel, BorderLayout.SOUTH);
			sPanel.add(subPanel, BorderLayout.NORTH);
			sPanel.add(subPanel_2, BorderLayout.SOUTH);
			
			bt1.addActionListener(new ActionListener() // 입력버튼 클릭
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (!txtf1.getText().equals("")) // 빈칸인지 확인
					{
						boolean check = true;
						
						try // 돈 입력란에 숫자만 입력했는지 검사
						{
							int value = Integer.parseInt(txtf1.getText());
							
							if(value != -999)
							{
								if (value < 0) // 돈이 음수인지 검사
								{
									JOptionPane.showMessageDialog(null, "돈에는 음수를 입력할 수 없습니다.");
									txtf1.setText("");
									check = false;
								}
							}
						}
						catch (NumberFormatException exception)
						{
							JOptionPane.showMessageDialog(null, "돈은 숫자만 입력할 수 있습니다.");
							txtf1.setText("");
							check = false;
						}
						
						if (check) // 검증이 끝나면 실행
						{
							if (!txtf1.getText().equals("-999")) // 돈 입력
							{
								GUI_VendingMachine.money += Integer.parseInt(txtf1.getText());
								l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
								txtf1.setText("");
								
								for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
								{
									if (menuCount.get(i) == 0)// 수량이 부족하면 비활성화
									{
										button.get(i).setEnabled(false);
									}
									else // 아니면 가격비교
									{
										if(GUI_VendingMachine.money >= menuPrice.get(i))
										{
											button.get(i).setEnabled(true);
										}
										else
										{
											button.get(i).setEnabled(false);
										}
									}
								}
							}
							else // -999원을 입력할 경우 관리자 모드 메뉴창을 띄움
							{
								if (mode == 0) // 관리자 메뉴 띄움
								{
									mbar.add(menu1);
									mode = 1;
								}
								else // 관리자 메뉴 지움
								{
									mbar.remove(menu1);
									mode = 0;
									txtf1.setText("");
								}
								refreshSize(button, gl, f);
							}
						}
					}
				}
			});
			
			bt2.addActionListener(new ActionListener() // 잔돈 반환
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					l2.setText("잔돈 : 0원");
					txtf1.setText("");
					
					String str = "잔돈은 " + GUI_VendingMachine.money + "원 입니다";
					JOptionPane.showMessageDialog(f, str);
					
					for (int i = 0; i < numItems; i++)
					{
						button.get(i).setEnabled(false);
					}
				}
			});
			
			m1_item1.addActionListener(new ActionListener() // 메뉴 수정 다이얼로그 띄움
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int index = ((JComboBox<String>)dcb).getSelectedIndex();
						dt1.setText(menuName.get(index));
						dt2.setText(String.valueOf(menuPrice.get(index)));
						dt3.setText(String.valueOf(menuCount.get(index)));
						editDialog.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(f, "수정할 메뉴가 남아있지 않습니다.");
						editDialog.setVisible(false);
					}
				}
			});
			
			m1_item2.addActionListener(new ActionListener() // 메뉴 추가 다이얼로그 띄움
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					newDialog.setVisible(true);
				}
			});
			
			m1_item3.addActionListener(new ActionListener() // 시스템 종료
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					System.exit(0);
				}
			});
			
			btDialog.addActionListener(new ActionListener() // 메뉴 저장  버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						int dcb_idx = dcb.getSelectedIndex();
						menuName.set(dcb_idx, dt1.getText());
						menuPrice.set(dcb_idx, Integer.valueOf(dt2.getText()));
						menuCount.set(dcb_idx, Integer.valueOf(dt3.getText()));
						priceLabel.get(dcb_idx).setText(String.valueOf(menuPrice.get(dcb_idx)) + "원");
						countLabel.get(dcb_idx).setText(String.valueOf(menuCount.get(dcb_idx)) + "개");
						
						for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
						{
							if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
							{
								button.get(i).setEnabled(false);
							}
							else // 아니면 가격비교
							{
								if(GUI_VendingMachine.money >= menuPrice.get(i))
								{
									button.get(i).setEnabled(true);
								}
								else
								{
									button.get(i).setEnabled(false);
								}
							}
						}
					}
				}
			});
			
			btDialog_2.addActionListener(new ActionListener() // 메뉴 삭제 버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (numItems > 0)
					{
						int dcb_idx = dcb.getSelectedIndex();
						
						menuName.remove(dcb_idx);
						menuPrice.remove(dcb_idx);
						menuCount.remove(dcb_idx);
						button.remove(dcb_idx);
						cPanel.remove(dcb_idx);
						
						numItems--;
						
						if (numItems != dcb_idx) // 마지막 물품을 삭제하려고 했는지 검사
						{
							dcb.removeItemAt(numItems);
							dt1.setText(menuName.get(dcb_idx));
							dt2.setText(String.valueOf(menuPrice.get(dcb_idx)));
							dt3.setText(String.valueOf(menuCount.get(dcb_idx)));
						}
						else
						{
							if (numItems == 0) // 더이상 삭제할 물품이 없다면
							{
								dt1.setText("");
								dt2.setText("");
								dt3.setText("");
								editDialog.setVisible(false);
								editDialog.dispose();
							}
							else
							{
								dt1.setText(menuName.get(numItems - 1));
								dt2.setText(String.valueOf(menuPrice.get(numItems - 1)));
								dt3.setText(String.valueOf(menuCount.get(numItems - 1)));
							}
						}
					}
					refreshSize(button, gl, f);
				}
			});
			
			btDialog_3.addActionListener(new ActionListener() // 메뉴 수정 확인버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					editDialog.dispose();
				}
			});
			
			n_btDialog.addActionListener(new ActionListener() // 메뉴 추가 저장버튼
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					boolean check = true;
					
					try // 가격 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(n_dt2.getText());
						
						if (value < 0) // 가격이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "가격에는 음수를 입력할 수 없습니다.");
							n_dt2.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "가격에는 숫자만 입력해 주세요");
						n_dt2.setText("");
						check = false;
					}
					
					try // 수량 입력란에 숫자만 입력했는지 검사
					{
						int value = Integer.parseInt(n_dt3.getText());
						
						if (value < 0) // 수량이 음수인지 검사
						{
							JOptionPane.showMessageDialog(null, "수량에는 음수를 입력할 수 없습니다.");
							n_dt3.setText("");
							check = false;
						}
					}
					catch (NumberFormatException exception)
					{
						JOptionPane.showMessageDialog(null, "수량에는 숫자만 입력해 주세요");
						n_dt3.setText("");
						check = false;
					}
					
					if (check) // 검증이 끝나면 실행
					{
						menuName.add(n_dt1.getText());
						menuPrice.add(Integer.valueOf(n_dt2.getText()));
						menuCount.add(Integer.valueOf(n_dt3.getText()));
						button.add(new JButton(n_dt1.getText()));
						JLabel label = new JLabel(String.valueOf(n_dt2.getText()) + "원", JLabel.CENTER); // 버튼 아래 가격 추가
						JLabel label_2 = new JLabel(String.valueOf(n_dt3.getText()) + "개", JLabel.CENTER); // 버튼 아래 수량 추가
						
						priceLabel.add(label);
						countLabel.add(label_2);
						JPanel btp = new JPanel(new GridLayout(2, 0));
						JPanel btp_2 = new JPanel(new GridLayout(2, 0, 0, -5));
						
						numItems++;
						
						for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
						{
							if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
							{
								button.get(i).setEnabled(false);
							}
							else // 아니면 가격비교
							{
								if(GUI_VendingMachine.money >= menuPrice.get(i))
								{
									button.get(i).setEnabled(true);
								}
								else
								{
									button.get(i).setEnabled(false);
								}
							}
						}
						
						button.get(numItems - 1).addActionListener(new ActionListener() // 추가된 버튼 액션
						{
							@Override
							public void actionPerformed(ActionEvent e) // 물품 구매 버튼
							{
								String str = e.getActionCommand();
								
								for (int j = 0; j < numItems; j++) // 몇번째 버튼인지 찾음
								{
									if(str.equals(menuName.get(j)))
									{
										sel_bt_no = j;
									}
								}
								
								if (menuCount.get(sel_bt_no) > 0) // 수량 확인
								{
									money -= menuPrice.get(sel_bt_no);
									menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
									
									if (menuCount.get(sel_bt_no) > 0) // 1개 이상 남았을때
									{
										str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
												+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
										countLabel.get(sel_bt_no).setText(String.valueOf(menuCount.get(sel_bt_no)) + "개");
									}
									else // 마지막 수량
									{
										str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
												+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
										countLabel.get(sel_bt_no).setText("품절");
									}
									
									try // 로그파일 생성
									{
										LocalDateTime currentDateTime  = LocalDateTime.now(); // 날짜
										FileWriter lfw = new FileWriter("c:\\Temp\\Log.txt", true);
										String out = String.format("%d-%d-%dT%d:%d:%d %d번 물품 %s(%d원)이 %d개 잔돈은 %d원 남았습니다.\r\n", currentDateTime.getYear(), currentDateTime.getMonthValue(), currentDateTime.getDayOfMonth(),
												currentDateTime.getHour(), currentDateTime.getMinute(), currentDateTime.getSecond(), 
												menuNum.get(sel_bt_no), menuName.get(sel_bt_no), menuPrice.get(sel_bt_no), menuCount.get(sel_bt_no), money);
										
										lfw.append(out);
										lfw.close();
									}
									catch (IOException e1)
									{
										e1.printStackTrace();
									}
									
									JOptionPane.showMessageDialog(f, str);
									l2.setText("잔돈 : " + GUI_VendingMachine.money + "원");
									
									for (int i = 0; i < numItems; i++) // 살수있는 물품 활성화/비활성화
									{
										if (menuCount.get(i) == 0) // 수량이 부족하면 비활성화
										{
											button.get(i).setEnabled(false);
										}
										else // 아니면 가격비교
										{
											if(GUI_VendingMachine.money >= menuPrice.get(i))
											{
												button.get(i).setEnabled(true);
											}
											else
											{
												button.get(i).setEnabled(false);
											}
										}
									}
								}
							}
						});
						
						btp_2.add(label);
						btp_2.add(label);
						btp.add(button.get(numItems - 1));
						btp.add(btp_2);
						cPanel.add(btp);
						
						refreshSize(button, gl, f);
						
						newDialog.dispose();
						n_dt1.setText("");
						n_dt2.setText("");
						n_dt3.setText("");
					}
				}
			});
			
			dcb.addItemListener(new ItemListener() // 메뉴 수정 콤보박스 선택
			{
				@Override
				public void itemStateChanged(ItemEvent e)
				{
					int index = ((JComboBox<String>)dcb).getSelectedIndex();
					dt1.setText(menuName.get(index));
					dt2.setText(String.valueOf(menuPrice.get(index)));
					dt3.setText(String.valueOf(menuCount.get(index)));
				}
			});

			f.setVisible(true);
			refreshSize(button, gl, f);
		}
	}
	
	public static void refreshSize(ArrayList<JButton> bt, GridLayout grid, JFrame frame) // 프레임, 그리드 크기 재조정
	{
		int count = 0;
		int high = 0;
		
		for (int i = 0, j = 1; i < numItems; i++, j++) // 버튼 크기 검사
		{
			count += bt.get(i).getSize().width + 10;
			System.out.println(bt.get(i).getSize());
      
			if (j == 3)
			{
				if (high < count)
				{
					high = count;
					j = 0;
					count = 0;
				}
			}
		}
		
		if (high < 280) // 너무 작으면 그냥 만듦
		{
			high = 280;
		}
		
		if (numItems > 0)
		{
			frame.setVisible(true);
			grid.setRows((numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)));
			frame.setSize(high + 20, (numItems > 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)) * 70 + 170 + 20 * mode);
		}
		else
		{
			frame.setVisible(true);
			grid.setRows(1);
			frame.setSize(300, 190);
		}
	}
}
