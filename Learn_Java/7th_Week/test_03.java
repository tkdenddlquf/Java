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
		new GridFrame_2();
	}
}

class GridFrame_2 extends JFrame
{
	GridFrame_2()
	{
		setTitle("계산기");
		setLayout(new BorderLayout());
		
		// North
		JPanel nPanel = new JPanel();
		
		JTextField txtf1 = new JTextField(15); 
		
		nPanel.add(txtf1);
		add(nPanel, BorderLayout.NORTH);
		
		// South
		JPanel sPanel = new JPanel(new GridLayout(1, 0));
		JPanel subPanel = new JPanel(new GridLayout(4, 4, 10, 10));
		JPanel sp1 = new JPanel();
		
		JButton bton = new JButton("on");
		JButton btoff = new JButton("off");
		
		JButton bt9 = new JButton("9");
		JButton bt8 = new JButton("8");
		JButton bt7 = new JButton("7");
		JButton btadd = new JButton("+");
		
		JButton bt4 = new JButton("4");
		JButton bt5 = new JButton("5");
		JButton bt6 = new JButton("6");
		JButton btsub = new JButton("-");
		
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton btmul = new JButton("X");
		
		JButton bt0 = new JButton("0");
		JButton btdot = new JButton(".");
		JButton btequ = new JButton("=");
		JButton btdiv = new JButton("/");
		
		sp1.add(bton);
		sp1.add(btoff);
		
		subPanel.add(bt9);
		subPanel.add(bt8);
		subPanel.add(bt7);
		subPanel.add(btadd);
		
		subPanel.add(bt4);
		subPanel.add(bt5);
		subPanel.add(bt6);
		subPanel.add(btsub);
		
		subPanel.add(bt1);
		subPanel.add(bt2);
		subPanel.add(bt3);
		subPanel.add(btmul);
		
		subPanel.add(bt0);
		subPanel.add(btdot);
		subPanel.add(btequ);
		subPanel.add(btdiv);
		
		sp1.add(subPanel);
		sPanel.add(sp1);
		
		add(sPanel, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 300);
		setVisible(true);
	}
}
