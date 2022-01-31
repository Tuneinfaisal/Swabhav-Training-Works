package com.monocept.model;

import java.util.Date;

public class Account {
	
	private String name;
	private int accno;
	private final double initialBalance = 10000d;
	private double balance;
	private double withdrawalAmount;
	private double depositAmount;
	
	public Account(String name, int empno)
	{
		this.name = name;
		this.accno = empno;
	}
	
	public void withdraw(double withdrawalaAount)
	{
		balance = initialBalance;
		this.withdrawalAmount = withdrawalaAount;
		if(withdrawalAmount < this.balance)
		{
			this.balance -= withdrawalAmount;
		}
	}
	
	public void deposit(double depositAmount)
	{
		this.depositAmount = depositAmount;
		this.balance += depositAmount;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAccno()
	{
		return accno;
	}
	
	public double getBalance()
	{
		return initialBalance;
	}
	
	public void transactionDetails()
	{
		Date date = new Date();
		System.out.println("Transaction details of " + getName() + " :-\n");
		System.out.println("Date and time - " + date);
		System.out.println("Initial balance is : " + this.initialBalance);
		System.out.println("Deposit amount is : " + this.depositAmount);
		System.out.println("Withdrawal amount is : " + this.withdrawalAmount);
		System.out.println("Total available balance is : " + this.balance);
		System.out.println("*********************************************\n");
		System.out.println();
	}
	
}
