package com.decorator2;

public class TyreChange extends CarDecorator{
	
	private ICarService service;
	
	public TyreChange(ICarService service)
	{
		super(service);
	}
	
	@Override
	public int totalCost()
	{
		return 1000 + service.totalCost();
	}

}
