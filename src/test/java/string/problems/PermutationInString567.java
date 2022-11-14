package string.problems;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class PermutationInString567 {
	/**
	 * 
	 * PseudoCode: 12:53- 13:10
	 *  ---------- 
	 * 	1.Declare two s1HaspMap and s2HashMap using Data type HashMap<Character,Integer> for store s1 and s2 String each character and frequency of each characters
		2.Iterate for loop with s1.length and store key as character and Frequency as values
		3.First s1.length of elements in s2 string store in hash map using while(pointer<s1.length)
		5.Compare s1Map and s2Map, if equals, return true
		4.Iterate While using to s2.length to traverse remains sub string of s2 string 
				remove start index value of s2 substring in s2Map if(value==1),else decrement value by 1
				increase pointer by 1
				add new pointer char value of s2 string into s2Map 
				Compare s1Map and s2Map, if equals, return true
				increment pointer by 1

		5.add return false for s2 string not contains s2 after complete loop iteration

	 * Code - 1:15 to 1:35
	 * Run & Debug - 1:35 to 2.35
	 * 
	 * Total Timings - 1 hour 40 mins
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - O(1)
	 */

	@Test
	public void tdp1() {
		String s1 = "ab";
		String s2 = "eidbaooo";
		boolean expected = true;
		boolean actual = checkInclusion(s1, s2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s1 = "adc";
		String s2 = "dcda";
		boolean expected = true;
		boolean actual = checkInclusion(s1, s2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s1 = "ab";
		String s2 = "ab";
		boolean expected = true;
		boolean actual = checkInclusion(s1, s2);
		Assert.assertEquals(expected, actual);
	}

	public boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;

		HashMap<Character, Integer> s1Map = new HashMap<>();
		HashMap<Character, Integer> s2Map = new HashMap<>();
		int pointer = 0, n = s1.length();

		for (char c : s1.toCharArray()) {
			s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
		}

		while (pointer < n) {
			s2Map.put(s2.charAt(pointer), s2Map.getOrDefault(s2.charAt(pointer), 0) + 1);
			pointer++;
		}
		if (s1Map.equals(s2Map))
			return true;
		while (pointer < s2.length()) {
			if (s2Map.get(s2.charAt(pointer - n)) == 1) {
				s2Map.remove(s2.charAt(pointer - n));
			} else {
				s2Map.put(s2.charAt(pointer - n), s2Map.getOrDefault(s2.charAt(pointer - n), 0) - 1);
			}

			s2Map.put(s2.charAt(pointer), s2Map.getOrDefault(s2.charAt(pointer), 0) + 1);
			if (s1Map.equals(s2Map))
				return true;
			pointer++;
		}
		return false;
	}
}
