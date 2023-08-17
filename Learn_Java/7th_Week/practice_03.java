package com.practice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class test
{
	public static void main(String[] args)
  {
		JFrame f = new JFrame("원넓이 구하기");
		
		f.setLayout(new BorderLayout());
		f.setSize(300, 400);
		
		//north
		JPanel nPanel = new JPanel(new GridLayout(3,0));
		JPanel np1 = new JPanel();
		JPanel np2 = new JPanel();
		JPanel np3 = new JPanel();
		
		JLabel l1 = new JLabel("원의 반지름");
		JTextField t1 = new JTextField(10);
		
		JLabel l2 = new JLabel("원의 넓이");
		JTextField t2 = new JTextField(10);
		
		JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
		bar.setValues(50, 10, 0, 100);
				
		np1.add(l1);
		np1.add(t1);
		np2.add(l2);
		np2.add(t2);
		
		np3.add(bar);
		
		nPanel.add(np1);
		nPanel.add(np2);
		nPanel.add(np3);
		
		f.add(nPanel, BorderLayout.NORTH);

		//center
		JPanel cPanel = new JPanel();
		JTextArea area = new JTextArea(30,20);
		area.setText("여기는 원 넓이를 \n계산하는 과정이 나타닙니다.");
		area.setEditable(false);
		area.setBackground(Color.LIGHT_GRAY);

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

		cal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
      {
				String str = t1.getText();
				
				if(str.equals("") == true)
				{
					// error 
					area.setText("반지름을 입력해주세요");
					JOptionPane.showMessageDialog(f, "반지름을 입력해주세요");
				}
				else
				{
					int r;
					r = Integer.parseInt(str);
					double s;
					s = 3.14*r*r;
					str = String.format("%5.3f", s);
					t2.setText(str);	
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
      {
				t1.setText("");
				t2.setText("");
				area.setText("");
			}
		});

		cb.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e)
      {
				int index = ((JComboBox<String>)cb).getSelectedIndex();
        
				if(index == 0)
				{
					area.setForeground(Color.RED);
				}
				else if(index == 1)
				{
					area.setForeground(Color.BLUE);
				}
			}
		});
		
		
		f.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e)
      {
			}
			
			@Override
			public void mousePressed(MouseEvent e)
      {
			}
			
			@Override
			public void mouseExited(MouseEvent e)
      {
			}
			
			@Override
			public void mouseEntered(MouseEvent e)
      {
			}
			
			@Override
			public void mouseClicked(MouseEvent e)
      {
				System.out.println("마우스 클릭");
			}
		});
		
		f.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e)
      {
				System.out.println("마우스이동("+e.getX()+","+e.getY()+")");
			}
			
			@Override
			public void mouseDragged(MouseEvent e)
      {
			}
		});
		
		
		bar.addAdjustmentListener(new AdjustmentListener() {
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e)
      {
				int v = e.getValue();
				t1.setText(String.valueOf(v));
			}
		});
	}
}
