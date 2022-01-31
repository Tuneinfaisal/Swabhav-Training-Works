package com.monocept.model;

public class Professor extends Person implements misc {
	
	private final String role = "Professor";
	private final int basicsalary = 50000;
	private final int rentAllowance = (this.basicsalary / 10) * 3;
	private final int internetAllowance = (this.basicsalary / 10) * 2;

	public Professor(String name, int id, String address, int dob)
	{
		super(name, id, address, dob);
		
		System.out.println("Role is = " + role);
		System.out.println("Basic salary = " + basicsalary);
		System.out.println("Rent Allowance = " + rentAllowance);
		System.out.println("Interner Allowance = " + internetAllowance);
		System.out.println("Total salary = " + (basicsalary + rentAllowance + internetAllowance));
	}

	@Override
	public void salaryCalculation()
	{
		System.out.println("Role is = " + role);
		System.out.println("Basic salary = " + basicsalary);
		System.out.println("Rent Allowance = " + rentAllowance);
		System.out.println("Total salary = " + (basicsalary + rentAllowance + internetAllowance));
	}

}
