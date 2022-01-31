package com.monocept.model.part1;

public class AutomobileFactory {
	
	private static AutomobileFactory basket = null;
	
	private AutomobileFactory()
	{
		System.out.println("Automobile factory created");
	}
	
	public static AutomobileFactory getInstance()
	{
		synchronized(AutomobileFactory.class)
		{
			if(basket == null)
			{
				return basket = new AutomobileFactory();
			}
		}
		return basket;
	}
	
	public IAutomobile make(AutoType autoType)
	{
		return autoType.createAutoType();
	}

}
