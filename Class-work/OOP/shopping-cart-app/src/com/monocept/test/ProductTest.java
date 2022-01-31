package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Product;

public class ProductTest {
	
	@Test
	public void testingConstructorWithThreeParameter_id_name_price()
	{
		int expectedId = 1;
		String expectedName = "Bread";
		double expectedPrice = 20d;
		
		Product p1 = new Product(1,"Bread", 20);
		
		assertEquals(expectedId, p1.getId());
		assertEquals(expectedName, p1.getName());
		assertEquals((int)expectedPrice, p1.getPrice());
	}
	
	@Test
	public void testingDiscountMethod()
	{
		int expectedDiscount = 15;
		
		Product p1 = new Product(1,"Bread", 20);
		p1.costAfterDiscount(5);
		
		assertEquals(expectedDiscount, p1.getDiscount());
	}

}
