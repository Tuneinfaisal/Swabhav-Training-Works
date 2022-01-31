package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class PolymorphismTest {
	
	public static void main(String[] args)
	{
		SavingsAccount sa = new SavingsAccount(101, "Faisal", 50000d);
		printDetails(sa);
		
		CurrentAccount ca = new CurrentAccount(102, "Anu", 30000d);
		printDetails(ca);
		
		sa.withdraw(30000);
		System.out.println(sa.getBalance());
		System.out.println();
		
		ca.withdraw(40000);
		System.out.println(ca.getBalance());
	}

	private static void printDetails(Account sa)
	{
		System.out.println(sa.getAccno());
		System.out.println(sa.getName());
		System.out.println(sa.getBalance());
		System.out.println();
	}

}
