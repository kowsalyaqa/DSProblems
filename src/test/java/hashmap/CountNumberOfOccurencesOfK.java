package hashmap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class CountNumberOfOccurencesOfK {
	/*
	 * Test Data: 19:31 - 19:32
	 * 
	 * S="abdbs"
	 * K="b"
	 * o/p: 2
	 * 
	 * S="abdbs"
	 * K="c"
	 * o/p: 0
	 * 
	 * Approach HashMap - TC - O(N),SC  - O(1)
	 * 
	 * 
	 * PC: 19:32 - 19:33
	 * 1.Add each char in hash map with count of occurence
	 * 2.Iterate loop check k key present return the value of K else return 0;
	 * 
	 * code - 19:32
	 * 
	 */
	
	@Test
	public void tdp1() {
		String str1="abdbs";
		String k="b";
		int expected=2;
		int actual=countNumberOfOccurencesOfK(str1,k);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		String str1="abdbs";
		String k="c";
		int expected=0;
		int actual=countNumberOfOccurencesOfK(str1,k);
		Assert.assertEquals(expected, actual);
	}

	private int countNumberOfOccurencesOfK(String str1, String k) {
		Map<Character,Integer> map=new HashMap<>();
		for (char c: str1.toCharArray()) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		for (Map.Entry<Character, Integer> m:map.entrySet()) {
			if(m.getKey()==k.charAt(0)) {
				return m.getValue();
			}
		}
		return 0;
	}
}
