package twopointer;

import org.junit.Assert;
import org.junit.Test;


public class mergeAlternatively1768 {

	/**
	 * Pseudo Code:20:26 - 20:29
		-------------
		1.Declare Empty String s=""
		1.Iterate for loop using word1 plus word2.length using left=0
		2.check condition for both string[i] is less than respective string lengths
		3.condition satisfies, append word1.char first then word2 char second
		4.Return output String 

		code - 20:29 - 20:40

		Run & Debug - 20:41 - 20: 50

	 * Time Complexity - O(N)
	 * Space Complexity - Constant
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1(){
		String word1="abc";
		String word2="pqr";
		String expected="apbqcr";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void tdp2(){
		String word1="ab";
		String word2="pqrs";
		String expected="apbqrs";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected,actual);
	}

	public String mergeAlternately(String word1, String word2) {
		String s="";
		for(int left=0;left<word1.length()+word2.length();left++){
			if(left<word1.length()) {	
				s=s+word1.charAt(left);
			}
			if(left<word2.length()) {
				s=s+word2.charAt(left);
			}
		}
		return s; 
	}
}
