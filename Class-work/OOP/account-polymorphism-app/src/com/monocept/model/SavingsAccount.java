package com.monocept.model;

public class SavingsAccount extends Account {
	
	public SavingsAccount(int accno, String name, double balance)
	{
		super(accno, name, balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("The amount you enter exceeds the balance limit.");
		}
	}
}
