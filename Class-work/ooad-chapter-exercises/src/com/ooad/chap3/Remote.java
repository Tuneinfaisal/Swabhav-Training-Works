package com.ooad.chap3;

public class Remote {
	
	public DogDoor door;

	public Remote(DogDoor door)
	{
		this.door = door;
	}

	public void pressButton()
	{
		System.out.println("Pressing the button...");
		if (door.isOpen()) {
			door.close();
		}
		else
		{
			door.open();
		}
	}

}
