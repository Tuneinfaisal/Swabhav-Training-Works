package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Board;

public class BoardTest {
	
	@Test
	public void checkBoardInitializedOrNot()
	{
		Board b = new Board();
		int expectedValue = 0;
		assertEquals(expectedValue, b.getBoard());
	}
	
	@Test
	public void checkBoardUpdatesOrNot()
	{
		Board b = new Board();
		b.setBoard();
		char expectedValue = '3';
		assertEquals(expectedValue, b.getBoard());
	}

}
