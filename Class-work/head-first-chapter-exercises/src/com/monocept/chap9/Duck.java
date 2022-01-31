package com.monocept.chap9;

public class Duck {
	int size = -1;

	public Duck(int duckSize)
	{
		System.out.println("Quack");
		size = duckSize;
		System.out.println("size is " + size);
	}
	
	public Duck()
	{
		System.out.println("Quack");
		System.out.println("Size is " + size);
	}

}
