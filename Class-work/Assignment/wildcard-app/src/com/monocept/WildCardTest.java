package com.monocept;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {
	
	public static void main(String[] args)
	{
		List<String> names = Arrays.asList("Namaste","Hello","Hi");
		printDetails(names);
		
		List<Integer> nos = Arrays.asList(10,20,30,40);
		printDetails(nos);
		
	}
	
	public static void printDetails(List<?> item)
	{
//		System.out.println(item);
		item.forEach(System.out::println);
		System.out.println();
	}

}
