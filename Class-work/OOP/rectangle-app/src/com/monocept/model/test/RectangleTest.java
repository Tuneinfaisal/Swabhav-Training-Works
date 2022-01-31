package com.monocept.model.test;
import com.monocept.model.Rectangle;
public class RectangleTest {
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle();
		r1.height = 100;
		r1.width = 50;
		printDetails(r1);
		System.out.println(r1.hashCode());
		
		Rectangle r2 = new Rectangle();
		r2.height = 10;
		r2.width = 5;
		printDetails(r2);
		System.out.println(r2.hashCode());
		
		Rectangle r3 = r1;
		r3.width = 200;
		System.out.println("r3 width is = " + r3.width);
		System.out.println("r1 width is = " + r1.width);
		System.out.println(r3.hashCode());
		
		r1= null;
		System.out.println("r3 width = " + r2.width);
		System.out.println("r3 width = " + r1.width);
		
	}
	
	public static void printDetails(Rectangle r)
	{
		System.out.println("Height = " + r.height);
		System.out.println("Width = " + r.width);
		System.out.println("Area = " + r.calculateArea());
		System.out.println("Hash code is = " + r.hashCode());
	}

}