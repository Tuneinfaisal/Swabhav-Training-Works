package com.monocept.strategydesign;

public class Divide implements StrategyInterface{

	@Override
	public int operation(int a, int b)
	{
		return a/b;
	}

}
