package com.dip.violation.test;

import com.dip.violation.ErrorLogType;
import com.dip.violation.TaxCalculator;

public class TaxCalculatorTest {
	
	public static void main(String[] args)
	{
		TaxCalculator tc = new TaxCalculator(ErrorLogType.Email);
		tc.getLog();
	}

}
