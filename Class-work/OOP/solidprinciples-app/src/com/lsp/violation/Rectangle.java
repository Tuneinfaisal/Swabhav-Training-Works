package com.lsp.violation;

public class Rectangle {
	
	protected int width;
	protected int height;
	private int area;
	
	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void calcArea()
	{
		area = this.width * this.height;
	}

	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
}
