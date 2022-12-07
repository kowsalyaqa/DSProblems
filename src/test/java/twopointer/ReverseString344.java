package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString344 {
/*	Write a function that reverses a string. The input string is given as an array of characters s.
	You must do this by modifying the input array in-place with O(1) extra memory.
	Example 1:
	Input: s = ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]
	
	Example 2:
	Input: s = ["H","a","n","n","a","h"]
	Output: ["h","a","n","n","a","H"]
	 
	Example 3:
	Input: s = ["H"]
	Output: ["H"]
		 
	Constraints:
	1 <= s.length <= 105
	s[i] is a printable ascii character.
 * 
 * Understand Question - 5 mins
 * 
 * Approach - Two pointer

 * Time complexity - O(N)
 * Space Complexity - O(1)
 * 
 * Pseudo Code:  - 3 mins
 * -------------
 * 1.Declare left=0, right=s.length-1
 * 2.Iterate while using condition left is lesser than right
 * 		a)If condition satisfies, swap left and right char and increment left and decrement right pointer
 * Code - 2 mins
 * Run & Debug - 1 mins
 * Total time taken - 11 mins
 * 
 */
	
	@Test
	public void tdp1() {
		char[] s= {'h','e','l','l','o'};
		char[] expected= {'o','l','l','e','h'};
		char[]  actual=reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		char[] s= {'H','a','n','n','h'};
		char[] expected= {'h','n','n','a','H'};
		char[]  actual=reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		char[] s= {'H'};
		char[] expected= {'H'};
		char[]  actual=reverseString(s);
		Assert.assertArrayEquals(expected, actual);
	}
	
	 public char[] reverseString(char[] s) {
	        int left=0,right=s.length-1;
	        while(left<right){
	                char temp=s[left];
	                s[left++]=s[right];
	                s[right--]=temp;
	        }
	        return s;
	    }
}
