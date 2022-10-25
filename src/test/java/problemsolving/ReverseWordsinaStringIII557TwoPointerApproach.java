package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsinaStringIII557TwoPointerApproach {

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
	 *1.Read input string
	 *2.Initialize new String with Empty to store a new string
	 *3.Initialize int variable left=s.length()-1, right=s.length()-1
	 *4.Loop using while with condition left should be greater than input string length
	 *5.Inside loop if(left pointer should not be equal to space) left-- to reach space
	 *6.Reverse a word do,
	 *		if(s.charAt(right)==' ' && s.charAt(right)==s.length())			
				reverseOfWord(left,right-1,s);//using temp char variable reverse a word
				one word complete increase left to new word starting position by left=right+1
				}else{
				right++;
				}

	 *7.return new string from function and compare using Assertion
	 * 
	 * */

	public String reverseWords(String s) {
		int left=0,right=0;
		char[] charArray = s.toCharArray();
		while(left<=s.length()) {
			if(right==s.length() || s.charAt(right)==' ') {
				charArray=reversOfWord(left,right-1,charArray);
				System.out.println(Arrays.toString(charArray));
				left=right+1;
			}
			right++;
		}
		String str = String.valueOf(charArray);
	return str;

	}
	public char[] reversOfWord(int i,int j,char[] ch){
		char temp=' ';
		while(i<j) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			i++;
			j--;
		}
		
		return ch;
	}

	

	@Test
	public void positive() {
		String s= "Let's take LeetCode contest";
		String expected="s'teL ekat edoCteeL tsetnoc";
		String actual=reverseWords(s);
		Assert.assertEquals(expected, actual);
	}
}
