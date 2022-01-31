package com.monocept.model;

import javax.management.RuntimeErrorException;

public class Account {
	
	private int accno;
	private String name;
	private double balance;
	
	public Account(int accno, String name, double balance)
	{
		this.accno = accno;
		this.name = name;
		this.balance = balance;
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
	
	public void withdraw(double balance)
	{
		if(balance <= this.balance)
		{
			this.balance -= balance;
		}
		else
		{
			throw new Exception("Account no. " + this.accno + " Exceeds the limit");
		}
		
	}

}
