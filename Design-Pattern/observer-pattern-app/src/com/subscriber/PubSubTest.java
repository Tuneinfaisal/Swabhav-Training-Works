package com.subscriber;

import com.publisher.Account;

public class PubSubTest {
	
	public static void main(String[] args)
	{
		Account a1 = new Account(101,"Faisal", 10000);
		a1.registerSubscribers(new WhatsappNotifier());
		a1.registerSubscribers(new SmsNotifier());
		
		System.out.println(a1.getName());
		
		a1.deposit(5000);
		a1.withdraw(1000);
	}

}
