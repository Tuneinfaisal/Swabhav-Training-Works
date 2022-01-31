package com.decorator;

public class RibbonHat extends HatDecorator{

	public RibbonHat(Hat hat)
	{
		super(hat);
	}
	
	@Override
	public String getName()
	{
		return "Ribbon hat";
	}

	@Override
	public int getPrice()
	{
		return 400;
	}

}
