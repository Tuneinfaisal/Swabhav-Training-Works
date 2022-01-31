package com.monocept.chap16;

public class Song implements Comparable<Song>{

	String title;
	String artist;
	String rating;
	String bpm;
	
	public int compareTo1(Song s)
	{
		return title.compareTo(s.getTitle());
	}
	
	public int hashCode()
	{
		return title.hashCode();
	}
	
	Song(String t, String a, String r, String b)
	{
		title = t;
		artist = a;
		rating = r;
		bpm = b;
	}

	public String getTitle()
	{
		return title;
	}

	public String getArtist()
	{
		return artist;
	}

	public String getRating()
	{
		return rating;
	}

	public String getBpm()
	{
		return bpm;
	}

	public String toString()
	{
		return title;
	}

	@Override
	public int compareTo(Song o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
