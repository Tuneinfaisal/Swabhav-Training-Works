package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Manager extends Employee {
	
	public final double hra = (this.basicSalary / 10) * 8;
	public final double ta = (this.basicSalary / 10) * 7;
	public final double da = (this.basicSalary / 10) * 6;
	public final String role = "Manager :";

	public Manager(String name, int empno, double basicSalary)
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
		
		System.out.println("Hra = " + hra);
		fw.write("Hra = " + hra + "\n");
		
		System.out.println("Ta = " + ta);
		fw.write("Ta = " + ta + "\n");
		
		System.out.println("Da = " + da);
		fw.write("Da = " + da + "\n");
		
		System.out.println("Basic salary = " + basicSalary);
		fw.write("Basic salary = " + basicSalary + "\n");
		this.basicSalary += (hra + ta + da);
		fw.close();
	}
}