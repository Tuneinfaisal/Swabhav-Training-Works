package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {
	
	public static void main(String[] args)
	{
		Account a1 = new Account(101, "Faisal", 500d);
		
		try
		{
			a1.withdraw(400);
		}
		catch (RuntimeException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			printDetails(a1);
		}
	}

	private static void printDetails(Account a)
	{
		System.out.println("Accno = " + a.getAccno());
		System.out.println("Name = " + a.getName());
		System.out.println("Balance = " + a.getBalance());
	}

}
