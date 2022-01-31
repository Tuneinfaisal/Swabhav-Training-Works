package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;

public class ReadingFromUrl implements Loader{
	
	@Override
	public Set<String> loading() throws FileNotFoundException, IOException
	{
		String record;
		URL url = new URL("https://swabhav-tech.firebaseapp.com/emp.txt");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
		HashSet<String> hashSet = new HashSet<String>();
		while((record = bufferedReader.readLine())!=null)
		{
			hashSet.add(record);
		}
		return hashSet;
	}

}
