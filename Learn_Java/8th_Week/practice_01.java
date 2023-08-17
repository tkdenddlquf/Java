package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class test
{
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
		
		JFrame f = new JFrame("자판기");
		f.setLayout(new BorderLayout());
		f.setSize(500, 800);

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
				bt[i].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e)
          {
						String str = e.getActionCommand();
						str = str + "를 고르셨습니다.";
						JOptionPane.showMessageDialog(f, str);
					}
				});
			}
			else
			{
				bt[i] = new JButton("");
			}
			cPanel.add(bt[i]);
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
		JTextField t2 = new JTextField(15);
    
		sp2.add(l3);
		sp2.add(t2);
		sPanel.add(sp1);
		sPanel.add(sp2);

		f.add(sPanel,BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
