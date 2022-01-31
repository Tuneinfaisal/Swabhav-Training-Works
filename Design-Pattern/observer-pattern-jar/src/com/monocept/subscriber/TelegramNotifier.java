package com.monocept.subscriber;

import com.publisher.INotifier;

public class TelegramNotifier implements INotifier{

	@Override
	public void sendNotification(String msg)
	{
		System.out.println("Telegram notifier : Balance is updated");
		System.out.println(msg);
	}

}
