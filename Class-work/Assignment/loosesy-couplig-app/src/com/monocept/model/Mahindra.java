package com.monocept.model;

public class Mahindra implements Car{

	@Override
	public void wheel()
	{
		System.out.println("Mahindra Wheel calling");
	}

	@Override
	public void door()
	{
		System.out.println("Mahindra Door calling");
	}

}
