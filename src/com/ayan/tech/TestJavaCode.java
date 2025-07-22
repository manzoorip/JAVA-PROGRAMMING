package com.ayan.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestJavaCode {

	public static void main(String[] args) {
				/*
		 * String str="pooja"; String[] str1=str.split("");
		 * Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),
		 * LinkedHashMap::new,Collectors.counting()))
		 * .entrySet().stream().filter(x->x.getValue()>=1).forEach(System.out::println);
		 */
		
				/*
				 * String[] str= {"java","kubernates","microservices","springboot","python"};
				 * String
				 * word=Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?
				 * word1:word2).get(); System.out.println(word);
				 */	
		
				/*
				 * String[]
				 * str={"java","kubernates","microservices","springboot","python","try","sky"};
				 * Arrays.stream(str).filter(x->!x.matches(".*[aeiou].*")).forEach(System.out::
				 * println);
				 */
				/*
				 * String str="ilovejavatechi"; String[] str1=str.split(""); String
				 * stt=Arrays.stream(str1).collect(Collectors.groupingBy(Function.identity(),
				 * LinkedHashMap::new,Collectors.counting()))
				 * .entrySet().stream().filter(x->x.getValue()>1).findFirst().get().getKey();
				 * System.out.println(stt);
				 */
		
				/*
				 * String[]
				 * str={"java","kubernates","microservices","springboot","python","try","sky"};
				 * Arrays.stream(str).collect(Collectors.groupingBy(String::length)).forEach((
				 * length,word)->System.out.println("Length:"+ length +":" + word));
				 */
				/*
				 * String str="abcabcbb"; LongestSubString(str);
				 */
		//wrapper class and diff between wrapper and int data type
		//Integer number=(1,2,3,4,6,7,8,9,11);  //given
		/*
		 * List<Integer> listNumber=Arrays.asList(1,2,3,4,6,7,8,9,11); List<Integer>
		 * list=new ArrayList<Integer>(); for(int i=1;i<=listNumber.size()+1;i++) {
		 * list.add(i);
		 * 
		 * }
		 * 
		 * list.stream().filter(x->!listNumber.contains(x)).forEach(System.out::println)
		 * ;
		 */
		/*
		 * String str="madam"; isPolindrom(str);
		 */
		/*
		 * String str="programming"; StringBuffer sb=new StringBuffer();
		 * str.chars().distinct().forEach(x->sb.append((char)x));
		 * System.out.println(sb);
		 */
		
		/*
		 * String[] str={"manzoor","","hydrabad","NULL","Pune",null};
		 * Arrays.stream(str).filter(x->x!=null &&
		 * (!x.isEmpty())).forEach(System.out::println);
		 */
		
		/*
		 * String[]
		 * str={"java","kubernates","microservices","springboot","python","try","sky"};
		 * Arrays.stream(str).map(x->new
		 * StringBuilder(x).reverse()).forEach(System.out::println);
		 */
		
		/*
		 * int[] number= {5,9,11,2,8,21,1}; //given Integer
		 * value=Arrays.stream(number).boxed().sorted(Comparator.reverseOrder()).skip(1)
		 * .findFirst().get(); System.out.println(value);
		 */
		
		List<Integer> list=Arrays.asList(1,2,3,6,9,11,43,23,67,89,32,21,3,43);
		Integer sum=list.stream().distinct().filter(TestJavaCode::isPrime).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
	/*
	 * public static void isPolindrom(String str) { int bp=str.length()-1; Boolean
	 * checkboolean=IntStream.range(0,
	 * str.length()).allMatch(x->str.charAt(x)==str.charAt(bp-x)); if(checkboolean)
	 * { System.out.println("String is Polindrom"); }else {
	 * System.out.println("String is NOT Polindrom"); } }
	 */
	
	/*
	 * public static void LongestSubString(String str) { String
	 * LongestSubString=null; int LongestSubStringLength=0; str="abcabcbb"; char[]
	 * arr=str.toCharArray(); Map<Character,Integer> map=new HashMap<>(); for(int
	 * i=1;i<arr.length;i++) { char ch=arr[i]; if(!map.containsKey(ch)) {
	 * map.put(ch, i);
	 * 
	 * }else { map.put(ch, i); map.clear(); }
	 * 
	 * if(map.size()>LongestSubStringLength) { LongestSubStringLength=map.size();
	 * LongestSubString=map.keySet().toString(); } }
	 * 
	 * System.out.println(LongestSubStringLength);
	 * System.out.println(LongestSubString); }
	 */
	
	public static boolean isPrime(int number)
	{
		if(number<=1)
		return false;
		
		return IntStream.rangeClosed(2, (int)Math.sqrt(number)).allMatch(x->number%x!=0);
	}
}
