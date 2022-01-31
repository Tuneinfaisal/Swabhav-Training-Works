package com.monocept.model.part1.test;

import com.monocept.model.part1.AutoType;
import com.monocept.model.part1.AutomobileFactory;
import com.monocept.model.part1.IAutomobile;

public class AutomobileFactoryTest {
	
	public static void main(String[] args)
	{
		AutomobileFactory amf = AutomobileFactory.getInstance();
		IAutomobile ia = amf.make(AutoType.AUDI);
//		System.out.println(ia.getClass());
		ia.start();
		ia.stop();
		System.out.println();
		
		amf = AutomobileFactory.getInstance();
		ia = amf.make(AutoType.BMW);
		ia.start();
		ia.stop();
	}

}
