package com.ooad.chap4;

import java.awt.List;
import java.util.Iterator;

import com.ooad.chap3.DogDoor;

public class BarkRecognizer {
	
	private DogDoor door;
	
	public void recognize(Bark bark) {
		System.out.println(" BarkRecognizer : Heard a '" + bark.getSound() + "'");
		List allowedbarks = door.getAllowedBarks();
		for (Iterator i = allowedbarks.iterator(); i.hasNext();) {
			Bark allowedBark = (Bark) i.next();
			if (allowedBark.equals(bark)) {
				door.open();
				return;
			}
		}
		System.out.println("this dog is not allowed");
	}

}
