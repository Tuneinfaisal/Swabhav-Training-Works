package com.monocept.srp.solution.test;

import com.monocept.srp.violation.Invoice;

public class SrpSolutionTest {
	
	public static void main(String[] args)
	{
		Invoice i = new Invoice(101, "Bread", 100d, 10f, 10f);
		
		i.displayIncoice();
	}

}
