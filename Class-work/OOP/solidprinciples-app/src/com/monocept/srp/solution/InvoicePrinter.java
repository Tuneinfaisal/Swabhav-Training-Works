package com.monocept.srp.solution;

//import com.monocept.srp.solution.test.Invoice;

//import com.monocept.srp.solution.Invoice;

public class InvoicePrinter {
		
	public static void displayIncoice()
	{
		System.out.println("Price is = " + Invoice.amount);
		System.out.println("Discount 10% = " + Invoice.calculateDiscount());
		System.out.println("Tax 20% = " + Invoice.calculateTax());
		System.out.println("Total = " + Invoice.calculateTotal());
	}

}
