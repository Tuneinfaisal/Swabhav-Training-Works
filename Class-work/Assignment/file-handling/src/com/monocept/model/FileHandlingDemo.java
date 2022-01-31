package com.monocept.model;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingDemo {
	public static void main(String[] args) throws Exception
	{
		File fName = new File("name.txt");
		FileOutputStream fos = new FileOutputStream(fName);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("Demo");
		
		FileInputStream fis = new FileInputStream(fName);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);
	}
}