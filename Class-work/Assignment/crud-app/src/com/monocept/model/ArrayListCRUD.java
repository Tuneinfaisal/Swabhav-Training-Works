package com.monocept.model;

import java.util.ArrayList;

public class ArrayListCRUD {
	
	public static void main(String[] args)
	{
		ArrayList<String> ar = new ArrayList<String>();
		
		// Create
		ar.add("Faisal");
		ar.add("Ankit");
		ar.add("Asif");
		ar.add("Nongamba");
		
		// Read
		System.out.println("Reading the ArrayList");
		System.out.println(ar);
//		System.out.println(ar.get(1));
		System.out.println();
		
		// Update
		System.out.println("Updating the ArrayList");
		ar.set(0, "Anu");
		System.out.println(ar);
		System.out.println();
		
		// Delete
		System.out.println("Deleting elements from ArrayList");
		ar.remove(3);
		System.out.println(ar);
	}

}
