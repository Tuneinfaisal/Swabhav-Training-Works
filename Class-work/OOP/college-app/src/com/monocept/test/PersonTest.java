package com.monocept.test;

import com.monocept.model.Person;
import com.monocept.model.Professor;
import com.monocept.model.Student;

public class PersonTest {
	
	public static void main(String[] args)
	{
		Student s = new Student("Faisal", 101, "Dehradun", 2000);
		printDetails(s);
		
		Professor p = new Professor("Rahul", 121, "Mumbai", 1885);
		printDetails(p);
	}

	private static void printDetails(Person p)
	{
		System.out.println("Name is = " + p.getName());
		System.out.println("Id is = " + p.getId());
		System.out.println("Address is = " + p.getAddress());
		System.out.println("Dob is = " + p.getDob());
		System.out.println();
	}
	
}