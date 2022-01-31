package com.monocept.test;

import java.util.*;

import com.monocept.model.StudentComparator;

public class ComparatorTest {
	
	public static void main(String[] args)
	{
		Set<StudentComparator> ts = new TreeSet<>();
		
		StudentComparator s1 = new StudentComparator("Faisal", 1, 7d);
		StudentComparator s2 = new StudentComparator("Ankit", 2, 9d);
		StudentComparator s3 = new StudentComparator("Asif", 3, 8d);
		StudentComparator s4 = new StudentComparator("Nongamba", 4, 9.5d);
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println("Ascending order by name");
		System.out.println();
		for(StudentComparator s : ts)
		{
			System.out.println(s.getName());
		}
		System.out.println();
		
		System.out.println("Ascending order by name");
		System.out.println();
		for(StudentComparator s : ts)
		{
			System.out.println(s.getRoll());
		}
		System.out.println();
		
		System.out.println("Ascending order by name");
		System.out.println();
		for(StudentComparator s : ts)
		{
			System.out.println(s.getCgpa());
		}
		
	}

}
