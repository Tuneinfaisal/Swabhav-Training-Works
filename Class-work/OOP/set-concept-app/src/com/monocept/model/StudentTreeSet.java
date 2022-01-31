package com.monocept.model;

public class StudentTreeSet implements Comparable<StudentTreeSet>{
	
	public String name;
	public int roll;
	public double cgpa;
	
	public StudentTreeSet(String name,int roll, double cgpa)
	{
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}

	@Override
	public int compareTo(StudentTreeSet o)
	{
		if(this.name == o.name && this.roll == o.roll && this.cgpa == o.cgpa)
		{
			return 0;
		}
		return 1;
	}

}
