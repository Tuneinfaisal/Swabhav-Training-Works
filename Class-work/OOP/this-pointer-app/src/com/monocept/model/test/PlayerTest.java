package com.monocept.model.test;

import com.monocept.model.GenderType;
import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args)
	{
		Player Sachin = new Player(100,"Sachin",GenderType.MALE,40);
		printDetails(Sachin);
		
		Player Virat = new Player(101,"Virat");
		printDetails(Virat);
		
		Player elder = Sachin.whoIsElder(Virat);
		
		printDetails(elder);
	}
	
	public static void printDetails(Player p)
	{
		System.out.println("Id is " + p.getId());
		System.out.println("Name is " + p.getName());
		System.out.println("Gender is " + p.getGender());
		System.out.println("Age is " + p.getAge());
		System.out.println();
	}
	
	

}
