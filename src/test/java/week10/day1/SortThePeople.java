package week10.day1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.junit.Assert;
import org.junit.Test;

public class SortThePeople {
	/*
	 * 
	 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
		Output: ["Mary","Emma","John"]
		Explanation: Mary is the tallest, followed by Emma and John.
	 * 
	 * PC:
	 * ----
	 * 1.Create Map, Reverse based on value
	 * 2.Return Names from Map
	 *
	 *TC - O(NlogN)
	 *SC - O(N) 
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String[] names= {"Mary","John","Emma"};
		int[] heights= {180,165,170};
		String[] expected= {"Mary","Emma","John"};
		String[] actual=sortPeopleTreeMap(names,heights);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String[] names= {"Alice","Bob","Bob"};
		int[] heights= {155,185,150};
		String[] expected= {"Bob","Alice","Bob"};
		String[] actual=sortPeopleTreeMap(names,heights);
		Assert.assertEquals(expected, actual);
	}
	public String[] sortPeople(String[] names, int[] heights) {
		int x=0;
		Map<Integer, String> map=new HashMap<>();
		for(int i=0;i<names.length;i++) {
			map.put(heights[i],names[i]);
		}
		System.out.println(map.keySet());
		return names;
	}

	public String[] sortPeopleTreeMap(String[] names, int[] heights) {
		int x=0;
		TreeMap<Integer,String> treeMap=new TreeMap<>(Collections.reverseOrder());
		for(int i=0;i<names.length;i++) treeMap.put(heights[i],names[i]);
		for(String s:treeMap.values()) names[x++]=s;        
		return names;
	}
}

