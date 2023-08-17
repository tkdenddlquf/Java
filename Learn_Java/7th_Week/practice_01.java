package com.practice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
  {
		JFrame f = new JFrame("안녕안녕");
		
		//f.setTitle("안녕 나는 경권이야");
		f.setSize(400, 300);
		f.setLayout(new GridLayout(3,0));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
				
		JButton bt1 = new JButton("버튼1");
		p1.add(bt1);
	
		JButton bt2 = new JButton("버튼2");
		p1.add(bt2);

		JButton bt3 = new JButton("버튼2");
		bt3.setEnabled(false);
		bt3.setText("버튼3");
		p2.add(bt3);
		
		JLabel lb1 = new JLabel("안녕");
		p2.add(lb1);
		
		JTextField txtf1 = new JTextField(10); 
		p3.add(txtf1);
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setVisible(true);
    
		System.out.print(txtf1.getText());
	}
}
