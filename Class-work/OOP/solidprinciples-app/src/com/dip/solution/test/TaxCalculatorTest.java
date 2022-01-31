package com.dip.solution.test;

import com.dip.solution.FileLogger;
import com.dip.solution.TaxCalculator;

public class TaxCalculatorTest {
	
	public static void main(String[] args)
	{
		TaxCalculator tc = new TaxCalculator(new FileLogger());
		
		System.out.println(tc.calculator(5, 5));
//		tc.log("msg");
	}

}
