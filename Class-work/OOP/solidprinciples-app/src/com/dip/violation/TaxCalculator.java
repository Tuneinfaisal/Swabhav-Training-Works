package com.dip.violation;

public class TaxCalculator {
	
	private ErrorLogType log;
	
	public TaxCalculator(ErrorLogType log)
	{
		this.log = log;
	}
	
//	public double calculateTax(int amount, int rate)
//	{
//		try {
//			int result = amount/rate;
//		}
//		catch(Exception ex){
//			ex = new Exception();
//		}
//	}
	
//	public void setLog(ErrorLogType log)
//	{
//		this.log = log;
//	}
	
	public ErrorLogType getLog()
	{
		return log;
	}

}
