package com.monocept.chap8;

abstract class NewPhone {
	public void call()
	{
		System.out.println("Calling");
	}
	
	public abstract void message();
	public abstract void video();
	public abstract void music();

}

abstract class NewPhone2 extends NewPhone {
	public void message()
	{
		System.out.println("Messenging");
	}
	
}

class NewPhone3 extends NewPhone2 {
	public void video()
	{
		System.out.println("Playing video");
	}
	public void music()
	{
		System.out.println("Playing music");
	}
}
