package com.monocept.test;

import java.util.*;

import com.monocept.model.StudentHashSet;

public class HashSetTest {
	
	public static void main(String[] args)
	{
		Set<StudentHashSet> hs = new HashSet<>();
		
		StudentHashSet s1 = new StudentHashSet("Faisal", 1, 7d);
		StudentHashSet s2 = new StudentHashSet("Faisal", 2, 7d);
		
		hs.add(s1);
		hs.add(s2);
		
		System.out.println(hs);
		System.out.println();
		System.out.println("Size = "+ hs.size());
	}

}
