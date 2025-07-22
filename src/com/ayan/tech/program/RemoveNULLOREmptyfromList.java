package com.ayan.tech.program;

import java.util.Arrays;

public class RemoveNULLOREmptyfromList {

	public static void main(String[] args) {
		String[] str= {"manzoor","","hydrabad","NULL","Pune",null};
		Arrays.stream(str).filter(x->x!=null && (!x.isEmpty())).forEach(System.out::println);
		
	}
}
