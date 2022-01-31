package com.ooad.chap1;

public class GuitarTest {
	public static void main(String[] args)
	{
		Guitar g = new Guitar("01", "Faisal Guitars", "g001", "electric", "bw", "tw", 5000d);
		
		System.out.println(g.getSerialNumber());
		System.out.println(g.getBuilder());
		System.out.println(g.getModel());
		System.out.println(g.getType());
		System.out.println(g.getBackWood());
		System.out.println(g.getTopWood());
		System.out.println(g.getPrice());
		System.out.println();
	}

}
