package com.monocept.model;

public class Board {
	
	private static char board[][] = new char[3][3];
	private static int counter = 0;

	public void setBoard()
	{
		initializeBoard(counter);
//		board[0][0] = (char) n;
	}
	
	public char getBoard()
	{
		return board[0][2];
	}
	
	public void initializeBoard(int counter)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j] = Character.forDigit(++counter, 10);
			}
		}
	}

}
