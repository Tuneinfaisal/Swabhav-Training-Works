package com.monocept.chap11;

import javax.sound.midi.*;

public class MusicTest1 {

	public static void main(String[] args) throws MidiUnavailableException
	{
		MusicTest1 mt = new MusicTest1();
		mt.play();

	}

	void play() throws MidiUnavailableException
	{
		Sequencer sequencer = MidiSystem.getSequencer();
		System.out.println("We got a sequencer");
		
	}

}
