package com.monocept.test;

import com.monocept.model.Clone;

public class CloneTest {
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Clone obj1 = new Clone();
		obj1.a = 1;
		obj1.b = 2;
		
		Clone obj2 = (Clone)obj1.clone();
		obj2.a = 3;
		
		System.out.println("Values of obj1");
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println();
		
		System.out.println("Values of obj2");
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
	}

}
