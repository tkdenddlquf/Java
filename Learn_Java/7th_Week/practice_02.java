package com.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
  {
		JFrame f = new JFrame("원넓이 구하기");
		
		f.setLayout(new BorderLayout());
		f.setSize(300, 300);
		
		//north
		JPanel nPanel = new JPanel(new GridLayout(2,0));
		JPanel np1 = new JPanel();
		JPanel np2 = new JPanel();
		
		JLabel l1 = new JLabel("원의 반지름");
		JTextField t1 = new JTextField(10);
		
		JLabel l2 = new JLabel("원의 넓이");
		JTextField t2 = new JTextField(10);
		
		np1.add(l1);
		np1.add(t1);
		np2.add(l2);
		np2.add(t2);
		
		nPanel.add(np1);
		nPanel.add(np2);
		
		f.add(nPanel, BorderLayout.NORTH);

		//center
		JPanel cPanel = new JPanel();
		JTextArea area = new JTextArea(30,20);
		area.setText("여기는 원 넓이를 \n계산하는 과정이 나타닙니다.");
		area.setEditable(false);
		area.setBackground(Color.RED);

		cPanel.add(area);
		f.add(cPanel, BorderLayout.CENTER);
		
		
		//south
		String[] color = {"red", "blue"};
		JPanel sPanel = new JPanel(new FlowLayout());
		
		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<String>(color);
		JButton reset = new JButton("리셋");
		
		sPanel.add(cal);
		sPanel.add(cb);
		sPanel.add(reset);
		
		f.add(sPanel, BorderLayout.SOUTH);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
