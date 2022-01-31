package com.singletondesign.test;

import com.singletondesign.SingletonClass;

public class SingletonClassTest {
	
	public static void main(String[] args)
	{
		SingletonClass sc1 = SingletonClass.getInstance();
		SingletonClass sc2 = SingletonClass.getInstance();
	}

}
