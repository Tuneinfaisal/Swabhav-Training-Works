package com.monocept.model.part1;

public class Audi implements IAutomobile {

	@Override
	public void start()
	{
		System.out.println("Audi is starting");
	}

	@Override
	public void stop()
	{
		System.out.println("Audi is stopping");
	}

}
