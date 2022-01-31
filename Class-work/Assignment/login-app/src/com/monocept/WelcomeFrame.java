package com.monocept;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame {
	
	JFrame frame = new JFrame("Welcome");
	JLabel welcomeLabel = new JLabel("Hello");
	
	public WelcomeFrame(String userId)
	{
		welcomeLabel.setText("Welcome " + userId);
		welcomeLabel.setBounds(100,150,200,35);
		welcomeLabel.setFont(new Font(null,Font.PLAIN,25));
		
		frame.add(welcomeLabel);
		
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
