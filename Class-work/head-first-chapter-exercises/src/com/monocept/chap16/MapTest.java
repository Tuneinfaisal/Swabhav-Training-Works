package com.monocept.chap16;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("Faisal", 242);
		scores.put("Ankit", 343);
		scores.put("Asif", 420);
//		System.out.println(scores);
		System.out.println();
		System.out.println(scores.get("Ankit"));
	}
}
