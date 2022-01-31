package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Developer extends Employee{
	
	public final double pa = (this.basicSalary / 10) * 7;
	public final double pi = (this.basicSalary / 10) * 6;
	public final String role = "Developer :";

	public Developer(String name, int empno, double basicSalary)
	{
		super(name, empno, basicSalary);
	}

	@Override
	public void calculateAnnualCTC() throws IOException
	{
		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\OOP\\employee-polymorphism-app\\salaryInfoT.txt");
//		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\OOP\\employee-polymorphism-app\\salaryInfoH.html");
		FileWriter fw = new FileWriter(f,true);
		
		System.out.println("Role = " + role);
		fw.write("Role = " + role + "\n");
		
		System.out.println("Pa = " + pa);
		fw.write("Pa = " + pa + "\n");
		
		System.out.println("Pi = " + pi);
		fw.write("Pi = " + pi + "\n");
		
		System.out.println("Basic salary = " + basicSalary);
		fw.write("Basic salary = " + basicSalary + "\n");
		this.basicSalary += (pa + pi);
		fw.close();
	}
}
