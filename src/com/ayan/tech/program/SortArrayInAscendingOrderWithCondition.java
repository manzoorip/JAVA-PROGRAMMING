package com.ayan.tech.program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayInAscendingOrderWithCondition {

//Question: //Sort the arrays {4,2,0,6,1,0,7,0,9,8,3} in ascending order and 0 should be in last by using java8 stream api
	
	public static void main(String[] args) {
		
		int[] num={4,2,0,6,1,0,7,0,9,8,3};
		List<Integer> list=Arrays.stream(num).boxed().sorted().filter(x->x!=0).collect(Collectors.toList());
		List<Integer> list1=Arrays.stream(num).boxed().filter(x->x==0).collect(Collectors.toList());
		for(int i=0;i<list1.size();i++)
		{
			list.add(0);
		}
		System.out.println(list1);
		System.out.println(list);
	}
	
}
