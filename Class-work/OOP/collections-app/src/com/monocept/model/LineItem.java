package com.monocept.model;

public class LineItem {
	
	private int id;
	private String product;
	private double price;
	private int quantity;
	
	public LineItem(int id, String product, double price, int quantity)
	{
		this.id = id;
		this.product = product;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void totalPrice()
	{
		this.price *= this.quantity;
//		price = price * quantity;
	}
	
	public double getPrice()
	{
		return price;
	}

}
