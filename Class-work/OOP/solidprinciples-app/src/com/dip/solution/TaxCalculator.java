package com.dip.solution;

public class TaxCalculator {
	
	private ILogger logger;
	
	public TaxCalculator(ILogger logger)
	{
		this.logger = logger;
	}
	
	public int calculator(int a, int b)
	{
		return a+b;
	}
	
}
