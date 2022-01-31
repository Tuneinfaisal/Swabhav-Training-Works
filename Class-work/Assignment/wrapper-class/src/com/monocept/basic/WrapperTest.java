package com.monocept.basic;

/**
 * 
 * @author Copyright by Faisal
 *
 */

public class WrapperTest {
	public static void main(String[] args)
	{
		int i1 = 123;
		System.out.println("Primitive data type i1 = " + i1);
		
		Integer i = new Integer(6);  //  Wrapper class
		System.out.println("Wrapper class i = " + i);
		
		Integer i2 = new Integer(i1); //  Boxing || Wrapping
		System.out.println("Boxing of i1 which is primitive type into object i2 = " + i2);
		
		int i3 = i2.intValue();  //  UnBoxing || UnWrapping
		System.out.println("Unboxing of i2 object into i3 primitive type = " + i3);
		
		Integer i4 = i1;  //  AutoBoxing || AutoWrapping
		System.out.println("Autoboxing of i1 which is primitive type into object i4 = " + i4);
		
		int i5 = i2;
		System.out.println("Autounboxing of i2 object into i5 primitive type = " + i5);
	
	}

}
