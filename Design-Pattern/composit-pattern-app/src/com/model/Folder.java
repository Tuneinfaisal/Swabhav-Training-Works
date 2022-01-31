package com.model;

import java.util.ArrayList;

public class Folder implements IStorageItem{
	
	public String name;
	private ArrayList<IStorageItem> children = new ArrayList<IStorageItem>();
	
	public Folder(String name)
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
		System.out.println(name + " : " + children);
		for(IStorageItem i : children)
		{
//			System.out.println(i);
			i.display();
		}
	}

}
