package com.model;

import java.util.ArrayList;

public class File implements IStorageItem{
	
	private String name;
	private int type;
	private ArrayList<IStorageItem> children = new ArrayList<IStorageItem>();
	
	public File(String name, int type)
	{
		this.name = name;
		this.type = type;
	}
	
	public void addChildren(IStorageItem im)
	{
		children.add(im);
	}

	@Override
	public void display()
	{
		System.out.println(name + " " + type);
		for(IStorageItem i : children)
		{
//			System.out.println(i);
			i.display();
		}
	}

}
