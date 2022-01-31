package com.monocept.model;

public class Man implements IManner{

	@Override
	public void wish()
	{
		System.out.println("Man is wishing");
	}

	@Override
	public void depart()
	{
		System.out.println("Man is departing");
	}
	
	public void play()
	{
		System.out.println("Man is playing");
	}

}
