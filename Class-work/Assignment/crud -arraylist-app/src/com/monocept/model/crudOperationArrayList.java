package com.monocept.model;

import java.util.ArrayList;
import java.util.Scanner;

public class crudOperationArrayList {
	
 	static int n = 5;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> ar = new ArrayList<Integer>(n);
	static int choice;
	static int options;
	static int create = 1;
	static int read = 2;
	static int update = 3;
	static int delete = 4;
	static int exit = 5;
	
	public static void main(String[] args)
	{
		while(options != 5)
		{
			System.out.println("Press 1. to create");
			System.out.println("Press 2. to read");
			System.out.println("Press 3. to update");
			System.out.println("Press 4. to delete");
			System.out.println("Press 5. to exit");
			choice = sc.nextInt();
			
			if(choice == create)
			{
				create();
			}
			else if(choice == read)
			{
				read();
			}
			else if(choice == update)
			{
				update();
			}
			else if(choice == delete)
			{
				delete();
			}
			else
			{
				break;
			}
		}
	}
	
	public static void create()
	{
		int input;
		System.out.println("Enter elements");
		for(int i=0;i<ar.size();i++)
		{
			input = sc.nextInt();
			ar.add(input);
		}
	}
	
	public static void read()
	{
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
	}
	
	public static void update()
	{
		int input = 0;
		System.out.println("Enter the index you want to update");
		ar.set(input, -1);
		
	}
	
	public static void delete()
	{
		int input;
		System.out.println("Enter the index you want to delete");
		input = sc.nextInt();
		ar.remove(input);
	}

}
