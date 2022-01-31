package com.monocept.model.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		small.setWidth(10);
		small.setHeight(40);
		printDetails(small);

		Rectangle big = new Rectangle();
		big.setWidth(101);
		big.setHeight(500);
		printDetails(big);

		Rectangle medium = new Rectangle();
		medium.setWidth(50);
		medium.setHeight(400);
		printDetails(medium);
	}

	public static void printDetails(Rectangle r) {
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
//		System.out.println("Area is = " + r.calculateArea());
	}

}
