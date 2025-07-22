package com.ayan.tech.program;

import java.util.Arrays;

public class FindVowels {

	public static void main(String[] args) {
		String[] str= {"java","kubernates","microservices","springboot","python","try","sky"};
		Arrays.stream(str).filter(x->x.matches(".*[aeiou].*")).forEach(System.out::println);
		//Arrays.stream(str).filter(x->!x.matches(".*[aeiou].*")).forEach(System.out::println);
		
		
	}
}
