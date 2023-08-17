package com.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	static int sel_bt_no=0;
	static int money=0;
	
	public static void main(String[] args) throws Exception
	{
		JFrame f = new JFrame("자판기");

		f.setLayout(new BorderLayout());
		
		JPanel nPanel = new JPanel();

		JLabel l1 = new JLabel("자판기");
		
		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);
		
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
		
		int numItems;
		
		ArrayList<Integer> menuNum = new ArrayList<Integer>();
		ArrayList<String> menuName = new ArrayList<String>();
		ArrayList<Integer> menuPrice = new ArrayList<Integer>();
		ArrayList<Integer> menuCount = new ArrayList<Integer>();
		ArrayList<JButton> button = new ArrayList<JButton>();
		
		if(isExists)
		{
			Scanner fileIn = new Scanner(file);
			
			numItems = fileIn.nextInt();

			JPanel cPanel = new JPanel(new GridLayout((numItems >= 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)), 0, 10, 10));
			JPanel cPanel_2 = new JPanel();
			
			JPanel sPanel = new JPanel(new BorderLayout());
			JPanel subPanel = new JPanel();
			JPanel subPanel_2 = new JPanel();
			
			JTextField txtf1 = new JTextField(10); 
			JButton bt1 = new JButton("입력");
			JButton bt2 = new JButton("잔돈 반환");
			JLabel l2 = new JLabel("잔돈 : 0원");
			
			for(int i = 0; i < numItems; i++)
			{
				menuNum.add(fileIn.nextInt());
				menuName.add(fileIn.next());
				menuPrice.add(fileIn.nextInt());
				menuCount.add(fileIn.nextInt());
				button.add(new JButton(menuName.get(i)));
				button.get(i).addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e)
					{
						String str = e.getActionCommand();
						
						for (int j = 0; j < numItems; j++)
						{
							if(str.equals(menuName.get(j)))
							{
								sel_bt_no = j;
							}
						}
						
						if (menuCount.get(sel_bt_no) > 0)
						{
							money -= menuPrice.get(sel_bt_no);
							menuCount.set(sel_bt_no, menuCount.get(sel_bt_no) - 1);
							
							if (menuCount.get(sel_bt_no) > 0)
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "(이)가 " + menuCount.get(sel_bt_no) + "개 남았습니다.";
							}
							else
							{
								str = menuName.get(sel_bt_no) + "의 가격은 " + String.valueOf(menuPrice.get(sel_bt_no)) + "원 입니다.\n"
										+ menuName.get(sel_bt_no) + "의 수량이 소진 되었습니다.";
							}
							
							JOptionPane.showMessageDialog(f, str);
							
							l2.setText("잔돈 : " + test.money + "원");
							
							for (int i = 0; i < numItems; i++)
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(test.money >= menuPrice.get(i))
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
				cPanel.add(button.get(i));
				button.get(i).setEnabled(false);
			}
			
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
			
			bt1.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					if (!txtf1.getText().equals(""))
					{
						if (!txtf1.getText().equals("-999"))
						{
							test.money += Integer.parseInt(txtf1.getText());
							l2.setText("잔돈 : " + test.money + "원");
							txtf1.setText("");
							
							for (int i = 0; i < numItems; i++)
							{
								if (menuCount.get(i) == 0)
								{
									button.get(i).setEnabled(false);
								}
								else
								{
									if(test.money >= menuPrice.get(i))
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
						else
						{
							f.setTitle("자판기 관리자모드");
							l1.setText("자판기 관리자모드");
							txtf1.setText("");
							JButton addMenu = new JButton("메뉴 추가");
							
							addMenu.addActionListener(new ActionListener()
							{
								@Override
								public void actionPerformed(ActionEvent e)
								{
									cPanel.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
									f.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
									cPanel.remove(numItems);
									f.setVisible(true);
								}
							});
							cPanel.add(addMenu);
							
							cPanel.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
							f.setSize(300, ((numItems + 1) > 3 * ((numItems + 1) / 3) ? ((numItems + 1) / 3) + 1 : ((numItems + 1) / 3)) * 40 + 130);
							f.setVisible(true);
						}
					}
				}
			});
			
			bt2.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					l2.setText("잔돈 : 0원");
					txtf1.setText("");

					String str = "잔돈은 " + test.money + "원 입니다";
					JOptionPane.showMessageDialog(f, str);
					
					for (int i = 0; i < numItems; i++)
					{
						button.get(i).setEnabled(false);
					}
				}
			});
			
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(300, (numItems >= 3 * (numItems / 3) ? (numItems / 3) + 1 : (numItems / 3)) * 40 + 130);
			f.setVisible(true);
		}
	}
}
