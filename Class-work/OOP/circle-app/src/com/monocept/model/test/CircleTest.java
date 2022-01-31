package com.monocept.model.test;

import com.monocept.model.Circle;

public class CircleTest {
	public static void main(String[] args)
	{
		Circle solid = new Circle();
		solid.setRadius(2.2f);
		solid.setBorder("solid");
		printDetails(solid);
		
		Circle doule = new Circle();
		doule.setRadius(5.5f);
		doule.setBorder("double");
		printDetails(doule);
		
		Circle dotted = new Circle();
		dotted.setRadius(7.7f);
		dotted.setBorder("zyz");
		printDetails(dotted);

	}
	
	public static void printDetails(Circle circle) {
		System.out.println("Radius is = " + circle.getRadius());
		System.out.println("Border is = " + circle.getBorder());
		System.out.println("Area is = " + circle.calculateArea());
		System.out.println();
	}

}
