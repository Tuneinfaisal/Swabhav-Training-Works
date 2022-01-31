package com.monocept.model;

public class Exception {
	
	static String name = "Faisal";
	static int password = 123;
	
	public static void main(String[] args)
	{
		Exception ex = new Exception();
		ex.authorization("Faisal",125);
	}
	
	public void authorization(String name, int password)
	{
		if(this.name == name && this.password == password)
		{
			System.out.println("You are authorized");
		}
		else
		{
			throw new UncheckedException("Not possible");
		}
	}

}