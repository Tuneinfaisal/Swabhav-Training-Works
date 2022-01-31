package com.subscriber;

import com.publisher.INotifier;

public class WhatsappNotifier implements INotifier{

	@Override
	public void sendNotification(String msg)
	{
		System.out.println("Whatsapp notifier : balance is updated");
		System.out.println(msg);
	}

}
