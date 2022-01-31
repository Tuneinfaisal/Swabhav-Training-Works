package com.monocept.test;

import com.monocept.model.Car;
import com.monocept.model.Honda;
import com.monocept.model.Mahindra;
import com.monocept.model.Tata;

public class CarTest {
	
	public static void main(String[] args)
	{
		Car c;
		
		c = new Honda();
		c.wheel();
		
		c = new Mahindra();
		c.wheel();
		
		c = new Tata();
		c.wheel();
	}

}
