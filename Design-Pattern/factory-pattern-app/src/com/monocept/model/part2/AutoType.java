package com.monocept.model.part2;

public enum AutoType {
	
	BMW,AUDI,TESLA;

	IAutomobile createAutoType()
	{
		switch(this)
		{
			case BMW : return new BMW();
			case AUDI : return new Audi();
			case TESLA : return new Tesla(); 
		}
		return null;
	}

}
