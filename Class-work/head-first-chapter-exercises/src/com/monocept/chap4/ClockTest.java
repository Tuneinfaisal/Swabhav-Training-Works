package com.monocept.chap4;

import com.monocept.chap4.Clock;

public class ClockTest {
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("1234");
		String tod = c.getTime();
		System.out.println("Time is : " + tod);
	}

}
