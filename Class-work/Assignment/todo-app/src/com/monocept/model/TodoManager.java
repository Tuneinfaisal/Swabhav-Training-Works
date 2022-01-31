package com.monocept.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TodoManager {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void printGreetings()
	{
		System.out.println("Choose anyone from the below options.");
		System.out.println("1. Display items.");
		System.out.println("2. Add items.");
		System.out.println("3. Remove items.");
		System.out.println("4. Exit.");
		System.out.println();
	}
	
	public static void displayItems() throws IOException
	{
		int i = 0;
		File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\todo-app\\notes.txt");
		
//		Deserialization
//		FileInputStream fis = new FileInputStream(f);
//		ObjectInputStream ois = new ObjectInputStream(fis);
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		String output;
		while((output = br.readLine()) != null)
		{
//			System.out.println(output);
			TodoApp.toDoItems[i] = output;
			System.out.println(TodoApp.toDoItems[i]);
			i++;
		}
		System.out.println();
		TodoApp.temp = 1;
	}
	
	public static void items()
	{
		for(int item=0;item<TodoApp.toDoItems.length;item++)
		{
			System.out.println(TodoApp.toDoItems[item]);
		}
		
		System.out.println();
	}
	
	public static void addItems() throws IOException
	{	
		System.out.println("Add your notes");
		for(int item=0;item<TodoApp.toDoItems.length;item++)
		{	
			TodoApp.toDoItems[item] = sc.nextLine();
			
//			Serialization
//			File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\todo-app\\notes.txt");
//			FileOutputStream fos = new FileOutputStream(f);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(TodoApp.toDoItems[item] + "\n");
			
			File f = new File("C:\\Users\\tunei\\Desktop\\SwabhavTechTraining\\Classes\\Class work\\Assignment\\todo-app\\notes.txt");
			FileWriter fWriter = new FileWriter(f,true);
			fWriter.write(TodoApp.toDoItems[item] + "\n");
			fWriter.close();
		}
			
		System.out.println();
		System.out.println("Your items is saved");
	}
	
	public static void removeItems()
	{
		System.out.println("Enter S no. to remove item");
		TodoApp.removeItem = sc.nextInt();
		TodoApp.toDoItems[TodoApp.removeItem] = "Item is removed.......!!!";
		System.out.println("Item is removed.");
		System.out.println();
	}
	
	public static void exit()
	{
		System.out.println("Thank you for using this app.");
		System.out.println("Have a nice day.");
		TodoApp.playOption = false;
	}

}
