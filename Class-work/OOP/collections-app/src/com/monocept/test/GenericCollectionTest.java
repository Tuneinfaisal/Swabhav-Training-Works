package com.monocept.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class GenericCollectionTest {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> basket = new ArrayList<Integer>();
		basket.add(200);
//		basket.add("Hello");
		
		for(Object element : basket)
		{
			LineItem item = (LineItem) element;
			System.out.println("Total cart price is " + item.getPrice());
		}
	}

}
