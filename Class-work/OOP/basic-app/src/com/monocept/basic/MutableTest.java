package com.monocept.basic;

public class MutableTest {
	public static void main(String[] args)
	{
		String company = "Monocept";
		System.out.println(company.hashCode());
		
		String companyUpper = company.toUpperCase();
		System.out.println(companyUpper.hashCode());
		
		company += " location @ Hyderabad";
		System.out.println(company.hashCode());
		System.out.println();
		
		System.out.println(company);
		System.out.println(companyUpper);
		
	}

}
