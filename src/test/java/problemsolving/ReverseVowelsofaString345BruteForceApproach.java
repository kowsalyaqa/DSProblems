package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsofaString345BruteForceApproach {

	/*Given a string s, reverse only all the vowels in the string and return it.
	  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
	 * 
		Example 1:
		Input: s = "hello"
		Output: "holle"
		
		Example 2:
		Input: s = "leetcode"
		Output: "leotcede"
		
	 * 
	 * Pseudo Coe:
	 * 1.Read input string
	 * 2.Iterate for loop from i<s.length, Find Vowels alone and Store it new String
	 * 3.Iterate for loop from s.length to zero,Find vowel and replace the vowel with last vowel for stored vowel string
	 
	 * 
	 */
	public String reverseWords(String s) {
		 	char[] str=s.toCharArray();
			String vowelStr="";
			for(int i=0;i<str.length;i++) {
				if(s.charAt(i)=='A'|s.charAt(i)=='E'|s.charAt(i)=='I'|s.charAt(i)=='O'|s.charAt(i)=='U'
						|s.charAt(i)=='a'|s.charAt(i)=='e'|s.charAt(i)=='i'|s.charAt(i)=='o'|s.charAt(i)=='u') {
					
					vowelStr=vowelStr+s.charAt(i);	
				}
			}
			int j=vowelStr.length()-1;
			for(int i=0;i<str.length;i++) {
				if(s.charAt(i)=='A'|s.charAt(i)=='E'|s.charAt(i)=='I'|s.charAt(i)=='O'|s.charAt(i)=='U'
						|s.charAt(i)=='a'|s.charAt(i)=='e'|s.charAt(i)=='i'|s.charAt(i)=='o'|s.charAt(i)=='u') {
					str[i]=vowelStr.charAt(j--);
				}
			}
			String strOuput = String.valueOf(str);
			return strOuput;
	}

	@Test
	public void positive() {
		String s= "hello";
		String expected="holle";
		String actual=reverseWords(s);
		Assert.assertEquals(expected, actual);
	}
	
	
	
	
}
