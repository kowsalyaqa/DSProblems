package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class ValidPalindromeII680TwoPoniterApproach {
	/* 
	 * Given a string s, return true if the s can be palindrome after deleting at most one character from it.
	 * 
	 * 
	 * Test Data:
	 * Positive - Input: s="aba" output=true
	 * Negative - Input: s="abca" delete one char output:true "aca" or aba
	 * Edge - Input: s="abc" output=false
	 * 
	 * Pseudo Code:
	 * ------------
	 * 1.Read input String s
	 * 2.Initialize int variable left=0,right=string length-1
	 * 3.Iterate while loop with condition of left less than right
	 * 4.Inside while loop add if condition 
	 * 5.Inside if condition,add string left element value not matched with right element value
	 * 6.Condition true when non matched elements compare And after if condition add left++,right-- ,
	 * 	suppose if not matched elements to move next position
	 * 7.If true,inside the loop add one more function to check within non-matched substring elements are palindrome or not
	 * 8.isPlaindrom Function Pass parameter(skip left element by increment left by one,right element same where it is pointed, string)
	 * 9.Inside palindrome method again we have to check while(left<righ)
	 * 10.Loop condition pass,add if condition to compare left and right element value
	 * 11.if elements values are true, increment left by 1 and decrement right by 1
	 * 12if not matched return false, Once loop over add return true;
	 * 13.first while loop we receive boolean value,that we have return from function
	 * 14.Compare received actual value with expected using Assert
	 * 
	 * */

	public boolean validPalindrom(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			if(s.charAt(left)==s.charAt(right)) {
				left++;
				right--;
			}else {
				return isPalindrome(left,right-1,s)||isPalindrome(left+1,right,s);
			}
		}
		return true;
	}
	
	public boolean isPalindrome(int l,int r,String s){
		while(l<r) {
			if(s.charAt(l)==s.charAt(r)) {
				l++;
				r--;
			}else {
				return false;
			}
		}
		return true;
	}

	@Test
	public void tdp1() {
		String s="deeee";
		boolean expected=true;
		boolean actual=validPalindrom(s);
		Assert.assertEquals(expected, actual);

	}
}
