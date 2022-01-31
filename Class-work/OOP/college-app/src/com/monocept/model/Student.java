package com.monocept.model;

public class Student extends Person {
	
	private final String branch = "CS";
	
	public Student(String name, int id, String address, int dob)
	{
		super(name, id, address, dob);
		System.out.println("Branch is = " + branch);
	}

}
