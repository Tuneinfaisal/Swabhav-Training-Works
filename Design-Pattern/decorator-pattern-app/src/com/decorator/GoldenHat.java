package com.decorator;

public class GoldenHat extends HatDecorator{

	public GoldenHat(Hat hat)
	{
		super(hat);
	}

	@Override
	public String getName()
	{
		return "Golden hat";
	}

	@Override
	public int getPrice()
	{
		return 500;
	}

}
