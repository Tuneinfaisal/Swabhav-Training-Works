package com.monocept.model.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ReflectionTest {
	
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class c = Class.forName("java.lang.Object");
		
		System.out.println("Getting constructor----->>>");
		Constructor[] cons = c.getConstructors();
		System.out.println(Arrays.toString(cons));
		System.out.println();
		
		System.out.println("Getting all methods----->>>");
		Method[] allMethods =  c.getMethods();
		System.out.println(Arrays.toString(allMethods));
		System.out.println();
		
		System.out.println("Getting methods of the class----->>>");
		Method[] methods = c.getDeclaredMethods();
		System.out.println(Arrays.toString(methods));
		System.out.println();
		
		System.out.println("Getting fields----->>>");
		Field[] field = c.getFields();
		System.out.println(Arrays.toString(field));
		System.out.println();
		
		System.out.println("Getting declared fields----->>>");
		Field[] declaredField = c.getDeclaredFields();
		System.out.println(Arrays.toString(declaredField));
	}

}
