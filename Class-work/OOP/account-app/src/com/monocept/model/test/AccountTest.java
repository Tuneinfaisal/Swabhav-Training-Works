package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args)
	{
		Account a1 = new Account(100, "Faisal", 1000d);
		a1.deposit(5000d);
		a1.withdraw(4000);
		printDetails(a1);
		
		Account a2 = new Account(101, "Rohit");
		printDetails(a2);
	}
	
	public static void printDetails(Account a)
	{
		System.out.println("Account no. is = " + a.getAcc());
		System.out.println("Account holder name is = " + a.getName());
		System.out.println("Balance is = " + a.getBalance());
		System.out.println();
	}

}