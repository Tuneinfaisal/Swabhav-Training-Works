package com.monocept.item;

import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
	public void addItem(Item i)
	{
		items.add(i);
	}
	
	public void removeItem(Item it)
	{
		for(Item i : items)
		{
			if(i == it)
			{
				items.remove(i);
			}
		}
	}
	
	public void totalPrice()
	{

	}

}
