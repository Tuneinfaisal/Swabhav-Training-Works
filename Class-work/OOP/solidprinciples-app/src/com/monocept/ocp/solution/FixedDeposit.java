package com.monocept.ocp.solution;

public abstract class FixedDeposit {
	
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private IFestivalRatePolicyInterface festival;
	
	public FixedDeposit(int accno, String name, double principle, int duration, IFestivalRatePolicyInterface festival)
	{
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	
//	public double calculateSimpleInterest()
//	{
//		return(this.principle * this.duration * calculateRate());
//	}

	public int getAccno()
	{
		return accno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrinciple()
	{
		return principle;
	}
	
	public int getDuration()
	{
		return duration;
	}
	
//	public IFestivalRatePolicyInterface getFestival()
//	{
//		return festival;
//	}


	public double calculateSimpleInterest()
	{
		return(this.principle * this.duration * festival.calculateRate());
	}

}
