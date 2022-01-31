package com.monocept.com;

import java.util.Scanner;

public class TicTacToe {
	
	static char board[][] = new char[3][3];
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int counter = 0;
		char choice;
		String player1 = "";
		String player2 = "";
		char player1Marker = 0;
		char player2Marker = 0;
		
		initializeBoard(counter);
		
		System.out.print("Enter player 1 name : ");
		player1 = in.nextLine();
		
		System.out.print("Enter player 2 name : ");
		player2 = in.nextLine();
		System.out.println();
		
		System.out.print(player1 + " Select marker (x or o)");
		player1Marker = in.nextLine().charAt(0);
		
		if(player1Marker == 'x')
		{
			player2Marker = 'o';
		}
		else if(player1Marker == 'o')
		{
			player2Marker = 'x';
		}
		
		System.out.println("Now " + player2 + "'s marker is -> " + player2Marker);
		System.out.println();
		
		displayBoard();
		
		for(int i=0;i<4;i++)
		{
			System.out.print(player1 + " Turn: ");
			choice = in.nextLine().charAt(0);
			replace(choice,player1Marker);
			displayBoard();
			
			System.out.print(player2 + " Turn: ");
			choice = in.nextLine().charAt(0);
			replace(choice,player2Marker);
			displayBoard();
		}
		System.out.print(player1 + " Turn: ");
		choice = in.nextLine().charAt(0);
		replace(choice,player1Marker);
		displayBoard();
		
		winner();
	}
	
	public static void initializeBoard(int counter)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				board[i][j] = Character.forDigit(++counter, 10);
			}
		}
	}
	
	public static void displayBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void replace(char find, char replace)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[i][j] == find)
				{
					board[i][j] = replace;
					return;
				}
			}
		}
	}
	
	public static void winner()
	{
		if(checkForWin())
		{
			System.out.println("We have a winner");
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
			if(check(board[i][0],board[i][1],board[i][2]) == true)
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
			if(check(board[0][i],board[1][i],board[2][i]) == true)
			{
				return true;
			}
		}
		return false;
	}
	
	public static boolean checkDiagonally()
	{
		return(check(board[0][0],board[0][1],board[0][2]) == true || check(board[0][2],board[1][1],board[2][0]) == true);
	}
	
	public static boolean check(char c1, char c2, char c3)
	{
		return ((c1 == c2) && (c2 == c3));
	}

}
