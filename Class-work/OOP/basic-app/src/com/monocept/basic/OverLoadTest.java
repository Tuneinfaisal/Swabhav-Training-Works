package com.monocept.basic;

public class OverLoadTest {
	public static void main(String args[])
	{
		printInfo("Hello");
		printInfo('H');
		printInfo(10);
		printInfo(10.10d);
		printInfo(10.10f);
	}
	public static void printInfo(String value)
	{
		System.out.println("Overload #1");
		System.out.println(value);
	}
	
	public static void printInfo(int value)
	{
		System.out.println("Overload #2");
		System.out.println(value);
	}
	
	public static void printInfo(char value)
	{
		System.out.println("Overload #3");
		System.out.println(value);
	}
	
	public static void printInfo(float value)
	{
		System.out.println("Overload #4");
		System.out.println(value);
	}
	
	public static void printInfo(double value)
	{
		System.out.println("Overload #5");
		System.out.println(value);
	}

}
