package com.ooad.chap1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List guitars;
	
	public Inventory()
	{
		guitars = new LinkedList();
	}
	
	public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price)
	{
		Guitar g = new Guitar("01", "Faisa Guitars", "g001", "Electric", "bw", "tw", 5000d);
		
		guitars.add(g);
	}
	
	public Guitar getGuitar(String serialNumber)
	{
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar g = (Guitar)i.next();
			if(g.getSerialNumber().equals(serialNumber))
			{
				return g;
			}
		}
		return null;
	}
	
	public Guitar search(Guitar searchGuitar)
	{
		for(Iterator i = guitars.iterator(); i.hasNext();)
		{
			Guitar g = (Guitar)i.next();
			
			String builder = searchGuitar.getBuilder();
			if((builder != null) && (!builder.equals("")) && (!builder.equals(g.getBuilder())))
			{
				continue;
			}
			
			String model = searchGuitar.getModel();
			if((model != null) && (!model.equals("")) && (!model.equals(g.getModel())))
			{
				continue;
			}
			
			String type = searchGuitar.getBuilder();
			if((type != null) && (!type.equals("")) && (!type.equals(g.getType())))
			{
				continue;
			}
			
			String backWood = searchGuitar.getBackWood();
			if((backWood != null) && (!backWood.equals("")) && (!backWood.equals(g.getBackWood())))
			{
				continue;
			}
			
			String topWood = searchGuitar.getTopWood();
			if((topWood != null) && (!topWood.equals("")) && (!topWood.equals(g.getTopWood())))
			{
				continue;
			}
		}
		return null;
	}

}
