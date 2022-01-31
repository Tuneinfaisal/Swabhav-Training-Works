package com.decorator2;

public class CarDecorator implements ICarService{
	
	private ICarService service;
	
	public CarDecorator(ICarService service)
	{
		super();
		this.service = service;
	}

	@Override
	public int totalCost()
	{
		return this.service.totalCost();
	}

}
