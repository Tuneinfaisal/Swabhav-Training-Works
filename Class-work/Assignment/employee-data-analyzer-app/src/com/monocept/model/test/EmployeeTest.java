package com.monocept.model.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.monocept.model.Employee;
import com.monocept.model.ReadingFromFile;
import com.monocept.model.ReadingFromUrl;

public class EmployeeTest {
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Employee emp1 = new Employee(new ReadingFromFile());
		System.out.println("Showing results form csv ->");
		System.out.println();
		emp1.employeeWithHighestSalary();
		emp1.employeeByDeptNumber(10);
		emp1.employeeByDesignation("WATCHMAN");
		emp1.numberOfTotalEmployees();
		
		Employee emp2 = new Employee(new ReadingFromUrl());
		System.out.println("Showing results from url ->");
		System.out.println();
		emp2.employeeWithHighestSalary();
		emp2.employeeByDeptNumber(20);
		emp2.employeeByDesignation("MANAGER");
		emp2.numberOfTotalEmployees();
	}

}
