package com.monocept.model;

public class Account {
	private int accno;
	private String name = "";
	private double balance;
	
	public Account(int pAccno, String pName, double pBalance)
	{
		accno = pAccno;
		name = pName;
		balance += pBalance;
	}
	
	@Override
	public String toString()
	{
		return accno + " " + name + " " + balance + super.toString();
	}
	
	@Override
	public boolean equals(Object obj)
	{
		Account a = ((Account)obj);
		int accno = a.accno;
		String name = a.name;
		double balance = a.balance;
		return this.accno == accno && this.name == name && this.balance == balance;
	}
	
	public Account(int pAccno, String pName)
	{
		accno = pAccno;
		name = pName;
		balance = 500d;
	}
	public void deposit(double pBalance)
	{
		balance += pBalance;
	}
	
	public void withdraw(double pWithdraw)
	{
		if((balance - pWithdraw) > 500d)
		{
			balance -= pWithdraw;
		}
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
	
}
