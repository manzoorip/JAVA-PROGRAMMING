package com.ayan.tech.program;

import java.util.Arrays;

public class ReverseOfOriginalString {

	public static void main(String[] args) {
		String[] str= {"java","kubernates","microservices","springboot","python","try","sky"};
		Arrays.stream(str).map(x->new StringBuilder(x).reverse()).forEach(System.out::println);
	}
}
