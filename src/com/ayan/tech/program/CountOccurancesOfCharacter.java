package com.ayan.tech.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurancesOfCharacter {

	public static void main(String[] args) {
		
		String str="pooja";
		String[] str1=str.split("");
		Map<String,Long> value=Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		//.entrySet().stream().filter(x->x.getValue()>=1).forEach(System.out::println);		
		System.out.println(value);
	}
}
