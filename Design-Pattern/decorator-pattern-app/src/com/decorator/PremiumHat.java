package com.decorator;

public class PremiumHat implements Hat{

	@Override
	public String getName()
	{
		return "Premium hat";
	}

	@Override
	public int getPrice()
	{
		return 200;
	}

	@Override
	public String getDescription()
	{
		return "Best premium hat";
	}

}
