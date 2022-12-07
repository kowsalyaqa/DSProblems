package week8.day2;

import org.junit.Test;

import junit.framework.Assert;

public class FindFirstPalindromicStringArray2108 {

	@Test
	public void tdp1() {
		String[] words= {"abc","car","ada","racecar","cool"};
		String expected="ada";
		String actual=firstPalindrome(words);
		Assert.assertEquals(expected, actual);
	}
	 public String firstPalindrome(String[] words) {
	        boolean flag=true;
	        int left=0,right=0;
	        for(int i=0;i<words.length;i++) {
	        	left=0;
	        	right=words[i].length()-1;
	        	while(left<right) {
	        		if(words[left].equals(words[right])) {
	        			flag=true;	        		}
	        		left++;
	        		right--;
	        	}
	        	if(flag==true) return words[i];
	        }
	        return "";
	  }
};
