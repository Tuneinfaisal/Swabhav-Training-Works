package com.monocept.subscriber;

import com.publisher.Account;

public class PubSubTest {
	
	public static void main(String[] args)
	{
		Account a = new Account(102,"Anu",50000);
		a.registerSubscribers(new TelegramNotifier());
		a.registerSubscribers(new EmailNotifier());
		
		System.out.println(a.getName());
		
		a.deposit(10000);
		a.withdraw(5000);
		
		System.out.println(a.getBalance());
	}

}
