package com.ayan.tech.program;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OccurrenceOfNumbers {
	
//Question: Write a program to find the occurrence of numbers in array in sorted order by using streams API int[] arr = new int[]{99,-1,0,1,0,99,-1,2,99}
	
	public static void main(String[] args) {
		
		int[] arr = new int[]{99, -1, 0, 1, 0, 99, -1, 2, 99};
		Map<Integer,Long> value=IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		System.out.println(value);
		
		//----OR------
		Map<Integer,Long> value1=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),TreeMap::new,Collectors.counting()));
		System.out.println(value1);
	}
}
//Remark: 
//Explanation:
//IntStream.of(arr) – creates a stream from the int[].

//.boxed() – converts primitive int to Integer.

//Collectors.groupingBy(...) – groups the numbers.

//TreeMap::new – ensures that keys are sorted.

//Collectors.counting() – counts how many times each number appears.