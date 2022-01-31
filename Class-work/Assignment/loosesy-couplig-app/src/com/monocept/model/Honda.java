package com.monocept.model;

public class Honda implements Car{

	@Override
	public void wheel()
	{
		System.out.println("Honda Wheel calling");
	}

	@Override
	public void door()
	{
		System.out.println("Honda Door calling");
	}

}
