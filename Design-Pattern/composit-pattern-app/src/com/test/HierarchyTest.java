package com.test;

import com.model.File;
import com.model.Folder;

public class HierarchyTest {
	
	public static void main(String[] args)
	{
		Folder root = new Folder("Movie");
		root.addChildren(new File("abc", 750));
		
		Folder comedy = new Folder("Comedy");
		comedy.addChildren(new File("xyz", 550));
//		root.addChildren(comedy);
		
		root.display();
		comedy.display();
	}

}
