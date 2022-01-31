package com.monocept.test;

import com.monocept.model.CustomerDB;
import com.monocept.model.DepartmentDB;
import com.monocept.model.GoldCustomerDB;
import com.monocept.model.IDataAccess;
import com.monocept.model.OrderDB;

public class PolymorphismTest {
	
	public static void main(String[] args)
	{
		GoldCustomerDB obj = new GoldCustomerDB();;
		doDBOperation(new GoldCustomerDB());
		
		
		
//		obj = new OrderDB();
//		obj = new DepartmentDB();
	}

	private static void doDBOperation(CustomerDB obj)
	{
		System.out.println("Doint DB oprtations");
		System.out.println();
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
	}
	
	

}
