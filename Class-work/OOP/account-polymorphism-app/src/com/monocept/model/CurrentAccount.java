package com.monocept.model;

public class CurrentAccount extends Account {
	
	public final double OVERDRAFT_LIMIT = 10000d;
	
	public CurrentAccount(int accno, String name, double balance)
	{
		super(accno, name, balance);
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(amount <= balance + OVERDRAFT_LIMIT)
		{
			balance -= amount;
		}
		else
		{
			System.out.println("Withdraw overdraft limit exceeded.");
		}
	}

}
