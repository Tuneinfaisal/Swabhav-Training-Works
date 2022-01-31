package com.monocept.model;

public class Person {
	
	private String name;
	private int id;
	private String address;
	private int dob;
	
	public Person(String name, int id, String address, int dob)
	{
		this.name = name;
		this.id = id;
		this.address = address;
		this.dob = dob;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getDob()
	{
		return dob;
	}

}
