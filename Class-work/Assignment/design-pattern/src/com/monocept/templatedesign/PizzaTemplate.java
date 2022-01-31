package com.monocept.templatedesign;

public abstract class PizzaTemplate {
	
	public void prepare()
	{
		selectBread();
		addingIngredients();
		coocking();
		addingCheese();
	}

	protected abstract void addingIngredients();

	protected abstract void selectBread();

	private void coocking()
	{
		System.out.println("Coocking pizza");
	}
	
	private final void addingCheese()
	{
		System.out.println("Adding cheese");
	}

}
