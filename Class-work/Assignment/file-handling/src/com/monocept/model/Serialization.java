package com.monocept.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) throws Exception
	{
		
		Save obj = new Save();
		obj.n = 6;
		
		//  Serializing
		File fName = new File("C:\\Users\\tunei\\Desktop\\num.txt");
		FileOutputStream fos = new FileOutputStream(fName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		//  DeSerializing
		FileInputStream fis = new FileInputStream(fName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Save obj1 = (Save) ois.readObject();
		
		System.out.println("Value is " + obj1.n);
	}

}

class Save implements Serializable
{
	int n;
}
