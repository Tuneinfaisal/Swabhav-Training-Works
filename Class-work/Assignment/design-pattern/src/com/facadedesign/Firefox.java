package com.facadedesign;

import java.sql.Driver;

public class Firefox {
	
	public static Driver getFirefoxDriver()
	{
		return null;
	}

	public static void generateHtmlReport(Driver driver)
	{
		System.out.println("Generating html report for Firefox.");
	}

	public static void generateJunitReport(Driver driver)
	{
		System.out.println("Generating junit report for Firefox.");
	}

}
