package com.ayan.tech.program;

import java.util.Arrays;

public class SquareNumberWithCondition {

//Find the square number of a given integer array {1,4,7,8,9,10} and check if square number is greater than 50 then print that number
	public static void main(String[] args) {
		
		int[] arr={1,4,7,8,9,10};
		Arrays.stream(arr).map(x->x*x).filter(x->x>50).forEach(System.out::println);

	}
}
