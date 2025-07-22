package com.ayan.tech;

public class Singleton {

	private static Singleton s=null;
	
	private Singleton()
	{
		System.out.println("I am in Singleton constructor");
	}
	
	public static synchronized Singleton getInstance()
	{
		if(s==null)
		{
			s=new Singleton();
		}
		
		return s;
	}
}
