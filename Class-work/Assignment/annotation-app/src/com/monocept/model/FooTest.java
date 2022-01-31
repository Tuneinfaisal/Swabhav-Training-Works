package com.monocept.model;

import java.lang.reflect.Method;

public class FooTest {

	public static void main(String[] args) throws Exception
	{
		Foo f = new Foo();
		Class<?> c = f.getClass();
		for(Method m : c.getDeclaredMethods())
		{
			if(m.isAnnotationPresent(MyAnnotation.class))
			{
				m.setAccessible(true);
				m.invoke(f);
				System.out.println(m);
			}
		}
		
	}

}