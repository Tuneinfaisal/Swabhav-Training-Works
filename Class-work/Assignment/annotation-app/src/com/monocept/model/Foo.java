package com.monocept.model;

public class Foo {
	
//	public static void main(String[] args)
//	{
//		int a = 10;
//		int b = 5;
//		System.out.println(add(a,b));
//		System.out.println(substract(a,b));
//		System.out.println(multiply(a,b));
//		System.out.println(divide(a,b));
//		System.out.println(greatestNumber(a,b));
//	}
	
	@MyAnnotation
	public void add()
	{
		System.out.println("add");
	}
	
	@MyAnnotation
	public void substract()
	{
		System.out.println("Subs");
	}
	
	public void multiply()
	{
		System.out.println("Multiply");
	}
	
	@MyAnnotation
	public void divide()
	{
		System.out.println("Divide");
	}
	
//	public int greatestNumber(int a, int b)
//	{
//		if(a > b)
//		{
//			return a;
//		}
//		return b;
//	}

}
