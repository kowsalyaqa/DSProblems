package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class CountGoodSubstrings1876 {
	/*
	 * Test Data:
	 *
	 * Example1: Input: nums = [3,2,3] Output: 3
	 * Example1: Input: nums = [2,2,1,1,1,2,2] Output: 2
	 * 
	 * 
	 * Pseudo Code:
	 * ----------------
	 * 1.Read input String s, good substring size is 3 from question
	 * 2.Declare int count=0 to count distinct substring
	 * 3.Iterate for loop using s.length - 2 because of substring size 3
	 * 4.Inside for loop add if condition to compare Each element in subarray is not duplicate by adding 3 conditions
	 * 5.compare first element!-second char, second element!-third char, first element!-Third char, 
	 * 6. If three is unique -Increment the count
	 * 7. Once loop is completed, return count value from function
	 * 8.Compare expected value using Assert
	 * 
	 * 
	 * 	Total Time: 35 mins
	 * ---------------------
	 * 1.Understand Question - 5mins
	 * 2.Login Build - 5 mins
	 * 3.Pseudo code - 10 mins
	 * 4.Code -  5 mins
	 * 5. Run and Debug - 10 mins
	 * 
	 * Time complexity - O(n)
	 * Space complexity - Constant
	 */

	@Test
	public void tdp1() {
		String s = "xyzzaz";
		int expected = 1;
		int actual = countGoodSubstrings(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "aababcabc";
		int expected = 4;
		int actual = countGoodSubstrings(s);
		Assert.assertEquals(expected, actual);
	}
	public int countGoodSubstrings(String s) {
		int count = 0;
		for (int i = 0; i < s.length()- 2; i++) {
			if (s.charAt(i)!=s.charAt(i + 1) && s.charAt(i + 1) !=  s.charAt(i + 2) && s.charAt(i) != s.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}
}
