package com.monocept.test;

import com.monocept.IOperation;

public class Test {
	
	public static void main(String[] args)
	{
		IOperation op1 = new IOperation()
				{

					@Override
					public double doMathOpreration(int a, int b)
					{
						return a+b;
					}
					
				};
				
				System.out.println(op1.doMathOpreration(10,20));
				
				IOperation op2 = (a,b)-> a*b; //lambda expression
				System.out.println(op2.doMathOpreration(10,20));
				
//				IOperation op3 = (a,b)-> a%b; //lambda expression
				IOperation op3 = Test::getModulus;
				System.out.println(op3.doMathOpreration(5, 2));
				
//				IOperation op4 = (a,b)-> a-b; //lambda expression
				IOperation op4 = new Test()::getSubstraction;
				System.out.println(op4.doMathOpreration(20, 10));
	}
	
	static double getModulus(int a,int b)
	{
		return a%b;
	}
	
	public double getSubstraction(int a,int b)
	{
		return a-b;
	}

}
