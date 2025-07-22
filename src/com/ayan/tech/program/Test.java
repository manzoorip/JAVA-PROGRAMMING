package com.ayan.tech.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
		
		int[] arr = new int[]{99, -1, 0, 1, 0, 99, -1, 2, 99};
		//Map<Integer,Long> value=IntStream.of(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(value);
		//Map<Integer,Long> value1=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(value1);
	List<Integer> list=new ArrayList<>();
	for(int i=1;i<=170;i++)
	{
		list.add(i);
	}
	list.stream().filter(Test::isPrime).mapToInt(Integer::intValue).forEach(System.out::println);
	
	}
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
		return false;
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(x->number%x!=0);
	}
	
}

