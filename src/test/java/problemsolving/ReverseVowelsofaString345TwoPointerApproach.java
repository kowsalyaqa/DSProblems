package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseVowelsofaString345TwoPointerApproach {


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
	 * 2.Initialize int left=0,right=s.length-1
	 * 3.Loop using while(left<right) inside while find Vowels character from left and Right, if both are same swap it
	 * 4.Once Loop complete return string from function, compare with expected results using assertions

	 * 
	 */
	public String reverseWords(String s) {
		char[] str1=s.toCharArray();
		int left=0,right=str1.length-1;
		while(left<right) {
				if(left<right && !isVowelPresent(str1,left)) {
				left++;
				continue;
			}

			System.out.println(str1[left]);
			if(left<right && !isVowelPresent(str1,right)) {
				right--;
				continue;
			}
			System.out.println(str1[right]);
			 
	        char temp = str1[left];
	        str1[left]= str1[right];
	        str1[right]= temp;
	        left++;
	        right--;	
		}
		
		return new String(str1);
	}
	
	public boolean isVowelPresent(char[] ch,int index) {
		boolean flag=false;
		if(ch[index]=='A'|ch[index]=='E'|ch[index]=='I'|ch[index]=='O'|ch[index]=='U'|ch[index]=='a'|ch[index]=='e'|ch[index]=='i'|ch[index]=='o'|ch[index]=='u') {
			return flag=true;
		}
		
		return flag;
		
	}

	@Test
	public void positive() {
		String s= "hello";
		String expected="holle";
		String actual=reverseWords(s);
		Assert.assertEquals(expected, actual);
	}
}

