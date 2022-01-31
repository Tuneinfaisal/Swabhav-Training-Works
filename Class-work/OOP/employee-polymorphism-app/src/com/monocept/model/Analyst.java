package com.monocept.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Analyst extends Employee{
	
	public final double perks = (this.basicSalary / 10) * 6;
	public final String role = "Analyst :";

	public Analyst(String name, int empno, double basicSalary)
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
		
		System.out.println("Perks = " + perks);
		fw.write("Perks = " + perks + "\n");
		
		System.out.println("Basic salary = " + basicSalary);
		fw.write("Basic salary = " + basicSalary + "\n");
		this.basicSalary += perks;
		fw.close();
	}

}
