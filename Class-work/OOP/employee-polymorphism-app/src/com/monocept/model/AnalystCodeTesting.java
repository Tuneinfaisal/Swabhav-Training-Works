package com.monocept.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnalystCodeTesting {
	
	@Test
	public void testingConstructorWith3Arguments_NameEmpnoBasicSalary()
	{
		String expectedName = "Mohit";
		int expectedEmpno = 121;
		double expectedBasicSalary = 20000d;
		
		Analyst a = new Analyst("Mohit", 121, 20000d);
		
		assertEquals(expectedName, a.name);
		assertEquals(expectedEmpno, a.empno);
//		assertEquals(expectedBasicSalary, a.basicSalary);
	}
	
	@Test
	public void testingCalculateAnnualSalary()
	{
		Analyst a = new Analyst("Mohit",121,20000d);
		double expectedBasicSalary = 20000d;
//		assertEquals(20000d, m.calculateAnnualCTC());
	}

}
