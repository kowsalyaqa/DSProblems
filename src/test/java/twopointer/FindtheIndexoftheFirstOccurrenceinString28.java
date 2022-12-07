package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class FindtheIndexoftheFirstOccurrenceinString28 {
	/*
	 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
	 * 
		Example 1:
		Input: haystack = "sadbutsad", needle = "sad"
		Output: 0
		Explanation: "sad" occurs at index 0 and 6.
		The first occurrence is at index 0, so we return 0.
		
		Example 2:
		Input: haystack = "leetcode", needle = "leeto"
		Output: -1
		Explanation: "leeto" did not occur in "leetcode", so we return -1.
		 
		Example 3:
		Input: haystack = "s", needle = "s"
		Output: 0
		Explanation: "s" occurs at index 0 and 0.
		The first occurrence is at index 0, so we return 0.
		
		Example 4:
		Input: haystack = "s", needle = "k"
		Output: -1
		Explanation: "s" is not occurs at any index, return -1
		
		Constraints:
		1 <= haystack.length, needle.length <= 104
		haystack and needle consist of only lowercase English characters.
	 * 
	 * 
	 * Understand Question - 25 mins
	 * 
	 * Approach - Two pointer, sliding window
	
	 * Time complexity - O(N)
	 * Space Complexity - O(1)
	 * 
	 * Pseudo Code:  - 5 mins
	 * -------------
	 * 1.Declare int pointer=0, k value taken second string length+poiner , Create empty String
	 * 2.Iterate while loop with condition 1)Pointer is less than k value and Pointer is less than string 1 string2 length-1
	 * 3.Find Substring using pointer,pointer+k value 
	 * 4.Check if substring is equal with second string,if yes return pointer;
	 * 5.else increment pointer by 1
	 * 6.return -1 out of while loop
	 * 		
	 * Code - 10 mins
	 * Run & Debug - 10 mins
	 * 
	 * Total time taken - 50 mins
	 * 
	 * 
	 *
	 */
	@Test
	public void tdp1() {
		String haystack="sadbutsad";
		String needle="sad";
		int expected=0;
		int actual=strStr(haystack,needle);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String haystack="leetcode";
		String needle="leeto";
		int expected=-1;
		int actual=strStr(haystack,needle);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String haystack="s";
		String needle="s";
		int expected=0;
		int actual=strStr(haystack,needle);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		String haystack="s";
		String needle="S";
		int expected=-1;
		int actual=strStr(haystack,needle);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		String haystack="s";
		String needle="";
		int expected=-1;
		int actual=strStr(haystack,needle);
		Assert.assertEquals(expected, actual);
	}
	//Two pointer,sliding window Solution
	public int strStr(String haystack, String needle) {
		int pointer=0,k=pointer+needle.length();
		String substring="";
		while(pointer<(pointer+k) && pointer<=haystack.length()-needle.length()){
			substring=haystack.substring(pointer,pointer+k);
			if(substring.equals(needle)){
				return pointer;
			}
			pointer++;
		}
		return -1;
	}
	//String -indexOf
	public int indexOfSolution(String haystack, String needle) {
		return haystack.indexOf(needle);
	}
	//String - Substring 
	public int subStringSolution(String haystack, String needle) {
		for(int i=0;i<haystack.length()-needle.length()+1;i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				if(haystack.substring(i,needle.length()+i).equals(needle)){
					return i;
				}
			}
		}
		return -1;
	}
}
