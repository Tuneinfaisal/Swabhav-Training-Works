package com.monocept.model;

import java.io.IOException;
import java.util.Scanner;

public class TodoMenu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("Welcome to To-do list app.");
		System.out.println("Copyright by Faisal");
		System.out.println();
		
//		TodoApp ta = new TodoApp();
//		TodoManager tm = new TodoManager();
		
		while(TodoApp.playOption)
		{
			TodoManager.printGreetings(); 
			TodoApp.options = sc.nextInt();
			
			if((TodoApp.options == TodoApp.show) && (TodoApp.temp == 1))
			{
				TodoManager.items();
			}
			else
			{
				TodoManager.displayItems();
			}
			
			if(TodoApp.options == TodoApp.add)
			{
				TodoManager.addItems();
			}
			
			if(TodoApp.options == TodoApp.remove)
			{
				TodoManager.removeItems();
			}
			
			if(TodoApp.options == TodoApp.exit)
			{
				TodoManager.exit();
			}
		}
		
		System.out.println(TodoApp.isCompleted());
	}

}
