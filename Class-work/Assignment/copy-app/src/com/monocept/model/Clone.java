package com.monocept.model;

public class Clone implements Cloneable{
	
	public int a = 0;
	public int b = 0;
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
