package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class LongestPalindromicSubstring5 {
	/*
	Example 1:
	Input: s = "babad"
	Output: "bab"
	Explanation: "aba" is also a valid answer.

	Example 2:
	Input: s = "cbbd"
	Output: "bb"

	 * 
	 * 
	 * Psudo Code:
	 * -------------
	 * 
	 */


	@Test
	public void tdp1() {
		String s="babad";
		String expected="bab";
		String actual=longestPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	public String longestPalindrome(String s) {
		int max=Integr
		boolean flag=false;
		for(int i=0;i<s.length();i++) {
			for( int j=i;j<s.length();j++){
				flag=false;
				
				
			}
		}
		return "";
	}



}
