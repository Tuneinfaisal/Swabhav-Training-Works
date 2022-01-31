package com.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	ArrayList<INotifier> notify = new ArrayList<INotifier>();
//	private List<INotifier> subscribers;
	
	private int accno;
	private String name;
	private double balance;
	
	public Account(int accno, String name, double balance)
	{
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(double amt)
	{
		this.balance += amt;
		notify("Deposit successfully");
	}
	
	public void withdraw(double amt)
	{
		if(amt < this.balance)
		{
			this.balance -= amt;
		}
		notify("withdraw successfully");
	}
	
	public void registerSubscribers(INotifier n)
	{
		notify.add(n);
	}
	
	public void notify(String msg)
	{
		for(INotifier i : notify)
		{
			i.sendNotification(msg);
		}
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

}
