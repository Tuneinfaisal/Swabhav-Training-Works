package com.isp.solution.test;

import com.isp.solution.IEatable;
import com.isp.solution.IWorkable;
import com.isp.solution.Manager;
import com.isp.solution.Robot;

public class IspSolutionTest {
	
	public static void main(String[] args)
	{
		Manager m;
		Robot r;
		
		m = new Manager();
		r = new Robot();
		
		atWorkStation(m);
		atWorkStation(r);
		
		atTheCafateria(m);
//		atTheCafateria(r);
	}
	
	private static void atWorkStation(IWorkable m)
	{
		System.out.println("At the work station");
		m.startWork();
		m.startWork();
		System.out.println();
	}

	private static void atTheCafateria(IEatable r)
	{
		System.out.println("At the cafeteria");
		r.startEat();
		r.startEat();
		System.out.println();
	}

}
