package com.monocept.com;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TicTacToeButton implements ActionListener{
	
	static JFrame frame = new JFrame("Tic Tac Toe game");
	static JLabel label = new JLabel("Hello");
	static JButton button1 = new JButton("1");
	static JButton button2 = new JButton("2");
	static JButton button3 = new JButton("3");
	static JButton button4 = new JButton("4");
	static JButton button5 = new JButton("5");
	static JButton button6 = new JButton("6");
	static JButton button7 = new JButton("7");
	static JButton button8 = new JButton("8");
	static JButton button9 = new JButton("9");
	
	public static void main(String[] args)
	{
		button1.setBounds(100,100,100,100);
		button2.setBounds(200,100,100,100);
		button3.setBounds(300,100,100,100);
		
		button4.setBounds(100,200,100,100);
		button5.setBounds(200,200,100,100);
		button6.setBounds(300,200,100,100);
		
		button7.setBounds(100,300,100,100);
		button8.setBounds(200,300,100,100);
		button9.setBounds(300,300,100,100);
		
		label.setBounds(50,50,250,35);
		
		frame.add(label);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9);
		
		frame.setSize(520,520);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button1)
		{
			
		}
	}

}
