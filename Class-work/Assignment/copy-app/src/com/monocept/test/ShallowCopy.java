package com.monocept.test;

import com.monocept.model.Copy;

public class ShallowCopy {
	
	public static void main(String[] args)
	{
		Copy obj1 = new Copy();
		obj1.a = 1;
		obj1.b = 2;
		
		Copy obj2 = obj1;
		obj2.a = 3;
		obj2.b = 4; 
		
		System.out.println("Values of obj1");
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println();
		
		System.out.println("Values of obj2");
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
	}

}
