package com.monocept.model;

import java.io.IOException;

public abstract class Employee {
	
	protected String name;
	protected int empno;
	protected double basicSalary;
	
	public Employee(String name, int empno, double basicSalary)
	{
		this.name = name;
		this.empno = empno;
		this.basicSalary = basicSalary;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getEmpno()
	{
		return empno;
	}
	
	public double getBasicSalary()
	{
		return basicSalary;
	}
	
	public abstract void calculateAnnualCTC() throws IOException;

}
