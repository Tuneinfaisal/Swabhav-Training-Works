package com.ooad.chap1;

public class FindGuitarTest {
	public static void main(String[] args)
	{
		Inventory in = new Inventory();
		InitializeInventory(in);
		
		Guitar whatErinLikes = new Guitar("0", "fender", "g001", "electric", "bw", "tw", 4000d);
		
		Guitar g = in.search(whatErinLikes);
		
	}

	private static void InitializeInventory(Inventory in)
	{
		
	}

}
