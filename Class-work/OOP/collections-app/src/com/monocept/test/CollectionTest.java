package com.monocept.test;

import java.util.ArrayList;

import com.monocept.model.LineItem;

public class CollectionTest {
	
	public static void main(String[] args)
	{
		ArrayList basket = new ArrayList();
		
		basket.add(new LineItem(101,"mobile phone",10000,4));
		basket.add(new LineItem(102,"Laptop",50000,2));
//		basket.add(new LineItem("Smart Phone"));
				
		for(Object element : basket)
		{
			LineItem item = (LineItem) element;
			item.totalPrice();
			System.out.println("Total cart price is " + item.getPrice());
		}
	}

}
