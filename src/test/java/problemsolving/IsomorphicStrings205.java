package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class IsomorphicStrings205 {

	/*
	 * Given two strings s and t, determine if they are isomorphic. Two strings s
	 * and t are isomorphic if the characters in s can be replaced to get t. All
	 * occurrences of a character must be replaced with another character while
	 * preserving the order of characters. No two characters may map to the same
	 * character, but a character may map to itself.
	 * 
	 * Example 1: Input: s = "egg", t = "add" Output: true
	 * 
	 * Example 2: Input: s = "foo", t = "bar" Output: false
	 * 
	 * Example 3: Input: s = "paper", t = "title" Output: true
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 5 * 104 t.length == s.length s and t consist of any valid
	 * ascii character.
	 * 
	 * Total time - 1 hour 43 mins 
	 * -----------------------
	 * 1.undersatnd question - 30 mins
	 * 2.Logic build - 1 hour
	 * 3.Pseudo code - 5 mins
	 * 4.Code - 3 mins
	 * 5.Reu and Debug - 5 mins
	 * 
	 * Pseudo Code:
	 * 
	 * 1.Read two input strings
	 * 2.Initialize two integer arrays with 256 size
	 * 3.Iterate for loop using s.length
	 * 4.Both string length is not equal return false
	 * 5.m1[S.charAt(i)] - increment the value by1 and m2[s.charAt(i)]- increment the value by 1
	 * 6.Loop completed it will return true
	 * 
	 * Time Complexity - O(n)
	 * Space Complexity - O(n)
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String s = "abc";
		String t = "cde";
		boolean expected = true;
		boolean actual = isIsomorphic(s, t);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdn1() {
		String s = "foo";
		String t = "bar";
		boolean expected = false;
		boolean actual = isIsomorphic(s, t);
		Assert.assertEquals(expected, actual);
	}

	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] m1 = new int[256];
		int[] m2 = new int[256];

		for (int i = 0; i < s.length(); i++) {
			if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
				return false;
			}
			m1[s.charAt(i)] = i + 1;
			System.out.println("M1 "+i+": "+m1[s.charAt(i)]);
			m2[t.charAt(i)] = i + 1;
			System.out.println("M2 "+i+": "+m1[s.charAt(i)]);
		}
		return true;
	}
}
