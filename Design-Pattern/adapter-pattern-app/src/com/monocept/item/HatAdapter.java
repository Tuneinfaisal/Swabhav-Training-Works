package com.monocept.item;

import hat.model.Hat;

public class HatAdapter implements Item{
	
	private Hat hat;
	
	public HatAdapter(Hat hat)
	{
		this.hat = hat;
	}
	
	public void totalPrice()
	{
		hat.calculateGst();
	}

	@Override
	public String itemName()
	{
		return hat.getLongName();
	}

	@Override
	public double itemPrice()
	{
		return hat.getBasePrice();
	}

}
