package com.monocept.basic;

public class LoopTest {
	public void forLoop()
	{
		int n = 5;
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
	}
	
	public void whileLoop()
	{
		int n = 5;
		int i = 0;
		while(i<5)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void doWhileLoop()
	{
		int n = 5;
		int i = 0;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<5);
	}
	
	public static void main(String[] args)
	{
		LoopTest Lt = new LoopTest();
		Lt.forLoop();
		Lt.whileLoop();
		Lt.doWhileLoop();
	}

}
