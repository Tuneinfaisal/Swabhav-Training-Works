package com.monocept.basics;

public class Constructor {
	int num = 5;
	
	public Constructor()
	{
		System.out.println("Constructor is called");
	}
	
	public Constructor(int num)
	{
		this.num = num;
		System.out.println("Constructor is called");
	}
	
	public Constructor(double d)
	{
		num = (int) d;
		System.out.println("Constructor is called");
	}

}

// Rules of constructor
// 1st rule is it is of same name
// Constructor have no return type