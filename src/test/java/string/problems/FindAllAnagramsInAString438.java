package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

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
	 * Code - 17:41
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void tdp1() {
		String s="cbaebabacd";
		String p="abc";
		List<Integer> expected=new ArrayList<>();
		expected.add(0);
		expected.add(6);
		List<Integer> actual=findAnagrams(s,p);
		Assert.assertEquals(expected, actual);
	}

	public List<Integer>findAnagrams(String s, String p){
		int pointer=0;
		List<Integer> list=new ArrayList<>();
		Map<Character,Integer> sMap=new HashMap<>();
		Map<Character,Integer> pMap=new HashMap<>();
		
		for(char c:p.toCharArray()) {
			pMap.put(c,pMap.getOrDefault(c,0)+1);
		}

		while(pointer<p.length()) {
			sMap.put(s.charAt(pointer),sMap.getOrDefault(pMap, 0)+1);
			pointer++;
		}
		
		while(pointer<s.length()) {
			if(sMap.equals(pMap))list.add(s.indexOf(s.charAt(
					pointer-p.length())));
			sMap.put(s.charAt(pointer),sMap.getOrDefault(s.charAt(pointer), 0)+1);	
			if(sMap.get(s.charAt(pointer-p.length()))==1) {
				sMap.remove(s.charAt(pointer-p.length()));
			}else {
			sMap.put(s.charAt(pointer-p.length()),sMap.get(s.charAt(pointer-p.length()))-1);
			}
			pointer++;		
		}
		
		return list;
	}
}
