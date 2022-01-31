package com.monocept.com;

import java.util.Scanner;

public class TicTacToe {
	
	static char board[][] = new char[3][3];
	static Scanner in = new Scanner(System.in);
	static String player1;
	static String player2;
	
	public static void main(String[] args)
	{
		int counter = 0;
		char choice = 0;
		
		char player1Marker;
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
		
		gamePlay(choice, player1Marker, player2Marker);
		
		System.out.println();
		Winner.checkWinner();
		Winner.getWinnerName();
		
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
	
	public static void gamePlay(char choice, char player1Marker, char player2Marker)
	{
		for(int i=0;i<4;i++)
		{
			System.out.print(player1 + " Turn: ");
			choice = in.nextLine().charAt(0);
			replaceToMarker(choice,player1Marker);
			displayBoard();
			
			System.out.print(player2 + " Turn: ");
			choice = in.nextLine().charAt(0);
			replaceToMarker(choice,player2Marker);
			displayBoard();
		}
		System.out.print(player1 + " Turn: ");
		choice = in.nextLine().charAt(0);
		replaceToMarker(choice,player1Marker);
		displayBoard();
	}
	
	public static void replaceToMarker(char find, char replace)
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

}