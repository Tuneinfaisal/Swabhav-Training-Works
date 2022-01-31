package com.subscriber;

import com.publisher.INotifier;

public class SmsNotifier implements INotifier{

	@Override
	public void sendNotification(String msg)
	{
		System.out.println("Sms notifier : balance is updated");
		System.out.println(msg);
	}

}
