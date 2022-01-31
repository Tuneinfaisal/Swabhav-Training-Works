package com.monocept.model;

public class Tata implements Car{
	
	@Override
	public void wheel()
	{
		System.out.println("Tata Wheel calling");
	}

	@Override
	public void door()
	{
		System.out.println("Tata Door calling");
	}

}
