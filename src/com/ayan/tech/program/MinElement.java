package com.ayan.tech.program;

import java.util.Arrays;

public class MinElement {
	
//Question: Find the minimum nuber or element of the given arrays.
	
	public static void main(String[] args) {
		
		int[] num={10,1,15,20,-19,-34,0};
		Arrays.stream(num).min().ifPresent(System.out::println);
	}
}
