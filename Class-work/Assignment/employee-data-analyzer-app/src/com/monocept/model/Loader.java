package com.monocept.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

public interface Loader {
	
	public Set<String>loading()throws FileNotFoundException, IOException;

}
