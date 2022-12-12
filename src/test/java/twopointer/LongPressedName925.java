package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName925 {
	/*
	 * 	https://leetcode.com/problems/long-pressed-name/  - 16:52
	 * 	925. Long Pressed Name
		Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
		You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

 
		UQ - 16:52 - 17:03

		Approach - Two pointer

		Test Data:
		----------
		Input: name = "alex", typed = "aaleex"
		Output: true

		Input: name = "saeed", typed = "ssaaedd"
		Output: false

		Input: name = "s", typed = "s"
		Output: true

		Input: name = "s", typed = "ss"
		Output: true

		Input: name = "s", typed = "sv"
		Output: false

		Input: name = "e", typed = "s"
		Output: false

		TC - O(N)
		SC - O(1)

		PC: 17:04 - 17:06
		----------
		1.Declare int left=0,right=0,count=0
		2.Iterate while loop using right is less than typed.length condition
		3.Inside while loop add if condition to check left<name.length() and name[left] is equal to name[right], If matched increment count by 1 and increment left 
		4.else if add condition if right==0 or right and right-1 is not matched, return false;
		5.increment right pointer by common for both conditions
		6.Once loop complete compare count with name.length, matched return true 

		Code: 17:06 :17:14
		Run & Debug: 17:14 - 18:04
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void tdp1(){
		String name="alex";
		String typed="aaleex";
		boolean expected=true;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp2(){
		String name="saeed";
		String typed="ssaaedd";
		boolean expected=false;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp3(){
		String name="s";
		String typed="s";
		boolean expected=true;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp4(){
		String name="s";
		String typed="ss";
		boolean expected=true;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp5(){
		String name="s";
		String typed="sv";
		boolean expected=false;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp6(){
		String name="s";
		String typed="e";
		boolean expected=false;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp7(){
		String name="e";
		String typed="s";
		boolean expected=false;
		boolean actual=isLongPressedName(name,typed);
		Assert.assertEquals(expected,actual);
	}
	public boolean isLongPressedName(String name, String typed) {
		int left=0,right=0,count=0;
		while(right<typed.length()){
			if(left<name.length() && name.charAt(left)==typed.charAt(right)){
				count++;
				left++;
			}else if(right==0 || typed.charAt(right)!=typed.charAt(right-1)){
				return false;
			}
			right++;
		}
		return count==name.length();
	}
}
