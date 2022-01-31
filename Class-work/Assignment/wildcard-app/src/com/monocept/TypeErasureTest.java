package com.monocept;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureTest {
	
	public static void main(String[] args)
	{
		List<String> names = new ArrayList<String>();
		names.add("Faisal");
		names.add("Anu");
		
		List nos = names;
		nos.add(10);
		nos.add(20);
		nos.add(30);
		
		System.out.println(names);
		System.out.println(nos);
		
	}

}
