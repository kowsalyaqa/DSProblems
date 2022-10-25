package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsinaStringIII557BruteForceApproach {
	
	/* Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
	 * 
		Example 1:
		Input: s = "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
		
		Example 2:
		Input: s = "God Ding"
		Output: "doG gniD"
	 * 
	 * Pseudo Code:
	 * -------------
	 * 1.Split the input string into String array using space delimiter
	 * 2.Initialize new empty string for store output
	 * 3.Iterate 2 for loops,outer loop string array length start=0, inner loop start - word length from last index to first
	 * 4.inner loop append word index, Once inner iteration complete, add space with new string before last word 
	 * 5.return string from function, compare with expected string using Assertions
	 * */

	public String reverseWords(String s) {
		 String[] str=s.split(" ");
			String newStr="";
			System.out.println(Arrays.toString(str));
			for(int i=0;i<str.length;i++) {
				for(int j=str[i].length()-1;j>=0;j--) {
					newStr=newStr+str[i].charAt(j);
				}
	            if(i!=str.length-1)
				newStr=newStr+" ";
			}
			System.out.println(newStr);
			return newStr;  
	}

	@Test
	public void positive() {
		String s= "Let's take LeetCode contest";
		String expected="s'teL ekat edoCteeL tsetnoc";
		String actual=reverseWords(s);
		Assert.assertEquals(expected, actual);
	}

}
