package com.monocept;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener{
	
	static JFrame frame = new JFrame("Faisal");
	static JButton loginButton = new JButton("Login");
	static JTextField userIdField = new JTextField();
	static JTextField userPassField = new JTextField();
	static JLabel userIdLabel = new JLabel("userId:");
	static JLabel userPassLabel = new JLabel("Password:");
	
	public static void main(String[] args)
	{	
		userIdLabel.setBounds(50,100,75,25);
		userPassLabel.setBounds(50,150,75,25);
		
		userIdField.setBounds(125,100,200,25);
		userPassField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,250,100,25);
		loginButton.setFocusable(false);
		
		frame.add(userIdLabel);
		frame.add(userPassLabel);
		frame.add(userIdField);
		frame.add(userPassField);
		frame.add(loginButton);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String id = userIdField.getText();
		String password = userPassField.getText();
		
		if((id == "faisal") && (password == "123"))
		{
			System.out.println("Logged in");
		}
		else
		{
			System.out.println("Invalid credentials");
		}
	}

}
