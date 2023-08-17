package com.test;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class test
{
	public static void main(String[] args)
	{
		new FlowFrame();
	}
}

class FlowFrame extends JFrame
{
	FlowFrame()
	{
		setTitle("계산기");
		setLayout(new BorderLayout());

		JPanel fPanel = new JPanel(new FlowLayout());
		
		JTextField txtf1 = new JTextField(15); 
		fPanel.add(txtf1, BorderLayout.NORTH);

		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();
		
		JButton bton = new JButton("on");
		p2.add(bton);
		
		JButton btoff = new JButton("off");
		p2.add(btoff);
		
		JButton bt9 = new JButton("9");
		p3.add(bt9);
		
		JButton bt8 = new JButton("8");
		p3.add(bt8);
		
		JButton bt7 = new JButton("7");
		p3.add(bt7);
		
		JButton btadd = new JButton("+");
		p3.add(btadd);
		
		JButton bt4 = new JButton("4");
		p4.add(bt4);
		
		JButton bt5 = new JButton("5");
		p4.add(bt5);
		
		JButton bt6 = new JButton("6");
		p4.add(bt6);
		
		JButton btsub = new JButton("-");
		p4.add(btsub);
		
		JButton bt1 = new JButton("1");
		p5.add(bt1);
		
		JButton bt2 = new JButton("2");
		p5.add(bt2);
		
		JButton bt3 = new JButton("3");
		p5.add(bt3);
		
		JButton btmul = new JButton("X");
		p5.add(btmul);
		
		JButton bt0 = new JButton("0");
		p6.add(bt0);
		
		JButton btdot = new JButton(".");
		p6.add(btdot);
		
		JButton btequ = new JButton("=");
		p6.add(btequ);
		
		JButton btdiv = new JButton("/");
		p6.add(btdiv);
		
		fPanel.add(p2);
		fPanel.add(p3);
		fPanel.add(p4);
		fPanel.add(p5);
		fPanel.add(p6);
		
		add(fPanel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
	}
}
