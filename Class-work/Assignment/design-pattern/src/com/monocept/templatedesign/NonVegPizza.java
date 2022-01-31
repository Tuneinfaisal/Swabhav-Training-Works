package com.monocept.templatedesign;

public class NonVegPizza extends PizzaTemplate{

	@Override
	protected void selectBread()
	{
		System.out.println("Selecting bread for non-veg Pizza");
	}
	
	@Override
	protected void addingIngredients()
	{
		System.out.println("Adding ingredients to non-veg Pizza");
	}

}
