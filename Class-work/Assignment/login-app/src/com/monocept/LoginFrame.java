package com.monocept;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame implements ActionListener{
	
	JFrame frame = new JFrame("Login");
	JButton loginButton = new JButton("Login");
	JButton resetButton = new JButton("Reset");
	JTextField userIdField = new JTextField();
	JPasswordField userPassField = new JPasswordField();
	JLabel userIdLabel = new JLabel("userId");
	JLabel userPassLabel = new JLabel("password");
	JLabel messageLabel = new JLabel();
	HashMap<String,String> loginInfo = new HashMap<String,String>();

	public LoginFrame(HashMap<String,String> loginInfo)
	{
		this.loginInfo = loginInfo;
		
		userIdLabel.setBounds(50,100,75,25);
		userPassLabel.setBounds(50,150,75,25);
		
		userIdField.setBounds(125,100,200,25);
		userPassField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,100,25);
		loginButton.addActionListener(this);
		loginButton.setFocusable(false);
		
		resetButton.setBounds(225,200,100,25);
		resetButton.addActionListener(this);
		resetButton.setFocusable(false);
		
		messageLabel.setBounds(125,250,250,35);
		messageLabel.setFont(new Font(null,Font.BOLD,25));
		
		frame.add(userIdLabel);
		frame.add(userPassLabel);
		frame.add(userIdField);
		frame.add(userPassField);
		frame.add(loginButton);
		frame.add(resetButton);
		frame.add(messageLabel);
		
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == resetButton)
		{
			userIdField.setText("");
			userPassField.setText("");
		}
		
		if(e.getSource() == loginButton)
		{
			String userId = userIdField.getText();
			String password = String.valueOf(userPassField.getPassword());
			
			if(loginInfo.containsKey(userId))
			{
				if(loginInfo.get(userId).equals(password))
				{
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login successful :)");
					System.out.println("Login successful :)");
//					frame.dispose();
					WelcomeFrame wf = new WelcomeFrame(userId);
				}
				else
				{
					messageLabel.setForeground(Color.red);
					messageLabel.setText("Wong password !");
					System.out.println("Wong password !");
				}
			}
			else
			{
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Username not found");
				System.out.println("Username not found");
			}
		}
	}

}
