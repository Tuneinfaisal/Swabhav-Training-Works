package com.monocept.expetiment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTxtTest {
	
	static ArrayList<String> items = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException
	{
		extractDetails();
		printDetails();
		
//		String record;
//		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\employee-data-analyzer-app\\dataFile.txt");
//		BufferedReader br = new BufferedReader(new FileReader(f));
//		List<List<String>> arlist = new ArrayList<>();
//		String output;
//		int maxVal = 0;
//		while((output = br.readLine()) != null)
//		{
//			String[] words = record.split(",");
//			arlist.add(Arrays.aslist(words));
//			for(int i=0;i< words.length;i++)
//			{
//				if(maxSal <= Integer.parseInt(words[0]))
//			}
//			
//			
//			items.add(output);
//		}
//		br.close();
		
	}
	
	public static void extractDetails() throws IOException
	{
		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\employee-data-analyzer-app\\dataFile.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		String output;
		while((output = br.readLine()) != null)
		{
			items.add(output);
		}
		br.close();
	}
	
	public static void printDetails()
	{
		for(int i=0;i<items.size();i++)
		{
			System.out.println(items.get(i));
		}
	}

}
