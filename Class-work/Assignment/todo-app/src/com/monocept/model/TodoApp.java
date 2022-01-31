package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

import org.junit.Test;

/**
 * 
 * @author Copyright by Faisal
 *
 */

public class TodoApp implements Serializable{
	
	static int show = 1;
	static int add = 2;
	static int remove = 3;
	static int exit = 4;
	static int temp = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	static int options;
	static int removeItem;
	static boolean playOption = true;
	static String[] toDoItems = new String[6];
	static String completed = "Your work is completed.";
	
	public static String isCompleted()
	{
		return completed;
	}
	
}












	
//	public static void main(String[] args) throws IOException
//	{
//		System.out.println("Welcome to To-do list app.");
//		System.out.println("Copyright by Faisal");
//		System.out.println();
//		
//		while(playOption)
//		{
//			printGreetings(); 
//			options = sc.nextInt();
//			
//			if((options == show) && (temp == 1))
//			{
//				items();
//			}
//			else
//			{
//				displayItems();
//			}
//			
//			if(options == add)
//			{
//				addItems();
//			}
//			
//			if(options == remove)
//			{
//				removeItems();
//			}
//			
//			if(options == exit)
//			{
//				exit();
//			}
//		}
//	}
//
//	public static void printGreetings()
//	{
//		System.out.println("Choose anyone from the below options.");
//		System.out.println("1. Display items.");
//		System.out.println("2. Add items.");
//		System.out.println("3. Remove items.");
//		System.out.println("4. Exit.");
//		System.out.println();
//	}
//	
//	public static void displayItems() throws IOException
//	{
//		int i = 0;
//		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\todo-app\\notes.txt");
//		BufferedReader br = new BufferedReader(new FileReader(f));
//		String output;
//		while((output = br.readLine()) != null)
//		{
////			System.out.println(output);
//			toDoItems[i] = output;
//			System.out.println(toDoItems[i]);
//			i++;
//		}
//		System.out.println();
//		temp = 1;
//	}
//	
//	public static void items()
//	{
//		for(int item=0;item<toDoItems.length;item++)
//		{
//			System.out.println(toDoItems[item]);
//		}
//		
//		System.out.println();
//	}
//	
//	public static void addItems() throws IOException
//	{	
//		System.out.println("Add your notes");
//		for(int item=0;item<toDoItems.length;item++)
//		{
//			toDoItems[item] = sc.nextLine();
//			File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\todo-app\\notes.txt");
//			FileWriter fWriter = new FileWriter(f,true);
//			fWriter.write(toDoItems[item] + "\n");
//			fWriter.close();
//		}
//			
//		System.out.println();
//		System.out.println("Your items is saved");
//	}
//	
//	public static void removeItems()
//	{
//		System.out.println("Enter S no. to remove item");
//		removeItem = sc.nextInt();
//		toDoItems[removeItem] = "Item is removed.......!!!";
//		System.out.println("Item is removed.");
//		System.out.println();
//	}
//	
//	public static void exit()
//	{
//		System.out.println("Thank you for using this app.");
//		System.out.println("Have a nice day.");
//		playOption = false;
//	}
