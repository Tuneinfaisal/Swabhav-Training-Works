package com.monocept.ocp.violation;

public class FixedDeposit {
	
	private int accno;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festival;
	
	public FixedDeposit(int accno, String name, double principle, int duration, FestivalType festival)
	{
		this.accno = accno;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festival = festival;
	}
	
	public double calculateSimpleInterest()
	{
		return(this.principle * this.duration * calculateRate());
	}
	
	public float calculateRate()
	{
		if(this.festival == FestivalType.HOLI)
		{
			return 7f;
		}
		if(this.festival == FestivalType.DIWALI)
		{
			return 8f;
		}
		if(this.festival == FestivalType.EID)
		{
			return 6f;
		}
		return 5;
	}

}
