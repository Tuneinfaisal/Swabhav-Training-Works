package com.monocept.model.test;

import com.monocept.model.ColourOptoin;
import com.monocept.model.Rctangle;

public class RectangleTest {
	public static void main(String[] args)
	{
		Rctangle r = new Rctangle();
		r.setWidth(5);
		r.setHeight(10);
		r.setColour(ColourOptoin.GREEN);
		printDetails(r);
		
	}
	public static void printDetails(Rctangle r) {
		System.out.println("Width = " + r.getWidth());
		System.out.println("Height = " + r.getHeight());
		System.out.println("Colour is = " + r.getColour());
		System.out.println("Area is = " + r.calculateArea());
		System.out.println();
	}
}
