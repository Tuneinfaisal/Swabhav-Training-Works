package com.monocept.model;

public class Woman implements IManner,IEmotion{

	@Override
	public void cry()
	{
		System.out.println("Woman cries");
	}

	@Override
	public void laugh()
	{
		System.out.println("Woman laughs");
	}

	@Override
	public void wish()
	{
		System.out.println("Woman wishes");
	}

	@Override
	public void depart()
	{
		System.out.println("Woman departs");
	}

}
