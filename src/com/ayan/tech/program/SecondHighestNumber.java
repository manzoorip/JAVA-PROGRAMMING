package com.ayan.tech.program;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] number= {5,9,11,2,8,21,1};  //given
		
		Integer SecondHighestNumber=Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(SecondHighestNumber);
	}
}
