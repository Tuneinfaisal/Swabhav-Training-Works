package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.PossibleResult;
import com.monocept.model.Result;

public class ResultTest {
	
	@Test
	public void checkForPossibleResult()
	{
		Result r1 = new Result();
		r1.setResult(PossibleResult.WIN);
		PossibleResult expectedValuer1 = PossibleResult.WIN;
		assertEquals(expectedValuer1, r1.getResult());
		
		Result r2 = new Result();
		r2.setResult(PossibleResult.DRAW);
		PossibleResult expectedValuer2 = PossibleResult.DRAW;
		assertEquals(expectedValuer2, r2.getResult());
	}

}
