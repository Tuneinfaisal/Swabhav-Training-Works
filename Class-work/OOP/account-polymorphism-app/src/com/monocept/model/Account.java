package com.monocept.model;

public abstract class Account {
	
	protected int accno;
	protected String name;
	protected double balance;
	
	public Account(int accno, String name, double balance)
	{
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public void deptsit(double amount)
	{
		this.balance += amount;
	}
	
	public int getAccno()
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

	public abstract void withdraw(double amount);

}
