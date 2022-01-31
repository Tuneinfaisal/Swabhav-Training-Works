package com.monocept.srp.solution;

public class Invoice {
	
	private int id;
	private String description;
	public static double amount;
	private float discountPercentage;
	private float taxPercentage;
	
	public Invoice(int id, String description, double amount, float discountPercentage, float taxPercentage)
	{
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		this.taxPercentage = taxPercentage;
	}
	
	public static double calculateDiscount()
	{
		amount -= (amount/10) * 1;
		return (amount/10) * 1;
	}
	
	public static double calculateTax()
	{
		amount += (amount/10) * 2;
		return (amount/10) * 2;
	}
	
	public static double calculateTotal()
	{
		return amount;
	}
	
}
