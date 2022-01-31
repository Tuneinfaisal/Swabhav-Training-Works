package com.monocept.chap16;

import java.util.*;

public class JukeBox6 {

	ArrayList<Song> songList = new ArrayList<Song>();
	
	public static void main(String[] args) {
		new JukeBox6().go();
	}

	// main method etc.
	public void go() {
		getSongs();
		System.out.println(songList);
		Collections.sort(songList);
		
		System.out.println(songList);
		HashSet<Song> songSet = new HashSet<Song>();
		
		songSet.addAll(songList);
		System.out.println(songSet);
	}

	private void getSongs() {
//		System.out.println(songList);
	}

}
