package com.monocept.strategydesign;

public class Add implements StrategyInterface{

	@Override
	public int operation(int a, int b)
	{
		return a+b;
	}

}
