package week8.day2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ValidAnagaramP1 {
	/*
	 * UQ - 2:45 - 2:47
	 * 
	 * PC: - 2:47 - 251
	 * 
	 * 1.Create 2 int array with size of 26,one for 2, one t 2.Convert string into
	 * char array ,iterate char array 3.If pass n[char-'a']++; 4.Do the same for t
	 * string 5.Compare two array equal return true else false
	 * 
	 * code - 2:52- 2:59
	 * 
	 * Run & Debug - 2:58 to 2:2:59
	 * 
	 * Time Complexity - O(N^2) Space Complexity -O(N)
	 * 
	 */
	@Test
	public void tdp1() {
		String s = "anagram";
		String t = "nagaram";
		boolean expected = true;
		boolean actual = isAnagram1(s, t);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "rat";
		String t = "car";
		boolean expected = false;
		boolean actual = isAnagram1(s, t);
		Assert.assertEquals(expected, actual);
	}

	public boolean isAnagram(String s, String t) {
		int[] n1 = new int[26];
		int[] n2 = new int[26];
		for (char c : s.toCharArray()) {
			n1[c - 'a']++;
		}
		for (char c : t.toCharArray()) {
			n2[c - 'a']++;
		}
		return Arrays.equals(n1, n2);
	}

	public boolean isAnagram1(String s, String t) {
		Map<Character, Integer> sMap = new HashMap<>();
		Map<Character, Integer> tMap = new HashMap<>();
		for (char c : s.toCharArray()) {
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
		}
		for (char c : t.toCharArray()) {
			tMap.put(c, tMap.getOrDefault(c, 0) + 1);
		}
		return sMap.equals(tMap);
	}

}
