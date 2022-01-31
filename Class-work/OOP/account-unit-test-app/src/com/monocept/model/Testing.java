package com.monocept.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class Testing {
	
	@Test
	public void testingConstructorWith3Arguements_AccnoNameBalance()
	{
		//Arrange
		int expectedAccno = 101;
		String expectedName = "Faisal";
		double expectedBalance = 10000d;
		
		//Act
		Account a1 = new Account(101, "Faisal", 10000d);
		
		System.out.println("Value is 101");
		//Assert
		int result = a1.getAcc();
		assertEquals(expectedAccno, result);	
	}
	
//	@Test
//	public void testWthdrawWithinMinimumBalanceAmount()
//	{
//		Account a1 = new Account(101,Anu,10000d);
//		int expectedBalance = 6000;
//		
//		a1.withdraw(4000);
//	}

}
