package com.monocept.model.test;

import com.monocept.model.Customer;

public class CustomerTest {

	public static void main(String[] args)
	{
		Customer c1 = new Customer("Faisal");
		Customer c2 = new Customer("Ankit");
		Customer c3 = new Customer("Manoj");
		
		System.out.println(c1.getId() + " " + c1.getName());
		System.out.println(c2.getId() + " " + c2.getName());
		System.out.println(c3.getId() + " " + c3.getName());
		System.out.println();
		
		System.out.println(c1.getId() + " " + c1.getName());
	}
}