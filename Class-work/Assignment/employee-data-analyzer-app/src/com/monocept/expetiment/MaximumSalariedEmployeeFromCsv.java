package com.monocept.expetiment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaximumSalariedEmployeeFromCsv {
	
	static String record;
	static int maximumSalary = 0;
	static String maximumSalariedEmployee = null;
	static List<List<String>> arlist = new ArrayList<>();
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\employee-data-analyzer-app\\dataFile.txt"));
		findMaxSalariedEmployee(br);
//		employeeByDepartmentNumber(maximumSalary);
//		employeeByDesignation("MANAGER");
	}

	public static void findMaxSalariedEmployee(BufferedReader br) throws IOException
	{
		while((record = br.readLine()) != null)
		{
			String[] salary = record.split(",");
			arlist.add(Arrays.asList(salary));
			iterateOverSalary(salary);
		}
		System.out.println("Showing result from CSV file ->");
		System.out.println("Maximum Salaried employee is = " + maximumSalariedEmployee);
		System.out.println("Whose salary is = " + maximumSalary);
	}
	
	public static void iterateOverSalary(String[] salary)
	{
		for(int i=0;i<salary.length;i++)
		{
			updateVariables(salary);
		}
	}
	
	public static void updateVariables(String[] salary)
	{
		if(Integer.parseInt(salary[5]) > maximumSalary)
		{
			maximumSalariedEmployee = salary[1];
			maximumSalary = Integer.parseInt(salary[5]);
		}
	}
	
	public static Map<String, Integer>employeeByDepartmentNumber(int departmentNumber)
	{
		Set<String>setList = getReadData();
		int count = 0;
		String department = null;
		Map<String, Integer>hashMap = new LinkedHashMap<>();
		for(String set : setList)
		{
			String[]words = set.split(",");
			if(Integer.parseInt(words[7]) == departmentNumber)
			{
				count++;
				department = words[7];
			}
		}
		hashMap.put(department, count);
		return hashMap;
	}
	
	public static Map<String, Integer>employeeByDesignation(String designationName)
	{
		Set<String>setList = getReadData();
		int count = 0;
		String designation = null;
		Map<String, Integer>hashMap = new LinkedHashMap<>();
		for(String set : setList)
		{
			String[]words = set.split(",");
			if(set.contains(designationName))
			{
				count++;
				designation = words[2];
			}
		}
		hashMap.put(designation, count);
		return hashMap;
	}
	
	private static Set<String> getReadData()
	{
		return null;
	}

}
