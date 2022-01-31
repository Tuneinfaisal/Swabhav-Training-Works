package com.isp.violation.test;

import com.isp.violation.IWorker;
import com.isp.violation.Manager;
import com.isp.violation.Robot;

public class IspViolationTest {
	
	public static void main(String[] args)
	{
		Manager m;
		Robot r;
		m = new Manager();
		r = new Robot();
		
		atWorkStation(m);
		atWorkStation(r);
		
		atTheCafateria(m);
		atTheCafateria(r);
	}
	
	private static void atWorkStation(IWorker m)
	{
		System.out.println("At the work station");
		m.startWork();
		m.startEat();
		System.out.println();
	}

	private static void atTheCafateria(IWorker m)
	{
		System.out.println("At the cafeteria");
		m.startWork();
		m.startEat();
	}

}
