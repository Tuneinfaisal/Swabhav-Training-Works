package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountEqualityTest {
	
	public static void main(String[] args)
	{
		 Account a1 = new Account(100,"Faisal",5000);
		 Account a2 = new Account(100,"Faisal",5000);
		 Account a3 = new Account(101,"Ankit",500);
		 
		 System.out.println(a1 == a1);
		 System.out.println(a1 == a2);
		 System.out.println(a1 == a3);
		 
		 System.out.println();
		 
		 System.out.println(a1.equals(a1));
		 System.out.println(a1.equals(a2));
		 System.out.println(a1.equals(a3));
	}

}
