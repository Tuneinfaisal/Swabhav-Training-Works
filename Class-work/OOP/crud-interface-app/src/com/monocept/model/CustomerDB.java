package com.monocept.model;

public abstract class CustomerDB implements IDataAccess{

	@Override
	public void create()
	{
		System.out.println("Customer Creating");
	}

	@Override
	public void read()
	{
		System.out.println("Customer Reading");
	}

}
