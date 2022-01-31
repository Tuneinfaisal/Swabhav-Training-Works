package com.monocept.strategydesign;

public class StrategyDesignPattern {
	
	private StrategyInterface strategy;
	
	public StrategyDesignPattern(StrategyInterface strategy)
	{
		this.strategy = strategy;
	}
	
	public int execute(int a, int b)
	{
		return strategy.operation(a, b);
	}

}
