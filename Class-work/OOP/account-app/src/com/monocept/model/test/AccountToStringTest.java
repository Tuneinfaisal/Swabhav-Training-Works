package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountToStringTest {
	public static void main(String[] args)
	{
		Account a1 = new Account(1001,"Faisal",5000d);
		System.out.println(a1);
		System.out.println(a1.toString());
	}

}