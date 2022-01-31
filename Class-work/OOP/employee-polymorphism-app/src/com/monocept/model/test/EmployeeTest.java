package com.monocept.model.test;

import java.io.*;

import com.monocept.model.Analyst;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeeTest {
	
	public static void main(String[] args) throws Exception
	{
		Manager m = new Manager("Vishak", 101, 60000d);
		printDetails(m);
		
		Developer d = new Developer("Rohit", 111, 30000d);
		printDetails(d);
		
		Analyst a = new Analyst("Mohit", 121, 20000d);
		printDetails(a);
	}

	private static void printDetails(Employee o) throws IOException
	{
		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\OOP\\employee-polymorphism-app\\salaryInfoT.txt");
//		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\OOP\\employee-polymorphism-app\\salaryInfoH.html");
		FileWriter fw = new FileWriter(f,true);
		
		System.out.println("Name = " + o.getName());
//		fw.write("<h1>Name : </h1>");
		fw.write("Name = " + o.getName() + "\n");
		
		System.out.println("Employee no. = " + o.getEmpno());
//		fw.write("<h1>Employee no. : </h1>");
		fw.write("Employee no. = " + o.getEmpno() + "\n");
		
		o.calculateAnnualCTC();
		System.out.println("Annual CTC = " + o.getBasicSalary());
//		fw.write("<h1>Annual CTC : </h1>");
		fw.write("Annual CTC = " + o.getBasicSalary() + "\n" + "\n");
		System.out.println();
		fw.close();
	}

}