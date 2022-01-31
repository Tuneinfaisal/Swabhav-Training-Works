package com.monocept.model;

public class Cell {
	
	private Mark mark = Mark.EMPTY;
	
//	public Cell() {}
	
	public String isEmpty()
	{
		return "X";
	}
	
	public void setMarker(Mark mark) throws Exception
	{
		if(this.mark == Mark.EMPTY)
		{
			this.mark = mark;
		}
		else
		{
			throw new Exception("Already marked");
		}
	}
	
	public Mark getMarker()
	{
		return mark;
	}
	
}
