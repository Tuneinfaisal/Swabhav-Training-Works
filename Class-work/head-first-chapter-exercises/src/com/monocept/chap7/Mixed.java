package com.monocept.chap7;

import com.monocept.chap7.A;

public class Mixed {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		A a2 = new C();
		
		a.m1();
		b.m2();
		c.m3();
	}

}
