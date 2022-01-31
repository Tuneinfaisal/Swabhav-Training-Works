package com.monocept.test;

import java.util.HashMap;
import java.util.Map;

import com.monocept.model.StudentHashMap;

public class StudentHashMapTest {
	
	public static void main(String[] args)
	{
		HashMap<Integer, StudentHashMap> hm = new HashMap<>();
		StudentHashMap s1 = new StudentHashMap("Faisal", 1, 7d);
		StudentHashMap s2 = new StudentHashMap("Faisal", 2, 7d);
		
		hm.put(1, s1);
		hm.put(1, s2);
		
		System.out.println(hm);
		System.out.println();
		System.out.println("Size is = " + hm.size());
		
		System.out.println("\nIterating");
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
	

}