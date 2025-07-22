package com.ayan.tech.program;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class BreakSingletonClass {

	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Singletonclass originalvalue=Singletonclass.getInstance();
		Singletonclass duplicatevalue=Singletonclass.getInstance();
		
		System.out.println(originalvalue.hashCode());
		System.out.println(duplicatevalue.hashCode());
		System.out.println("==========================================================");
		
		//Break Singleton class by Refelection
		Class<?> singletonclass=Class.forName("com.ayan.tech.program.Singletonclass");
		@SuppressWarnings("unchecked")
		Constructor<Singletonclass> constructor=(Constructor<Singletonclass>) singletonclass.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singletonclass breaksingletonlvalue=constructor.newInstance();
		
		System.out.println(originalvalue.hashCode());
		System.out.println(breaksingletonlvalue.hashCode());
	}
	
}

	class Singletonclass
	{
		private static Singletonclass s=null;
		private Singletonclass()
		{
			System.out.println("i am a singleton constructor");
		}
		
		public static synchronized Singletonclass getInstance()
		{
			if(s==null)
			{
				s=new Singletonclass();
			}
			return s;
		}
	}
	
