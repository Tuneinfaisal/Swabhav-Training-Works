package com.monocept.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ManagerCodeTesting {

	@Test
	public void testingConstructorWith3Arguments_NameEmpnoBasicSalary()
	{
		String expectedName = "Vishak";
		int expectedEmpno = 101;
		double expectedBasicSalary = 60000d;
		
		Manager m = new Manager("Vishak", 101, 60000d);
		
		assertEquals(expectedName, m.getName());
		assertEquals(expectedEmpno, m.getEmpno());
//		assertEquals(expectedBasicSalary, m.getBasicSalary());
	}
	
	@Test
	public void testingCalculateAnnualSalary()
	{
		Manager m = new Manager("Vishak",101,60000d);
		double expectedBasicSalary = 60000d;
//		assertEquals(50000d, m.calculateAnnualCTC());
	}
}
