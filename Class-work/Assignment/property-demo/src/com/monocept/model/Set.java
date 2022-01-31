package com.monocept.model;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Set {
	
	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		OutputStream os = new FileOutputStream("dataConfig.properties");
		
		p.setProperty("website", "monocept.com");
		p.setProperty("username", "faisal");
		p.setProperty("password", "123");
		
		p.store(os, null);
	}

}
