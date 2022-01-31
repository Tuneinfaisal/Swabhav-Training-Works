package com.monocept.service;

public class DataService {
	
	static DataService basket;
	
	public DataService()
	{
		System.out.println("DataService created");
	}
	
	public void doSomething()
	{
		System.out.println("Work done by : " + this.hashCode());
	}
	
	public static DataService getServiceInstance()
	{
		if(basket == null)
		{
			basket = new DataService();
		}
		return basket;
	}

}
