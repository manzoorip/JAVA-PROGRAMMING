package com.ayan.tech.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//Question: Remove the duplicate element from the List
public class RemoveDuplicateElementFromList {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<Object>(); 
		list.add("Hellow");
		list.add("MAA");
		list.add("M");
		list.add("@");
		list.add("#");
		list.add("M");
		list.add(55);
		list.add(45);
		list.add(11);
		list.add(55);
		
		System.out.println("Original List Value:"+ list);

		//Map<Object,Long>value=list.stream().filter(word->Collections.frequency(list, word)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//System.out.println(value);
		
		List<Object> removeDuplicate = removeDuplicate(list);
		System.out.println("After Duplicate Element Removed:"+ removeDuplicate);
	}
	
	public static List<Object> removeDuplicate(List<Object> list)
	{
		Set<Object> set=new LinkedHashSet<Object>(list);
		return new ArrayList<>(set);
	}
}
