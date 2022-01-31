package com.monocept.basics;

public class AvoidingIfElseTest {
	
	public static void main(String[] args)
	{
		// Example 1 of nested if
		int a = 55;
		int b = 66;
		
//		if(a > 50)
//		{
//			if(b < 100)
//			{
//				System.out.println(a + b);
//			}
//		}
		
		if(a > 50 && b < 100)
		{
			System.out.println(a + b);
		}
//		
//		if(a > 50 || b < 100)
//		{
//			System.out.println(a + b);
//		}
		
		
		
		//Example 2 of nested else
//		int a = 55;
//		int b = 66;
//		
//		if(a < 50)
//		{
//			System.out.println(a + b);
//		}
//		
//		else
//		{
//			if(a < b)
//			{
//				System.out.println(b - a);
//			}
//		}
//		
//		else if(a < b)
//		{
//			System.out.println(b - a);
//		}
		
	}

}
