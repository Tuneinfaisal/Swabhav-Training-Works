package com.monocept.expetiment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalNoOfEmployeeFromCsv {
	
	static String record;
	static int manager;
	static String managerName = "'MANAGER'";
	static int clerk;
	static int analyst;
	static int salesman;
	static int president;
	static List<List<String>> arlist = new ArrayList<>();
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\employee-data-analyzer-app\\dataFile.txt"));
		findMaxSalariedEmployee(br);
	}

	public static void findMaxSalariedEmployee(BufferedReader br) throws IOException
	{
		while((record = br.readLine()) != null)
		{
			String[] info = record.split(",");
			arlist.add(Arrays.asList(info));
			iterateOverSalary(info);
		}
		System.out.println("Showing result from CSV file ->\n");
		System.out.println("Total no. of manager = " + manager);
		System.out.println("Total no. of clerk = " + clerk);
		System.out.println("Total no. of analyst = " + analyst);
		System.out.println("Total no. of salesman = " + salesman);
		System.out.println("Total no. of president = " + president);
	}
	
	public static void iterateOverSalary(String[] info)
	{
		for(int i=0;i<info.length;i++)
		{
			updateVariables(info);
		}
	}
	
	public static void updateVariables(String[] info)
	{
//		if(String.parse(info[2]) == "'MANAGER'")
//		{
//			
//		}
		if(info[2] == "'MANAGER'")
		{
			manager++;
		}
		else if(info[2] == "'CLERK'")
		{
			clerk++;
		}
		else if(info[2] == "'ANALYST'")
		{
			analyst++;
		}
		else if(info[2] == "'SALESMAN'")
		{
			salesman++;
		}
		else if(info[2] == "'PRESIDENT'")
		{
			president++;
		}
	}

}
