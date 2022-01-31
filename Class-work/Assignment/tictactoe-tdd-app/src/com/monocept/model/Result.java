package com.monocept.model;

public class Result {
	
	private PossibleResult result = PossibleResult.WIN; 
	
	public Result()
	{
		
	}
	
	public void setResult(PossibleResult result)
	{
		this.result = result;
	}
	
	public PossibleResult getResult()
	{
		return result;
	}

}
