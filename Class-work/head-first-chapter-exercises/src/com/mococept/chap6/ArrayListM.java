package com.mococept.chap6;
import java.util.*;
public class ArrayListM {
	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList <String>();
		a.add(0, "zero");
		a.add(1, "one");
		a.add(2, "two");
		a.add(3, "three");
		
		ArrayList(a);
		
		if (a.contains("three")) {
			a.add("four");
		}
		
		a.remove(2);
		ArrayList(a);
		
		if (a.indexOf("four") != 4) {
			a.add(4, "3");
		}
		ArrayList(a);
		
		if (a.contains("two")) {
			a.add("4");
		}
		ArrayList(a);
	}

	public static void ArrayList(ArrayList<String> al) {
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}

}
