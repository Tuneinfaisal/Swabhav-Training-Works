package com.ooad.chap1;

public enum Builder {
	
FENDER , MARTIN, GIBSON, COLLINGS, OLSON, RYAN, FRS, ANY;
	
	public String toString()
	{
		switch(this)
		{
			case FENDER: return "FENDER";
			case MARTIN: return "MARTIN";
			case GIBSON: return "GIBSON";
			case COLLINGS: return "COLLINGS";
			case OLSON: return "OLSON";
			case RYAN: return "RYAN";
			case FRS: return "FRS";
			case ANY: return "ANY";
		}
		return null;
	}

}
