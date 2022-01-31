package com.monocept.model;

public class Account {
	
	private int accno;
	private String name;
	private double balance;
	
	public Account(int pAccno, String pName, double pBalance)
	{
		accno = pAccno;
		name = pName;
		balance += pBalance;
	}
	
	public int getAcc()
	{
		return accno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void withdraw(double pWithdraw)
	{
		if((balance - pWithdraw) > 500d)
		{
			balance -= pWithdraw;
		}
	}

}
