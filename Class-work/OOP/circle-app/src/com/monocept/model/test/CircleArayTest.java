package com.monocept.model.test;

import com.monocept.model.Circle;

public class CircleArayTest {
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle();
		c1.setRadius(2.2f);
		
		Circle c2 = new Circle();
		c2.setRadius(3.3f);
		
		Circle[] manyC = new Circle[3];
		manyC[0] = c1;
		manyC[1] = c2;
		manyC[2] = new Circle();
		
		for(Circle items : manyC)
		{
			printDetails(items);
		}
	}
	
	public static void printDetails(Circle circle)
	{
		System.out.println("Radius is = " + circle.getRadius());
		System.out.println("Border is = " + circle.getBorder());
		System.out.println("Area is = " + circle.calculateArea());
		System.out.println();
	}

}