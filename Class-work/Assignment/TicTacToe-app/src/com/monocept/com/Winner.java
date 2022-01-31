package com.monocept.com;

public class Winner {
	
	static String winner;
	
	public static void checkWinner()
	{
		if(checkForWin())
		{
			System.out.println("We have a winner :");
		}
		else
		{
			System.out.println("Match is draw");
		}
	}
		
	public static boolean checkForWin()
	{
		return(checkHorizontally() || checkVertically() || checkDiagonally());
	}
	
	public static boolean checkHorizontally()
	{
		for(int i=0;i<3;i++)
		{
			if(check(TicTacToe.board[i][0],TicTacToe.board[i][1],TicTacToe.board[i][2]) == true)
			{
				return true;
				
			}
		}
		return false;
	}
	
	public static boolean checkVertically()
	{
		for(int i=0;i<3;i++)
		{
			if(check(TicTacToe.board[0][i],TicTacToe.board[1][i],TicTacToe.board[2][i]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkDiagonally()
	{
		if(TicTacToe.board[0][0] == 'x' && TicTacToe.board[1][1] == 'x' && TicTacToe.board[2][2] == 'x' || TicTacToe.board[1][2] == 'x' && TicTacToe.board[1][1] == 'x' && TicTacToe.board[2][0] == 'x')
		{
			winner = TicTacToe.player1;
		}
		else
		{
			winner = TicTacToe.player2;
		}
		return(check(TicTacToe.board[0][0],TicTacToe.board[1][1],TicTacToe.board[2][2]) == true || check(TicTacToe.board[1][2],TicTacToe.board[1][1],TicTacToe.board[2][0]) == true);
	}
	
	public static boolean check(char c1, char c2, char c3)
	{
		return ((c1 == c2) && (c2 == c3));
	}
	
	public static void getWinnerName()
	{
		System.out.println(winner + " is the winner");
	}

}
