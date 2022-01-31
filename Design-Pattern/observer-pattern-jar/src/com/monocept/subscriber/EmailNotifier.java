package com.monocept.subscriber;

import com.publisher.INotifier;

public class EmailNotifier implements INotifier{

	@Override
	public void sendNotification(String msg)
	{
		System.out.println("Email notifier : Balance is updated");
		System.out.println(msg);
	}

}
