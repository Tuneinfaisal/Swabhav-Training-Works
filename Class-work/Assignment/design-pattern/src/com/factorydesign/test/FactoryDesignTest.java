package com.factorydesign.test;

import com.factorydesign.Os;
import com.factorydesign.OsFactory;

public class FactoryDesignTest {
	
	public static void main(String[] args)
	{
		OsFactory osf = new OsFactory();
		Os o = osf.getInstance("Opn");
		o.specs();
	}

}
