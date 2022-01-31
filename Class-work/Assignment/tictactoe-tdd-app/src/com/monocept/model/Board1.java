package com.monocept.model;

public class Board1 {
	
	public Cell[] board = new Cell[9];
	
	public Board1()
	{
		for(int i=0;i<9;i++)
		{
			board[i] = new Cell();
		}
	}
	
	public void markCell(int location, Mark mark) throws Exception
	{
		this.board[location].setMarker(mark);
	}
	
	public Cell[] getCell()
	{
		return board;
	}

}
