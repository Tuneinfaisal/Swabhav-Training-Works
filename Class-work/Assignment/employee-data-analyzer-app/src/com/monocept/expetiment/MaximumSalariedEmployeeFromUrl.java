package com.monocept.expetiment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumSalariedEmployeeFromUrl {
	
	static String record;
	static int maximumSalary = 0;
	static String maximumSalariedEmployee = null;
	static List<List<String>> arlist = new ArrayList<>();
	
	public static void main(String[] args) throws IOException
	{	
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		URLConnection urlConnection = url.openConnection();
	    BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		
	    findMaxSalariedEmployee(br);		
	}
	
	public static void findMaxSalariedEmployee(BufferedReader br) throws IOException
	{
		while((record = br.readLine()) != null)
		{
			String[] salary = record.split(",");
			arlist.add(Arrays.asList(salary));
			iterateOverSalary(salary);
		}
		System.out.println("Showing result from url ->");
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

}
