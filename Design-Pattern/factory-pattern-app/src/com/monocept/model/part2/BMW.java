package com.monocept.model.part2;

public class BMW implements IAutomobile{

	@Override
	public void start()
	{
		System.out.println("BMW is starting");
	}

	@Override
	public void stop()
	{
		System.out.println("BMW is stoping");
	}

}
