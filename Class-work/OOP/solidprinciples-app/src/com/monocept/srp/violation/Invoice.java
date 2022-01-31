package com.monocept.srp.violation;

public class Invoice {
	
	private int id;
	private String description;
	private double amount;
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
	
	public double calculateDiscount()
	{
		this.amount -= (amount/10) * 1;
		return (amount/10) * 1;
	}
	
	public double calculateTax()
	{
		this.amount += (amount/10) * 2;
		return (amount/10) * 2;
	}
	
	public double calculateTotal()
	{
		return this.amount;
	}
	
	public void displayIncoice()
	{
		System.out.println("Price is = " + this.amount);
		System.out.println("Discount 10% = " + calculateDiscount());
		System.out.println("Tax 20% = " + calculateTax());
		System.out.println("Total = " + calculateTotal());
	}

}
