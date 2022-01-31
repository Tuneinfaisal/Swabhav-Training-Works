package com.monocept.model.test;

import com.monocept.model.Boy;
import com.monocept.model.Man;
import com.monocept.model.Kid;
import com.monocept.model.Infant;

public class ManBoyTest {
	
	public static void main(String[] args)
	{
		caseStudy1();
		caseStudy2();
		caseStudy3();
		caseStudy4();
		caseStudy5();
	}
	
	public static void caseStudy1()
	{
		System.out.println("caseStudy1");
		Man x = new Man();
		x.play();
		x.read();
		
		System.out.println();
	}
	
	public static void caseStudy2()
	{
		System.out.println("caseStudy2");
		Boy y = new Boy();
		y.play();
		y.read();
		y.eat();
		
		System.out.println();
	}
	
	public static void caseStudy3()
	{
		System.out.println("caseStudy3");
		Man x = new Boy();
		x.read();
		x.play();
		
		System.out.println();
	}
	
	public static void caseStudy4()
	{
		System.out.println("caseStudy4");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
		
		System.out.println();
	}

	private static void atThePark(Man x)
	{
		System.out.println("At the park");
		x.play();
		
	}
	
	public static void caseStudy5()
	{
		System.out.println("caseStudy5");
		Object x = new Integer(5);
		x = 10;
		System.out.println(x.getClass());
		x = "Hello";
		System.out.println(x.getClass());
		x = true;
		System.out.println(x.getClass());
		x = new Man();
		
		System.out.println(x.getClass());
	}

}
