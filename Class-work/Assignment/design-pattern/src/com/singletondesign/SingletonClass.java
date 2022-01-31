package com.singletondesign;

public class SingletonClass {
	
	static SingletonClass sc = new SingletonClass();
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		return sc;
	}

}


// Rules for creating a singleton class
//1 -> Create a static instance
//2 -> Create a private constructor
//3 -> Create a static method which is getInstance or any suitable name
