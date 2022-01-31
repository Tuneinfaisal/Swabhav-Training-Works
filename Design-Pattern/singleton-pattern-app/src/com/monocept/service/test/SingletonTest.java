package com.monocept.service.test;

import com.monocept.service.DataService;

public class SingletonTest {
	
	public static void main(String[] args)
	{
//		DataService sv1 = new DataService();
//		DataService sv2 = new DataService();
//		
//		System.out.println(sv1.hashCode());
//		System.out.println(sv2.hashCode());
		
		DataService sv1 = DataService.getServiceInstance();
		DataService sv2 = DataService.getServiceInstance();
		
		System.out.println(sv1.hashCode());
		System.out.println(sv2.hashCode());
		
		sv1.doSomething();
		sv2.doSomething();
	}

}
