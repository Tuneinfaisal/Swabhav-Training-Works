package com.monocept.strategydesign.test;

import com.monocept.strategydesign.Add;
import com.monocept.strategydesign.Divide;
import com.monocept.strategydesign.StrategyDesignPattern;

public class StrategyDesignTest {
	
	public static void main(String[] args)
	{
		StrategyDesignPattern sdp;
		
		sdp = new StrategyDesignPattern(new Add());
		printDetails(sdp);
		
//		sdp = new StrategyDesignPattern(new Divide());
//		printDetails(sdp);
	}

	private static void printDetails(StrategyDesignPattern sdp)
	{
		System.out.println("Calling the execute method : " + sdp.execute(4, 2));
		System.out.println();
	}
	

}
