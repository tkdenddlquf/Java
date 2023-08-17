package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

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

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class test
{
	static int sel_bt_no=0;
	static int money=0;
	static int min_price=0;
	
	public static void main(String[] args) throws Exception
  {
		File file = new File("c:\\Temp\\menu.txt");
		boolean isExists = file.exists();
    
		int numItems;
		int[] menu_num;
		String[] menu_title;
		int[] menu_price;
    
		Scanner in2 = new Scanner(file);

		// file 확인
		numItems = in2.nextInt();
		menu_num = new int[numItems];
		menu_title = new String[numItems];
		menu_price = new int[numItems];

		for(int i=0; i<numItems; i++)
		{
			menu_num[i] = in2.nextInt();
			menu_title[i] = in2.next();
			menu_price[i] = in2.nextInt();
		}
    
		in2.close();
		min_price = menu_price[0];
    
		for(int i=1; i<numItems; i++)
		{
			if(min_price > menu_price[i])
			{
				min_price = menu_price[i];
			}
		}
		
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);
		JTextField t2 = new JTextField(15);
		
		//north
		JPanel nPanel = new JPanel(new FlowLayout());
		JLabel l1 = new JLabel();
		Font fnt1 = new Font("맑은 고딕", Font.BOLD, 40);
		l1.setFont(fnt1);
		l1.setText("자판기");

		nPanel.add(l1);
		f.add(nPanel, BorderLayout.NORTH);

		//center
		JPanel cPanel = new JPanel(new GridLayout(3,3));

		JButton[] bt = new JButton[9];
		Font fnt2 = new Font("맑은 고딕", Font.BOLD, 20);
		
		for(int i=0; i<9; i++)
		{
			if(numItems > i)
			{
				bt[i] = new JButton(menu_title[i]);
				bt[i].setFont(fnt2);
				bt[i].addActionListener(new ActionListener()
        {
					@Override
					public void actionPerformed(ActionEvent e)
          {
						String str = e.getActionCommand();
						JOptionPane.showMessageDialog(f, str);
            
						for(int j=0; j<numItems;j++)
						{
							if(str.equals(menu_title[j]))
							{
								sel_bt_no = j;
							}
						}
						
						System.out.println(menu_title[sel_bt_no]+"의 가격은"+String.valueOf(menu_price[sel_bt_no])+"원 입니다.");
						
						if(money >= menu_price[sel_bt_no])
						{
							money -= menu_price[sel_bt_no];
							t2.setText(String.valueOf(money));
						}
						else
						{
							JOptionPane.showMessageDialog(f,  "돈이 부족합니다.");
						}
					}
				});
			}
			else
			{
				bt[i] = new JButton("");
			}
			cPanel.add(bt[i]);
			bt[i].setEnabled(false);
		}
    
		f.add(cPanel,BorderLayout.CENTER);
    
		//south
		JPanel sPanel = new JPanel(new GridLayout(2,0));
		JPanel sp1 = new JPanel();
		JPanel sp2 = new JPanel();
		
		JLabel l2 = new JLabel("");
		JTextField t1 = new JTextField(15);
		JButton bt_input = new JButton("입력");
		JButton bt_return = new JButton("반환");
		
		sp1.add(l2);
		sp1.add(t1);
		sp1.add(bt_input);
		sp1.add(bt_return);
		
		JLabel l3 = new JLabel("잔돈");

		sp2.add(l3);
		sp2.add(t2);
		sPanel.add(sp1);
		sPanel.add(sp2);
		f.add(sPanel,BorderLayout.SOUTH);
    
		bt_input.addActionListener(new ActionListener()
    {
			@Override
			public void actionPerformed(ActionEvent e)
      {
				money += Integer.parseInt(t1.getText());
				t1.setText("");
				
				if(money >= min_price)
				{
					for(int i = 0; i<numItems;i++)
					{
						bt[i].setEnabled(true);
					}
				}
				
				t2.setText(String.valueOf(money));
			}
		});
		
		
		bt_return.addActionListener(new ActionListener()
    {
			@Override
			public void actionPerformed(ActionEvent e)
      {
			}
		});

		
		JMenuBar mbar = new JMenuBar();
		JMenu menu1 = new JMenu("관리자 메뉴");
		JMenuItem m1_item1 = new JMenuItem("기존 메뉴 수정");
		JMenuItem m1_item2 = new JMenuItem("신규 메뉴 추가");
		JMenuItem m1_item3 = new JMenuItem("종료");
		menu1.add(m1_item1);
		menu1.add(m1_item2);
		menu1.addSeparator();
		menu1.add(m1_item3);
		mbar.add(menu1);

		f.setJMenuBar(mbar);

		JDialog editDialog = new JDialog(f, "기존 메뉴 수정", true);
		editDialog.setSize(400, 300);
		
		JPanel dpanel = new JPanel(new GridLayout(2,0));
		JPanel dp1 = new JPanel(new GridLayout(2,3));
		JPanel dp2 = new JPanel(new FlowLayout());
		
		JLabel dl1 = new JLabel("메뉴");
		JLabel dl2 = new JLabel("이름");
		JLabel dl3 = new JLabel("가격");
		
		dp1.add(dl1);
		dp1.add(dl2);
		dp1.add(dl3);
		
		JComboBox<String> dcb = new JComboBox<String>();
    
		for(int i = 0; i<numItems;i++)
		{
			dcb.addItem( String.valueOf(menu_num[i]) );
		}
		
		dp1.add(dcb);
		
		JTextField dt1 = new JTextField(10);
		JTextField dt2 = new JTextField(10);
				
		dp1.add(dt1);
		dp1.add(dt2);
	
		
		JButton btDialog = new JButton("확인");
		dp2.add(btDialog);
    
		dpanel.add(dp1);
		dpanel.add(dp2);
		
		editDialog.add(dpanel);
		
		m1_item1.addActionListener(new ActionListener()
    {
			@Override
			public void actionPerformed(ActionEvent e)
      {
        //JOptionPane.showMessageDialog(f, e.getActionCommand());
				editDialog.setVisible(true);
			}
		});
		
		btDialog.addActionListener(new ActionListener()
    {
			@Override
			public void actionPerformed(ActionEvent e)
      {
				int dcb_idx = dcb.getSelectedIndex();
				menu_title[dcb_idx] = dt1.getText();
				menu_price[dcb_idx] = Integer.parseInt(dt2.getText());
				
				FileWriter fw;
        
				try {
					fw = new FileWriter("c:\\Temp\\menu.txt");
					String out="";
					out = String.format("%d\r\n", numItems );
					fw.write(out);
					
					for(int i=0;i<numItems;i++)
					{
						out = String.format("%d %s %d\r\n",menu_num[i],menu_title[i], menu_price[i]);
						fw.write(out);
					}
					
					fw.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				editDialog.dispose();
			}
		});
    
		dcb.addItemListener(new ItemListener()
    {	
			@Override
			public void itemStateChanged(ItemEvent e)
      {
				int index = ((JComboBox<String>)dcb).getSelectedIndex();
				dt1.setText( menu_title[index]);
				dt2.setText( String.valueOf(menu_price[index]) );
			}
		});;
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
