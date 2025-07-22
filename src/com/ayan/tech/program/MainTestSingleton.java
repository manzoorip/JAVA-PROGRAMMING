package com.ayan.tech.program;

public class MainTestSingleton {

	public static void main(String[] args) {
		 
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}

class Singleton
{
	
	private static Singleton s=null;
	
	private Singleton()
	{
		System.out.println("I am singleton class constructor");
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
