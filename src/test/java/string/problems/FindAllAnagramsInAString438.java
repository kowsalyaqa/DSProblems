package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;


public class FindAllAnagramsInAString438 {
	/**
	 * 15:54 - 16:02 - understand the question
	 * 
	 * Pseudo Code: 17:02 - 17:24  
		----------------------
		1.Declare two sMap and pMap with Type <Character,Integer> for s and p string, int pointer=0, List<Integer> list=new ArrayList<>(), int n=p.length;
		2.Iterate while loop using p.length to add elements in pHashMap
		3.Iterate while(pointer<s.length) to check each fixed p.length substring is mactched with p string
		4.Add fixed size character into sMap using while(pointer<p.length)
		5.Once added sMap, compare sMap and pMap, equal, add first index of s substring to list
		6.remove start index value of s substring string from map if value==1,else decrement value by 1
		7.increment pointer,add increment pointer value of s string into map with frequency
		8.once iteration is completed return list value
	 * 
	 * Code - 1 hour
	 * Run & Debug - 1 hour
	 * 
	 * Total Time - 3 hour
	 * 
	 * Time complexity - O(N^M)
	 * Space Complexity - O(N+M)
	 * 
	 * 
	 * 
	 */
	//@Test
	public void tdp1() {
		String s="cbaebabacd";
		String p="abc";
		List<Integer> expected=new ArrayList<>();
		expected.add(0);
		expected.add(6);
		List<Integer> actual=findAnagrams(s,p);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp2() {
		String s="abab";
		String p="ab";
		List<Integer> expected=new ArrayList<>();
		expected.add(0);
		expected.add(1);
		expected.add(2);
		List<Integer> actual=findAnagrams(s,p);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String s="abacbabc";
		String p="abc";
		List<Integer> expected=new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(5);
		List<Integer> actual=findAnagrams(s,p);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		String s="aaaaaaaaaa";
		String p="aaaaaaaaaaaaa";
		List<Integer> expected=new ArrayList<>();
		List<Integer> actual=findAnagrams(s,p);
		Assert.assertEquals(expected, actual);
	}

	public List<Integer>findAnagrams(String s, String p){
		if(s.length()<p.length()) return new ArrayList<>();
		int pointer=0;
		List<Integer> list=new ArrayList<>();
		Map<Character,Integer> sMap=new HashMap<>();
		Map<Character,Integer> pMap=new HashMap<>();
		
		for(char c:p.toCharArray()) pMap.put(c,pMap.getOrDefault(c,0)+1);
		
		while(pointer<p.length()) {
			sMap.put(s.charAt(pointer),sMap.getOrDefault(s.charAt(pointer),0)+1);
			pointer++;
		}
		if (sMap.equals(pMap)) list.add(pointer-p.length());
		
		while(pointer<s.length()) {	
			Integer frequency = sMap.get(s.charAt(pointer-p.length()));
			if(frequency==1) {
				sMap.remove(s.charAt(pointer-p.length()));
			}else {
			sMap.put(s.charAt(pointer-p.length()),sMap.getOrDefault(s.charAt(pointer-p.length()),0)-1);
			}
			sMap.put(s.charAt(pointer),sMap.getOrDefault(s.charAt(pointer), 0)+1);
			if (sMap.equals(pMap)) list.add(pointer-p.length()+1);
			pointer++;
		}
		return list;
	}
}
