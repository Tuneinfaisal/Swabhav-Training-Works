package com.ooad.chap4;

import java.awt.List;

public class DogDoor {
	
	@SuppressWarnings("unused")
	private boolean open;
	private String allowedBark;

	public DogDoor()
	{
		this.open = false;
	}

	public String getAllowedBark()
	{
		return allowedBark;
	}

	public void setAllowedBark(String Bark)
	{
		this.allowedBark = Bark;
	}

	public void addAllowedBark(Bark bark) {
		// TODO Auto-generated method stub
		
	}
	
	public List getAllowedBarks() {
		// TODO Auto-generated method stub
		return null;
	}

}
