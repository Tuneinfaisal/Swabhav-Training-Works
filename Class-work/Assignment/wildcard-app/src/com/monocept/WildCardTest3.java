package com.monocept;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest3 {
	
	public static void main(String[] args)
	{
//		List<Integer> nos = new ArrayList<Integer>();
//		nos.add(10);
//		nos.add(20);
//		nos.add(30);
//		printDetails(nos);
//		
//		List<Double> doubleNos = new ArrayList<Double>();
//		doubleNos.add(10.5);
//		doubleNos.add(20.5);
//		doubleNos.add(30.5);
//		printDetails(doubleNos);
//		
		List<Number> nosList = new ArrayList<Number>();
		addNumbersToList(nosList, 10);
		addNumbersToList(nosList, 20.5d);
		System.out.println(nosList);
		
		List<Object> objectList = new ArrayList<Object>();
		addNumbersToList(objectList, 30);
		addNumbersToList(objectList, 40.3f);
		System.out.println("super type : " + objectList);
	}
	
	static void addNumbersToList(List<? super Number> values,Number no)
	{
		values.add(no);
//		System.out.println(values.get(0));
	}
	
	public static void printDetails(List<? extends Number> items)
	{
		items.forEach(System.out::println);
		System.out.println(items.get(0));
	}

}
