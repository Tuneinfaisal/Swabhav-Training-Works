package com.monocept.chap16;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class SortMountains {

	LinkedList<Mountain> mtn = new LinkedList<Mountain>();

	class NameCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one, Mountain two)
		{
			return one.name.compareTo(two.name);
		}
	}

	class HeightCompare implements Comparator<Mountain>
	{
		public int compare(Mountain one, Mountain two)
		{
			return (two.height - one.height);
		}
	}

	public void go()
	{
		mtn.add(new Mountain("Longs", 14255));
		mtn.add(new Mountain("Elbert", 14433));
		mtn.add(new Mountain("Maroon", 14156));
		mtn.add(new Mountain("Castle", 14265));
		
		System.out.println("As entered:\n" + mtn);
		System.out.println();
		
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("Sort by name:\n" + mtn);
		System.out.println();
		
		HeightCompare hc = new HeightCompare();
		Collections.sort(mtn, hc);
		System.out.println("Sort by height:\n" + mtn);
	}
	
	public static void main(String[] args)
	{
		new SortMountains().go();
	}

}
