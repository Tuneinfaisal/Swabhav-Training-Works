package com.dip.solution;

public class EmailLogger implements ILogger{

	@Override
	public void log(String msg)
	{
		System.out.println("EmailLogger");
	}

}
