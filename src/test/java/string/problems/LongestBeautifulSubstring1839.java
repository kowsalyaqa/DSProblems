package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class LongestBeautifulSubstring1839 {
	
	
	@Test
	public void tdp1() {
		String word = "aeiaaioaaaaeiiiiouuuooaauuaeiu";
		int expected=13;
		int actual=longestBeautifulSubstring(word );
		Assert.assertEquals(expected,actual);
	}

	//@Test
	public void tdp2() {
		String word = "aeeeiiiioooauuuaeiou";
		int expected=5;
		int actual=longestBeautifulSubstring(word );
		Assert.assertEquals(expected,actual);
	}

	//@Test
	public void tdp3() {
		String word = "a";
		int expected=0;
		int actual=longestBeautifulSubstring(word );
		Assert.assertEquals(expected,actual);
	}

	public int longestBeautifulSubstring(String word) {
		int max = 0, pair = 1, count = 1;
		for(int i=1;i<word.length();i++) {
			if(word.charAt(i-1) <= word.charAt(i)){   
				if(word.charAt(i-1) != word.charAt(i)) count++;
				pair++;
				if(count==5) max = Math.max(max,pair);
			}else{
				count = 1;
				pair= 1;
			}   
		}
		return max;
	}
}
