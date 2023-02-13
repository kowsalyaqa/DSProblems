package string.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class FirstStringReArrangeMatchWith2StringReturnTrue {

	/*String Challenge
		Have the function stringChallenge (str1, str2) take both parameters being passed and return the string true if a poltion of str1 characters can be rearranged to match str2, otherwise return the string false. For example: if str1 is
		"rkgodlw' and str2 is “world” the output should return true.
		Punctuation and symbols will not be entered with the parameters.
		Examples
		Input; "edore" & stra = "coder"
		Output: true
		
		Input:”h3llo” & str2=“hello”
		Output: false
		
		Input:"edorc" strr2="coder"
		
		Test Data:
		1.Str1="" Str2="" o/p: true
		2.Str1="eggth" Str2="gge" o/P: true
		3.Str1="get" Str2="egg" O/p: false
	 * 
	 * 	UQ - 14:41 - 14:44 - 4 mins
	 * 
	 *  Approach - HashMap, TC - O(N), SC - O(N2)
	 *  
	 *  PC: 14:45 - 14:47  - 3 mins
	 *  
	 *  1.Declare  2 HashMap to store each char count of Str1 and Str2
	 *  2.Iterate for loop using Second Str2 and first str1 store values
	 *  3.Iterate for loop for second map and Check if map2 value is not equal or greater than  map 1 value in map return false
	 *  4.Return true from method
	 *  
	 *  Code  - 14:47 - 14:53 - 7 mins
	 *  
	 *  Re-change logic - 10 mins
	 *  
	 *  Total - 24 mins
	 *  
	 *  ======================
	 *  Approach 2 - The idea is to count frequencies of characters of str1 in a count array. Then traverse str2 and decrease frequency of characters of str2 in the count array. If frequency of a characters becomes negative at any point, return false.
	 *  
	 *  TC - O(n+m) SC - O(1) 
	 *  
	 *  PC:
	 *  ---
	 *  1.Declare integer array with length of 26
	 *  2.Iterate first string and store Frequency of char count into int array
	 *  3.Iterate second string and check Frequency of char count is equal to zero return false;
	 *  4.else decrement frequency count by 1
	 *  5.Return false from method
	 *  
	 * 
	 */
	
	@Test
	public void tdp1() {
		String str1="edorc";
		String str2="coder";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringChar(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String str1="geggss";
		String str2="egg";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringChar(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String str1="";
		String str2="";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringChar(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	public void tdp4() {
		String str1="geiii";
		String str2="egg";
		boolean expected=false;
		boolean actual=checkAStringHasAnotherStringChar(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	private boolean checkAStringHasAnotherStringChar(String str1, String str2) {
		Map<Character,Integer> map1=new HashMap<>();
		for(char c:str1.toCharArray()) {
			map1.put(c, map1.getOrDefault(c,0)+1);
		}
		Map<Character,Integer> map2=new HashMap<>();
		for(char c:str2.toCharArray()) {
			map2.put(c, map2.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character,Integer> m:map2.entrySet()) {
			if(!(map1.get(m.getKey())>=m.getValue())) return false;
		}
		return true;
	}
	
	
	@Test
	public void tdp5() {
		String str1="edorc";
		String str2="coder";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringCharArray(str1,str2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		String str1="geggss";
		String str2="egg";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringCharArray(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp7() {
		String str1="";
		String str2="";
		boolean expected=true;
		boolean actual=checkAStringHasAnotherStringCharArray(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	public void tdp8() {
		String str1="geiii";
		String str2="egg";
		boolean expected=false;
		boolean actual=checkAStringHasAnotherStringCharArray(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	private boolean checkAStringHasAnotherStringCharArray(String str1, String str2) {
		int[] c1=new int[26];
		for(char c:str1.toLowerCase().toCharArray()) {
			c1[c-'a']++;
		}
		System.out.println(Arrays.toString(c1));
		for(char c:str2.toLowerCase().toCharArray()) {
			if(c1[c-'a']==0) return false;
			c1[c-'a']--;
		}
		System.out.println(Arrays.toString(c1));
	
		return true;
	}
}
