package practicetwopointer;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeII680 {
	/*
	 * Given a string s, return true if the s can be palindrome after deleting at
	 * most one character from it.
	 * 
	 * Example 1: Input: s = "aba" Output: true
	 * 
	 * Example 2: Input: s = "abca" Output: true Explanation: You could delete the
	 * character 'c'.
	 * 
	 * Example 3: Input: s = "abc" Output: false
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 105 s consists of lowercase English letters.
	 * 
	 * UQ - 2 mins
	 * 
	 * Test Data: 3 mins
	 * 
	 * Input: s = "aba" Output: true
	 * 
	 * Input: s = "abca" Output: true
	 * 
	 * Input: s = "abc" Output: false
	 * 
	 * Input: s = "abdadba" Output: true
	 * 
	 * Input: s = "abdefdba" Output: true
	 * 
	 * Input: s = "abdefrdba" Output: false
	 * 
	 * 
	 * Approach - Two-Pointer - TC - O(N) SC - O(1)
	 * 
	 * Logic Build - 20 mins
	 * 
	 * PC: 19:30 - 19:39 - 9 mins ----
	 * 
	 * 1.Use two pointer from left and right 2.Scan from left and right to middle
	 * 3.check if same char 4.Same char,increment left by 1, decrement right by 1
	 * 5.Not same char, check two substring from and right char skip
	 * 
	 * Code - 19:39 - 19:50 - 11 mins
	 * 
	 * Run & Debug - 19:50 - 19:56 - 6 mins
	 * 
	 * Total Time - 50 mins
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String s = "RADAR";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "Test";
		boolean expected = false;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s = "";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		String s = "aba";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		String s = "abca";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		String s = "abc";
		boolean expected = false;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp7() {
		String s = "abdadba";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp8() {
		String s = "abdefdba";
		boolean expected = true;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp9() {
		String s = "abdefrdba";
		boolean expected = false;
		boolean actual = validPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	public boolean validPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) == s.charAt(right)) {
				left++;
				right--;
			} else {
				return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
			}
		}
		return true;
	}

	private boolean isPalindrome(String s, int left, int right) {
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	@Test
	public void tdp10() {
		String s = "abdefdba";
		boolean expected = true;
		boolean actual = validPalindromeBF(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp11() {
		String s = "abdefrdba";
		boolean expected = false;
		boolean actual = validPalindromeBF(s);
		Assert.assertEquals(expected, actual);
	}

	public boolean validPalindromeBF(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				int left1 = left + 1, right1 = right, left2 = left, right2 = right - 1;
				while (left1 < right1) {
					if (s.charAt(left1) != s.charAt(right1)) {
						break;
					}
					left1++;
					right1--;
				}
				while (left2 < right2) {
					if (s.charAt(left2) != s.charAt(right2)) {
						break;
					}
					left2++;
					right2--;
				}
				return left1>=right1 || left2>=right2;
			}
			left++;
			right--;
		}
		return true;
	}
}
