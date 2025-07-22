package com.ayan.tech.program;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String str="programming";
		StringBuilder sb=new StringBuilder();
		str.chars().distinct().forEach(c->sb.append((char)c));
		System.out.println(sb);
		
	}
}
