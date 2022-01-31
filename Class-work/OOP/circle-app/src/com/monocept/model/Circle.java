package com.monocept.model;

public class Circle {
	private float radius = 2.2f;
	private String border = "Solid";
	
	public float calculateArea()
	{
		return (3.14f * radius * radius);
	}
	
	public void setRadius(float pRadius) 
	{
		radius = pRadius;
	}
	
	public void setBorder(String pBorder)
	{
		if(pBorder.equalsIgnoreCase("solid"))
		{
			border = "Solid";
		}
		if(pBorder.equalsIgnoreCase("double"))
		{
			border =  "Double";
		}
		if(pBorder.equalsIgnoreCase("dotted"))
		{
			border =  "Dotted";
		}
		else
		{
			border = "Solid";
		}

		
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public String getBorder()
	{
		return border;
	}

}
