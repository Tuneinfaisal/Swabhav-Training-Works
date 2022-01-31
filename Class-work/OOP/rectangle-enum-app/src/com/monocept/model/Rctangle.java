package com.monocept.model;

public class Rctangle {
	private int width;
	private int height;
	private ColourOptoin colour;
	
	public void setWidth(int pWidth)
	{
		width = pWidth;
	}
	
	public void setHeight(int pHeight)
	{
		height = pHeight;
	}
	
	public void setColour(ColourOptoin pColour)
	{
		colour = pColour;
	}
	
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public ColourOptoin getColour()
	{
		return colour;
	}
	
	public float calculateArea()
	{
		return (3.14f * width * height);
	}

}
