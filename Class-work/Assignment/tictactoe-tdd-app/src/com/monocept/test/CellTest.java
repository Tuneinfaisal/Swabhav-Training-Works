package com.monocept.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.monocept.model.Cell;
import com.monocept.model.Mark;

public class CellTest {

	@Test
	public void checkIfCellIsInitiallyEmpty()
	{
		Cell c1 = new Cell();
		Mark expectedMark = Mark.EMPTY;
		assertEquals(expectedMark, c1.getMarker());
	}
	
	@Test
	public void ShouldBeAbleToMark() throws Exception
	{
		Cell c1 = new Cell();
		Mark expectedMark = Mark.X;
		c1.setMarker(Mark.X);
		assertEquals(expectedMark, c1.getMarker());
	}
}
