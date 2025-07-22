package com.ayan.tech.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SumOfPrimeNumbers {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,6,9,11,43,23,67,89,32,21,3,43);
		int sum=list.stream().distinct().filter(SumOfPrimeNumbers::isPrimeNumber).mapToInt(Integer::intValue).sum();
		//list.stream().distinct().filter(SumOfPrimeNumbers::isPrimeNumber).mapToInt(Integer::intValue).forEach(System.out::println);
		System.out.println("sum:"+ sum);
		
// find the prime number between 1 to 150;
	//	List<Integer> list=new ArrayList<>();
	//	for(int i=1;i<=150;i++)
		//{
		//	list.add(i);
		//}
		//list.stream().filter(Test::isPrime).mapToInt(Integer::intValue).forEach(System.out::println);
		
	}
	
	public static boolean isPrimeNumber(int number)
	{
		
		if(number<=1) return false;
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(n->number%n!=0);
		
	}
}
