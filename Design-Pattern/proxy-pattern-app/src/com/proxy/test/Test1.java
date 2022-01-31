package com.proxy.test;

import com.proxy.Image;
import com.proxy.RealImage;

public class Test1 {
	
	public static void main(String[] args)
	{
		Image img1 = new RealImage("River.jpg");
		Image img2 = new RealImage("Mountain.jpg");
		Image img3 = new RealImage("Lake.jpg");
		
//		img1.display();
//		img2.display();
		img3.display();
	}

}
