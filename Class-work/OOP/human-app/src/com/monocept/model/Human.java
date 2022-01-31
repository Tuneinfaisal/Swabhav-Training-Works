package com.monocept.model;

public class Human {
	private String name;
	private float height;
	private float weight;
	private float age;
	private static int count = 0;
	private static int headCount = 0;
	
	public Human(String name, float height, float weight, float age)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
		count++;
		headCount++;
	}
	
	public Human(String name, float age)
	{
		this(name,age,65f,6f);
//		count++;
	}
	
	public void eat()
	{
		this.height += (height * 5) / 100;
	}
	
	public void workout()
	{
		this.weight += (weight * 5) / 100;
	}
	
	public String getName()
	{
		return name;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public float getAge()
	{
		return age;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public static int headCount()
	{
		return headCount;
	}

}
