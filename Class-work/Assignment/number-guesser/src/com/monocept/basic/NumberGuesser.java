package com.monocept.basic;

import java.util.*;

/**
 * 
 * @author Copyright by Faisal
 *
 */

public class NumberGuesser {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Copyright by Faisal");
		int maximumNumberOfGuess = 10;
		int totalNumberOfGuess = 0;
		boolean playGame = true;
		boolean isGuess = false;
		
		int randomNumber = 1 + (int) (Math.random() * 100);
		System.out.println(randomNumber);
		
		while (playGame == true)
		{
			System.out.println("Guess a number between 1 - 100");
			int n = sc.nextInt();

			if (n < randomNumber) 
			{
				System.out.println("Sorry, too low");
			}

			else if (n > randomNumber)
			{
				System.out.println("Sorry, too high");
			}

			else
			{
				System.out.println("You guessed the right number");
				System.out.println("Total no. of guesses is = " + (totalNumberOfGuess+1));
				isGuess = true;
			}
			totalNumberOfGuess++;
			
			if(isGuess == true)
			{
				totalNumberOfGuess = 0;
				if(printDetails(playGame) == false)
				{
					break;
				}
				isGuess = false;
			}
			
			if(totalNumberOfGuess >= maximumNumberOfGuess)
			{
				totalNumberOfGuess = 0;
				System.out.println("You exceeds the limit of guessing");				
				if(printDetails(playGame) == false)
				{
					break;
				}
				isGuess = false;
			}
		}

	}
	
	public static boolean printDetails(boolean playGame)
	{
		System.out.println("If you want to play again, press 1 else press 0");
		int option = sc.nextInt();
		if(option == 1)
		{
			playGame = true;
		}
		
		else if(option == 0)
		{
			playGame = false;
		}
		
		else
		{
			System.out.println("Invalid input");
		}
		
		return playGame;
	}

}
