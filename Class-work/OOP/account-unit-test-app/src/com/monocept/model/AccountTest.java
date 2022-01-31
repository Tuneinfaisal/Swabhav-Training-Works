package com.monocept.model;

public class AccountTest {
	
	public static void main(String[] args)
	{
		Account a1 = new Account(101, "Faisal", 10000d);
		a1.withdraw(5000);
		printDetails(a1);
	}
	
	public static void printDetails(Account a)
	{
		System.out.println("Account no. is = " + a.getAcc());
		System.out.println("Account holder name is = " + a.getName());
		System.out.println("Balance is = " + a.getBalance());
		System.out.println();
	}

}
