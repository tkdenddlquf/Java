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

public class test
{
	public static void main(String[] args)
  {
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
		JButton bt1 = new JButton("메뉴1");
		JButton bt2 = new JButton("메뉴2");
		JButton bt3 = new JButton("메뉴3");
		JButton bt4 = new JButton("메뉴4");
		JButton bt5 = new JButton("메뉴5");
		JButton bt6 = new JButton("메뉴6");
		JButton bt7 = new JButton("메뉴7");
		JButton bt8 = new JButton("메뉴8");
		JButton bt9 = new JButton("메뉴9");
    
  	cPanel.add(bt1);
  	cPanel.add(bt2);
  	cPanel.add(bt3);
  	cPanel.add(bt4);
  	cPanel.add(bt5);
  	cPanel.add(bt6);
  	cPanel.add(bt7);
  	cPanel.add(bt8);
  	cPanel.add(bt9);
  	
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
