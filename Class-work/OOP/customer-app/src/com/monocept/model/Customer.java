package com.monocept.model;

public class Customer {
	private int id;
	private String name;
	private static int count = 0;
	
	public Customer(String name)
	{
		this.name = name;
		this.id = 100 + count;
		this.count++;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
}
