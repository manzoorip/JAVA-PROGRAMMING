package com.ayan.tech;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestMain {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

Singleton OriginalObject=Singleton.getInstance();
Singleton duplicateObject=Singleton.getInstance();

System.out.println("OriginalObject: "+ OriginalObject.hashCode());
System.out.println("duplicateObject:"+ duplicateObject.hashCode());

System.out.println("------------------Break Singleton By Reflection---------------------");

Class<?> singleton=Class.forName("com.ayan.tech.Singleton");
@SuppressWarnings("unchecked")
Constructor<Singleton> constructor=(Constructor<Singleton>) singleton.getDeclaredConstructor();
constructor.setAccessible(true);
Singleton breakSingletonObject=constructor.newInstance();

System.out.println("OriginalObject: "+ OriginalObject.hashCode());
System.out.println("duplicateObject:"+ breakSingletonObject.hashCode());


	}
}
//Remark or Description
