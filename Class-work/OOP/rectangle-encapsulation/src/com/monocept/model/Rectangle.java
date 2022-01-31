package com.monocept.model;

public class Rectangle {
	
	private final int lowerLimit = 1;
	private final int upperLimit = 1000;
	
	private int height;
	private int width;
	private String colour;
	
	public int calculateArea()
	{
		return height * width;
	}

	public void setWidth(int pWidth) {
		if(pWidth < lowerLimit)
		{
			width = 1;
		}
		else if(pWidth > upperLimit)
		{
			width = upperLimit;
		}
		else
		{
			width = pWidth;
		}
		
	}

	public void setHeight(int pHeight) {
		if(pHeight < lowerLimit)
		{
			height = 1;
		}
		else if(pHeight > upperLimit)
		{
			height = upperLimit;
		}
		else
		{
			height = pHeight;
		}
		
	}
	
	public void setColour(String pColour)
	{
		if(pColour.equalsIgnoreCase("red"))
		{
			colour = "Red";
		}
		
		if(pColour.equalsIgnoreCase("blue"))
		{
			colour = "Blue";
		}
		
		if(pColour.equalsIgnoreCase("green"))
		{
			colour = "Green";
		}
		
		else
		{
			colour = "red";
		}
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public String getColour()
	{
		return colour;
	}
}
