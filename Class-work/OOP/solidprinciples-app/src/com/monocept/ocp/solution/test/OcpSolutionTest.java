package com.monocept.ocp.solution.test;

import com.monocept.ocp.solution.EidRatePolicy;
import com.monocept.ocp.solution.FixedDeposit;
import com.monocept.ocp.solution.NormalRatePolicy;

public class OcpSolutionTest {
	
	public static void main(String[] args)
	{
		NormalRatePolicy nrp = new NormalRatePolicy();
		
		FixedDeposit fd1 = new FixedDeposit(101, "Faisal", 1000d, 4, nrp)
		{
		};
		printDetails(fd1);
		
		EidRatePolicy erp = new EidRatePolicy();
		
		FixedDeposit fd2 = new FixedDeposit(101, "Faisal", 1000d, 4, erp)
		{
		};
		printDetails(fd2);
	}

	private static void printDetails(FixedDeposit fd)
	{
		System.out.println("Simple interest : " + fd.calculateSimpleInterest());
	}

}
