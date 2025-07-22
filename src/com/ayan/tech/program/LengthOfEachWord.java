package com.ayan.tech.program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LengthOfEachWord {

	public static void main(String[] args) {
		
		String[] str= {"java","kubernates","microservices","springboot","python"};
		Arrays.stream(str).collect(Collectors.groupingBy(String::length)).forEach((length,word)->System.out.println(length +": "+word));
		
		
	}
}
