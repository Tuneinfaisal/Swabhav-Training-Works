package com.monocept.templatedesign;

public class VegPizza extends PizzaTemplate{
	
	@Override
	protected void selectBread()
	{
		System.out.println("Selecting bread for veg Pizza");
	}
	
	@Override
	protected void addingIngredients()
	{
		System.out.println("Adding ingredients to veg Pizza");
	}

}
