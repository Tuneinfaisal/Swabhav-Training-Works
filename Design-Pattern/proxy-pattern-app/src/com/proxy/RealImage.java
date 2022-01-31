package com.proxy;

public class RealImage implements Image{
	
	public String fileName;
	
	public RealImage(String fileName)
	{
		this.fileName = fileName;
		System.out.println("Loading image : " + this.fileName);
	}

	@Override
	public void display()
	{
		System.out.println("Displaying image : " + this.fileName);
	}

}
