package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private GenderType gender;
	private int age;
	
	public Player(int id, String name, GenderType gender,int age)
	{
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public Player(int id, String name)
	{
		this(id,name,GenderType.MALE,30);
	}
	
	public Player whoIsElder(Player pVirat)
	{
		if(this.age > pVirat.age)
		{
			return this;
		}
		return pVirat;
	}
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public GenderType getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}

}
