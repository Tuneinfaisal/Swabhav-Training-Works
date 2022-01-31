package com.decorator;

public class StandardHat implements Hat{

	@Override
	public String getName()
	{
		return "Standard hat";
	}

	@Override
	public int getPrice()
	{
		return 100;
	}

	@Override
	public String getDescription()
	{
		return "Basic standard hat";
	}

	

}
