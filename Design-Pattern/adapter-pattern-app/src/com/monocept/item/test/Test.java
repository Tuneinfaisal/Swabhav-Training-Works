package com.monocept.item.test;

import com.monocept.item.HatAdapter;
import com.monocept.item.ShoppingCart;

import hat.model.Hat;

public class Test {
	
	public static void main(String[] args) throws Exception
	{
		ShoppingCart cart = new ShoppingCart();
		cart.addItem(new HatAdapter(new Hat("bread","garlic bread",10, 8)));
		
		HatAdapter h = new HatAdapter(new Hat("milk", "tonned milk", 20, 8));
		h.totalPrice();
		System.out.println(h.itemName());
		System.out.println(h.itemPrice());
	}

}
