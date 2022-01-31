package com.monocept.test;

import java.util.*;

import com.monocept.model.StudentHashSet;
import com.monocept.model.StudentTreeSet;

public class TreeSetTest {
	
	public static void main(String[] args)
	{
		Set<StudentTreeSet> ts = new TreeSet<>();
		
		StudentTreeSet s1 = new StudentTreeSet("Faisal", 1, 7d);
		StudentTreeSet s2 = new StudentTreeSet("Faisal", 2, 7d);
		
		ts.add(s1);
		ts.add(s2);
		
//		ts.add(1);
//		ts.add(2);
		
		System.out.println(s1.compareTo(s2));
		System.out.println(ts);
		System.out.println();
		System.out.println("Size = "+ ts.size());
	}

}
