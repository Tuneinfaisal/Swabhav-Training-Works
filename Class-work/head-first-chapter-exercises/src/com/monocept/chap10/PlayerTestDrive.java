package com.monocept.chap10;

public class PlayerTestDrive {
	public static void main(String[] args)
	{
		System.out.println(Player.playerCount);
		Player one = new Player("Tiger Woods");
		Player two = new Player("Liger Woods");
		System.out.println(Player.playerCount);
	}

}
