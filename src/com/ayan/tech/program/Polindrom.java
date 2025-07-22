package com.ayan.tech.program;

import java.util.stream.IntStream;

public class Polindrom {

	public static void main(String[] args) {
		
		String str="madam";
		isCheckPolindrom(str);
	}
	
	public static void isCheckPolindrom(String str)
	{
		int bp=str.length()-1;
		boolean booleancheck=IntStream.range(0, str.length()).allMatch(x->str.charAt(x)==str.charAt(bp-x));
		if(booleancheck)
		{
			System.out.println("Given String: "+str+" is a Polindrom");
		}else {
			System.out.print("Given String:"+str+" is not a Polindrom");
		}
	}
	
}
