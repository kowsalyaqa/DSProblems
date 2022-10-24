package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringsAlternately1768TwoPointerApproach {

	/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string. 1 - min
	 * 
	 * Input: word1 = "abc", word2 = "pqr"
			Output: "apbqcr"
			Explanation: The merged string will be merged as so:
			word1:  a   b   c
			word2:    p   q   r
			merged: a p b q c r

			Test Data: w1="",w2="abc"  , w1="", w="" 
	 * 
	 * 
	 * Pseudo Code: 
	 *==================
	 *1.Find each input string length and store in separate int variables
	 *2.Initialize output array with addition of two input string length
	 *3.Iterate for Loop using output array length
	 *4.Inside for loop add two if conditions for two input string lengths separately 
	 *5.If conditions must be less the input string length
	 *6.Inside First If condition of input String, Assign input string char to output index element and increment output index
	 *7.Inside Second if condition of input String, Assign input string char to output index element and increment output index
	 *8.Once Complete Iteration, Convert Output array into String 
	 *9.Return string from function
	 *10.Validate using Assertion expected output matched with actual output received
	 * 
	 */

	public static String mergeAlternately(String word1,String word2) {
		int word1Length=word1.length(),word2Length=word2.length();
		String s="";
		int left=0,right=0;
		while(left<word1Length|right<word2Length) {
			if(left<word1Length) {
				s=s+word1.charAt(left);
				left++;
			}
			if(right<word2Length) {
				s=s+word2.charAt(right);
				right++;
			}			
		}
		System.out.println(s);
		return s;
	}
	
	@Test
	public void tdn1() {
		String word1="ab";
		String word2="pq1";
		String expected="apbq1";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdn2() {
		String word1="abcd";
		String word2="pq";
		String expected="apbqcd";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp1() {
		String word1="abcd";
		String word2="pqrs";
		String expected="apbqcrds";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdn3() {
		String word1="";
		String word2="pqrs";
		String expected="pqrs";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdn4() {
		String word1="abcd";
		String word2="";
		String expected="abcd";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdE1() {
		String word1="";
		String word2="";
		String expected="";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}
}
