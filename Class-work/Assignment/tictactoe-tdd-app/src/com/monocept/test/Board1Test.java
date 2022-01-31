package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Board1;
import com.monocept.model.Mark;

public class Board1Test {
	
	@Test
	public void checkingTheInitialBoard()
	{
		Board1 b1 = new Board1();
		Mark expectedMark = Mark.EMPTY;
		assertEquals(expectedMark, b1.board[0].getMarker());
	}
	
	@Test
	public void checkinglocationMarkeredOrNot() throws Exception
	{
		Board1 b1 = new Board1();
		b1.markCell(2, Mark.X);
		Mark expectedValue = Mark.X;
		assertEquals(expectedValue, b1.board[2].getMarker());
	}

}
