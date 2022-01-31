package com.monocept;

public class Stock {
	
	private String name;
	private int price;
	
	public Stock(String name, int price)
	{
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int num)
	{
		this.price = num;
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}

}
