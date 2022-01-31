package com.monocept.model;

public class Product {
	
	private int id;
	private String name;
	private int price;
	private int discount;
	
	public Product(int id, String name, int price)
	{
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void costAfterDiscount(int amount)
	{
		if(amount < this.price)
		{
			this.discount = this.price - amount;
		}
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public int getDiscount()
	{
		return discount;
	}

}

