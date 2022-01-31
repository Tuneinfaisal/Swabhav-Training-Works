package com.monocept.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeveloperCodeTesting {
	
	@Test
	public void testingConstructorWith3Arguments_NameEmpnoBasicSalary()
	{
		String expectedName = "Rohit";
		int expectedEmpno = 111;
		double expectedBasicSalary = 30000d;
		
		Developer d = new Developer("Rohit", 111, 30000d);
		
		assertEquals(expectedName, d.name);
		assertEquals(expectedEmpno, d.empno);
//		assertEquals(expectedBasicSalary, d.basicSalary);
	}
	
	@Test
	public void testingCalculateAnnualSalary()
	{
		Analyst a = new Analyst("Rohit",111,30000d);
		double expectedBasicSalary = 30000d;
//		assertEquals(30000d, m.calculateAnnualCTC());
	}

}
