package com.monocept.chap7;

public class InheritanceDemo {
	public static void main(String[] args)
	{
		CalculatorPro c = new CalculatorPro();
		int result = c.add(8,9);
		int result2 = c.sub(8,4);
		
		System.out.println(result);
		System.out.println(result2);
	}

}

class Calculator //super class
{
	public int add(int a, int b)
	{
		return a+b;
	}
}

class CalculatorPro extends Calculator  //sub class
{	
	public int sub(int a, int b)
	{
		return a-b;
	}
}
