package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class MaxVowels1456 {
	
	@Test
	public void tdp1() {
		String s1= "abciiidef";
		int k=3;
		int expected=3;
		int actual=maxVowels(s1,k);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void tdp2() {
		String s1= "aeiou";
		int k=2;
		int expected=2;
		int actual=maxVowels(s1,k);
		Assert.assertEquals(expected,actual);
	}
	
	
	@Test
	public void tdp3() {
		String s1= "leetcode";
		int k=3;
		int expected=2;
		int actual=maxVowels(s1,k);
		Assert.assertEquals(expected,actual);
	}
	
	 public int maxVowels(String s, int k) {
		   int count = 0, max = Integer.MIN_VALUE, left = 0, right = k;
		     
		       for (int i = 0; i < k; i++) {
		            if (isVowel(s.charAt(i))) {
		                count++;
		            }
		        }

		        max = count;
		        while (right < s.length()) {
		            if (isVowel(s.charAt(right))) {
		                count++;
		            }
		            if (isVowel(s.charAt(left))) {
		                count--;
		            }
		            right++;
		            left++;
		            max = Math.max(max, count);
		        }

		        return max;
		    }

		    private boolean isVowel(char c) {
		        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
		    }
}
