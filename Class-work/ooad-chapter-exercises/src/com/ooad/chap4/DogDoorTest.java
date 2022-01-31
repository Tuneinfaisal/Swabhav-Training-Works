package com.ooad.chap4;

//import com.ooad.chap2.Remote;
import com.ooad.chap3.Remote;
import com.ooad.chap4.BarkRecognizer;
import com.ooad.chap4.DogDoor;

public class DogDoorTest {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		DogDoor door = new DogDoor();
		door.addAllowedBark(new Bark("rowlf"));
		door.addAllowedBark(new Bark("rawlf"));
		door.addAllowedBark(new Bark("woof"));
		door.addAllowedBark(new Bark("bhauu"));
//		BarkRecognizer recognizer = new BarkRecognizer(door);
		
		@SuppressWarnings("unused")
		Remote remote = new Remote(door);
		System.out.println("\n bruce starts barking.");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("\n bruce has gone outside...");

		Bark smallDogBark = new Bark("yip");
		System.out.println("a small dog starts barking.");
		recognizer.recognize(smallDogBark);

		try
		{
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
		}

		System.out.println("\n bruce starts barking.");
		recognizer.recognize(new Bark("rowlf"));
		System.out.println("\n bruce back inside");
	}

}
