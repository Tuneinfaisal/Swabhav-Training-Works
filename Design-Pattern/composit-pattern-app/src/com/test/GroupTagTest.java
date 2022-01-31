package com.test;

import com.model.GroupTag;

public class GroupTagTest {
	
	public static void main(String[] args)
	{
		GroupTag root = new GroupTag("div");
		GroupTag p = new GroupTag("p");
		root.addChildren(p);
		
		root.display();
	}

}
