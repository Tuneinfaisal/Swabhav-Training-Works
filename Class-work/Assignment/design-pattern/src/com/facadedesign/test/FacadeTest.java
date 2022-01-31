package com.facadedesign.test;

import com.facadedesign.FacadeHelper;

public class FacadeTest {
	
	public static void main(String[] args)
	{
		FacadeHelper.generateReport("Chrome", "html");
		FacadeHelper.generateReport("Chrome", "junit");
		System.out.println();
		FacadeHelper.generateReport("Firefox", "html");
		FacadeHelper.generateReport("Firefox", "junit");
	}
	
}
