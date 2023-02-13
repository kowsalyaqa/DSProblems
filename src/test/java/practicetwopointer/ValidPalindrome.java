package practicetwopointer;

import org.junit.Assert;
import org.junit.Test;

public class ValidPalindrome {

/*
 * 125. Valid Palindrome
 * 
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

	Given a string s, return true if it is a palindrome, or false otherwise.	 
	
	Example 1:
	Input: s = "A man, a plan, a canal: Panama"
	Output: true
	Explanation: "amanaplanacanalpanama" is a palindrome.
	
	
	Example 2:
	Input: s = "race a car"
	Output: false
	Explanation: "raceacar" is not a palindrome.
	
	Example 3:
	Input: s = " "
	Output: true
	
	Explanation: s is an empty string "" after removing non-alphanumeric characters.
	Since an empty string reads the same forward and backward, it is a palindrome.
	
	Constraints:
	1 <= s.length <= 2 * 105
	s consists only of printable ASCII characters.
 * 
 *
 * 
 *  Approach - Two pointer TC - O(N) SC - O(1)
 * UQ - 2 mins
 * Build Logic  - 10 mins
 * Test Data - 2 mins
 * 
 * PC: 5 mins
 * ---
 * 1.Use two pointer from left and right
 * 2.Scan left and right to the middle
 * 3.Skip non-alphanumeric Character
 * 4.Check if same char after ignoring case 
 * 
 * Code - 7 mins
 * Run & Debug - 10 mins
 * 
 * Total mins - 36
 *
 * Approach - Bruteforce TC - O(N) SC - O(N)
 * 
 * PC: 2 mins
 * 1.Convert String into lowercase and Use Regex to remove non-alpha numeric characters
 * 2.Iterate using for loop for s.length()
 * 3.Check if same char
 *  
 * Code - 3mins
 * Run & Debug - 2 mins
 * 
 * Total mins - 21 mins
 *  
 */
	@Test
	public void tdp1() {
		String s = "RADAR";
		boolean expected	 = true;
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

	// only check valid palindrome or not
	private boolean validPalindrome(String s) {
		s = s.toLowerCase();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}
	@Test
	public void tdp4() {
		String s = "A man, a plan, a canal: Panama";
		boolean expected = true;
		boolean actual = isPalindromeRemoveAlphanumricCharT(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		String s = "race a car";
		boolean expected = false;
		boolean actual = isPalindromeRemoveAlphanumricCharT(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		String s = "";
		boolean expected = true;
		boolean actual = isPalindromeRemoveAlphanumricCharT(s);
		Assert.assertEquals(expected, actual);
	}
		
	// Remove non-alphanumeric characters and check string is palindrome or not
	public boolean isPalindromeRemoveAlphanumricCharT(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		for (int i = 0, j = s.length() - 1; i < s.length() - 1 & j >= 0; i++, j--) {
			if (s.charAt(i) != s.charAt(j))
				return false;
		}
		return true;
	}
	
	@Test
	public void tdp7() {
		String s = "A man, a plan, a canal: Panama";
		boolean expected = true;
		boolean actual = isPalindromeTwoPointer(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp8() {
		String s = "race a car";
		boolean expected = false;
		boolean actual = isPalindromeTwoPointer(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp9() {
		String s = "";
		boolean expected = true;
		boolean actual = isPalindromeTwoPointer(s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp10() {
		String s = "1b1";
		boolean expected = true;
		boolean actual = isPalindromeTwoPointer(s);
		Assert.assertEquals(expected, actual);
	}

	// Remove non-alphanumeric characters and check string is palindrome or not
	public boolean isPalindromeTwoPointer(String s) {
		int left=0,right=s.length()-1;
		s=s.toLowerCase();
		while(left<right) {
			if(!Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}else if(!Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}else {
				if(s.charAt(left)!=s.charAt(right)) return false;
				left++;
				right--;
			}
		}
		return true;
	}
}
