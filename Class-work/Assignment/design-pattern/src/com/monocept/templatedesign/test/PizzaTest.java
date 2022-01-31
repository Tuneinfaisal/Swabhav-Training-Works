package com.monocept.templatedesign.test;

import com.monocept.templatedesign.NonVegPizza;
import com.monocept.templatedesign.PizzaTemplate;
import com.monocept.templatedesign.VegPizza;

public class PizzaTest{
	
	public static void main(String[] args)
	{
		PizzaTemplate pt;
		pt = new VegPizza();
		pt.prepare();
		
		System.out.println("----------------");
		pt = new NonVegPizza();
		pt.prepare();
	}
}
