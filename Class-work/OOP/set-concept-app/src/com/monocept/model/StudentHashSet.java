package com.monocept.model;

import java.util.Objects;

public class StudentHashSet {

	public String name;
	public int roll;
	public double cgpa;
	
	public StudentHashSet(String name,int roll, double cgpa)
	{
		this.name = name;
		this.roll = roll;
		this.cgpa = cgpa;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentHashSet other = (StudentHashSet) obj;
		return Double.doubleToLongBits(cgpa) == Double.doubleToLongBits(other.cgpa) && Objects.equals(name, other.name)
				&& roll == other.roll;
	}

}
