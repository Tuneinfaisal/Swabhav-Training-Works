package com.monocept.basic;
import java.util.Scanner;
public class ArrayTest {
	
	Scanner sc = new Scanner(System.in);
	
	public void intArray()
	{
		int n = 5;
		int a[] = new int[n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Elements you entered");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("Single element from Array");
		System.out.println(a[0]);
		
		a[0] = 9;
		a[1] = 8;
		a[2] = 7;
		a[3] = 6;
		a[4] = 5;
		
		System.out.println("Updated elements");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
	public void stringArray()
	{
		int n = 5;
		String s[] = new String[n];
		
		System.out.println("Enter string elements");
		for(int i=0;i<n;i++)
		{
			s[i] = sc.next();
		}
		
		System.out.println("Elements you entered");
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
		
		System.out.println("Single element from Array");
		System.out.println(s[0]);
		
		s[0] = "This";
		s[1] = "is";
		s[2] = "a";
		s[3] = "edited";
		s[4] = "string";
		
		System.out.println("Updated elements");
		for(int i=0;i<n;i++)
		{
			System.out.print(s[i] + " ");
		}

	}
	
	public static void main(String[] args)
	{
		ArrayTest Arr = new ArrayTest();
		Arr.intArray();
		Arr.stringArray();
	}

}
