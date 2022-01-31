package com.monocept.test;

public class RunTimeExceptionTest {
	
	public static void main(String[] args)
	{
		try
		{
			m1();
		}
		
		catch (RuntimeException ex)
		{
			System.out.println(ex.getMessage());
//			ex.printStackTrace();
		}
		
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
//			ex.printStackTrace();
		}
		
		System.out.println("End of main");
	}
	
	public static void m1() throws Exception
	{
		System.out.println("In m1");
		m2();
	}
	
	public static void m2() throws Exception
	{
		System.out.println("In m2");
		m3();
	}
	
	public static void m3() throws Exception
	{
		System.out.println("In m3");
		throw new RuntimeException("Problem"); //Unchecked
	}

}
