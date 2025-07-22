package com.ayan.tech.program;

import java.util.Arrays;
import java.util.Optional;

public class FindLongestWord {

	public static void main(String[] args) {
		String[] str= {"java","kubernates","microservices","springboot","python"};
		Optional<String> word=Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2);
		if(word.isPresent())
		{
			System.out.println(word.get());
		}
	}
}
