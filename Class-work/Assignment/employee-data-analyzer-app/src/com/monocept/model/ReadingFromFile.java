package com.monocept.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class ReadingFromFile implements Loader{

	@Override
	public Set<String> loading()throws FileNotFoundException,IOException
	{
		String record;
		BufferedReader bufferedReader = new BufferedReader(new FileReader("dataFile.txt"));
		HashSet<String> hashSet = new HashSet<String>();
		while ((record = bufferedReader.readLine()) != null)
		{
			hashSet.add(record);
		}
		return hashSet;
	}

}
