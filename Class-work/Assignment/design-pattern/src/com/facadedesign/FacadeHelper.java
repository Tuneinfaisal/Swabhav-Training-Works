package com.facadedesign;

import java.sql.Driver;

public class FacadeHelper {
	
	public static void generateReport(String explorer, String report)
	{
		Driver driver = null;
		
		if(explorer == "Chrome")
		{
			driver = Chrome.getChromeDriver();
			if(report == "html")
			{
				Chrome.generateHtmlReport(driver);
			}
			if(report == "junit")
			{
				Chrome.generateJunitReport(driver);
			}
		}
		
		if(explorer == "Firefox")
		{
			driver = Firefox.getFirefoxDriver();
			if(report == "html")
			{
				Firefox.generateHtmlReport(driver);
			}
			if(report == "junit")
			{
				Firefox.generateJunitReport(driver);
			}
		}
	}
}
