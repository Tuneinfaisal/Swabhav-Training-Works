package com.monocept.basic;

import java.util.*;

/**
 * 
 * @author Copyright by Faisal
 *
 */

public class PigGame {
	
//	final int targetScore = 20;
//	int totalNumberOfTurns = 0;
//	int turnScore = 0;
//	int totalScore = 0;
//	boolean playGame = true;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Copyright by Faisal");
		final int targetScore = 20;
		int totalNumberOfTurns = 0;
		int turnScore = 0;
		int totalScore = 0;
		boolean playGame = true;

		while (playGame)
		{
			int randomDice = 1 + (int) (Math.random() * 6);
			turnScore += randomDice;
			totalScore += randomDice;
			System.out.println("Roll or hold(r/h)");
			System.out.println("Diece no. is = " + randomDice);
			char optionForRollOrHold = sc.next().charAt(0);
			
			if (optionForRollOrHold == 'h')
			{
				System.out.println("Your turn score is = " + turnScore);
				System.out.println("Your total score is = " + totalScore);
				System.out.println();
				totalNumberOfTurns++;
			}
			
			if(randomDice == 1)
			{
				turnScore = 0;
				System.out.println("Turn over, Now your turn score is 0");
				System.out.println();
			}
			
			if(turnScore > targetScore)
			{
				decider(turnScore,totalScore,totalNumberOfTurns,playGame);
			}
			
//			if(!decider(turnScore,totalScore,totalNumberOfTurns,playGame))
//			{
//				break;
//			}
		}
	}
	
	public static void decider(int turnScore, int totalScore, int totalNumberOfTurns, boolean playGame)
	{
		
		System.out.println("You achieved the score in " + (totalNumberOfTurns+1) + " turns");
		System.out.println("Your final score is = " + turnScore);
		System.out.println();
		System.out.println("If you want to play again, press 1 else press 0");
		int optionForPlayOrNot = sc.nextInt();
		
		if(optionForPlayOrNot == 1)
		{
			turnScore = 0;
			totalScore = 0;
			totalNumberOfTurns = 0;
		}
		else
		{
			System.out.println("Game over......!!!");
			playGame = false;
		}
		
//		return false;
	}
}
