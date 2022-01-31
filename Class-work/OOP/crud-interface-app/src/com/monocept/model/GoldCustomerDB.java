package com.monocept.model;

public class GoldCustomerDB extends CustomerDB{

	@Override
	public void update()
	{
		System.out.println("GoldCustor Updating");
	}

	@Override
	public void delete()
	{
		System.out.println("GoldCustomer Deleting");
	}

}
