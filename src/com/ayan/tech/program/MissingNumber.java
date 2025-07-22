package com.ayan.tech.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		//Integer number=(1,2,3,4,6,7,8,9,11);  //given
		List<Integer> number=Arrays.asList(1,2,3,4,6,7,8,9,11);
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=number.size()+1;i++)
		{
			list.add(i);			
		}

		list.stream().filter(x->!number.contains(x)).forEach(System.out::println);
		
	}
}
