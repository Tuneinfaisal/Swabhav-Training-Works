package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {
	
	public static void main(String[] args)
	{
		Account a1 = new Account("Faisal", 101);
		a1.withdraw(5000d);
		a1.deposit(20000d);
		printDetails(a1);
		
		Account a2 = new Account("Anu", 102);
		a2.withdraw(5000d);
		a2.deposit(30000d);
		printDetails(a2);
	}

	private static void printDetails(Account a)
	{
		System.out.println("Account holder name is : " + a.getName());
		System.out.println("Account number is : " + a.getAccno());
		System.out.println("Minimum account opening balance is : " + a.getBalance());
		System.out.println("--------------------\n");
		a.transactionDetails();
	}

}
