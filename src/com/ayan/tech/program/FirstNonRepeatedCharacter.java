package com.ayan.tech.program;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str="ilovejavatechi";
		String[] str1=str.split("");
		String stt=Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).findFirst().get().getKey();
		System.out.println(stt);
	}
}
