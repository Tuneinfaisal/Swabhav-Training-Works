package com.factorydesign;

public class OsFactory {
	
	public Os getInstance(String s)
	{
		if(s.equals("Open"))
		{
			return new Android();
		}
		else
		{
			return new Ios();
		}
	}

}
