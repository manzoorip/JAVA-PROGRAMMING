package com.ayan.tech.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingCharacter {

	public static void main(String[] args) {
		
		String str="abcabcbb";
		LongestSubString(str);
		
	}
	
	public static void LongestSubString(String str)
	{
		String LongestSubString=null;
		int LongestSubStringLength=0;
		str="abcabcbb";
		Map<Character,Integer> map=new LinkedHashMap<>();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch=arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}else
			{
				map.put(ch, i);
				map.clear();
			}
			
			if(map.size()>LongestSubStringLength)
			{
				LongestSubStringLength=map.size();
				LongestSubString=map.keySet().toString();
			}
		}
		
		System.out.println("LongestSubString is:"+ LongestSubString);
		System.out.println("LongestSubStringLength is:"+ LongestSubStringLength);
		
	}
}
