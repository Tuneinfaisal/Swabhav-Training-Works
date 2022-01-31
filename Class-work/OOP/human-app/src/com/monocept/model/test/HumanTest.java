package com.monocept.model.test;

import com.monocept.model.Human;

public class HumanTest {
	
	public static void main(String[] args)
	{
		Human h1 = new Human("Faisal",6f,65f,22);
		printDetails(h1);
		
		Human h2 = new Human("Manoj",22);
		printDetails(h2);
	}

	private static void printDetails(Human h)
	{
		System.out.println("Name is = " + h.getName());
		System.out.println("Age is = " + h.getAge());
		System.out.println("Height is = " + h.getHeight());
		System.out.println("Weight is = " + h.getWeight());
		System.out.println();
	}

}
