package com.model;

import java.util.ArrayList;

public class GroupTag implements IStorageItem{
	
	private String name;
	private ArrayList<IStorageItem> children = new ArrayList<IStorageItem>();
	
	public GroupTag(String name)
	{
		this.name = name;
	}
	
	public void addChildren(IStorageItem im)
	{
		children.add(im);
	}

	@Override
	public void display()
	{
		System.out.println(name);
		for(IStorageItem i : children)
		{
			i.display();
		}
	}
	
}
