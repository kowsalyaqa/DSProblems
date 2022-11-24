package stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class RemoveAllAdjacentDuplicatesInString1047 {
	/*	You are given a string s consisting of lowercase English letters. 
	 *  A duplicate removal consists of choosing two adjacent and equal letters and removing them.
		We repeatedly make duplicate removals on s until we no longer can.
		Return the final string after all such duplicate removals have been made. 
		It can be proven that the answer is unique.

		Example 1:
		Input: s = "abbbaca"
		Output: "ca"
		Explanation: 
		For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".

		Example 2:
		Input: s = "azxxzy"
		Output: "ay"

		Constraints:
		1 <= s.length <= 105
		s consists of lowercase English letters.

		Understand Question - 5 mins
		Test Data - 5 mins
		Logic Build - 5 mins
		Pseudo Code - 15 mins
		Code - 15 mins
		Run & Debug - 15 mins
	 * 
	 * Time complexity - O(N^N) - Insert of String, O(N) if we reverse String
	 * Space Complexity - O(N)
	 * 
	 *
	 */

	//@Test
	public void tdp1(){
		String s="abbaca";
		String expected="ca";
		String actual=removeDuplicates(s);
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void tdp2(){
		String s="abbbca";
		String expected="aca";
		String actual=removeAllAdjacentDuplicates(s);
		Assert.assertEquals(expected,actual);
	}


	public String removeDuplicates(String s) {
		if(s.length()==0 ||  s.length()==1) return s;
		Stack<String> stringStack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()){
			if(stringStack.isEmpty()){
				stringStack.push(String.valueOf(c));
			}else if(!stringStack.isEmpty() && stringStack.peek().equals(String.valueOf(c))){
				stringStack.pop();
			}else {
				stringStack.push(String.valueOf(c));
			}
		}

		while (!stringStack.empty()) {//Can use reverse of string, to reduce time complexity to O(N)
			sb.insert(0, stringStack.pop());
		}
		return sb.toString();
	}

	public String removeAllAdjacentDuplicates(String s) {
		if(s.length()==0 ||  s.length()==1) return s;
		Stack<String> stringStack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		String temp="";
		int count=1;
		for(char c:s.toCharArray()){
			if(stringStack.isEmpty()){
				stringStack.push(String.valueOf(c));
			}else if(!stringStack.isEmpty() && stringStack.peek().equals(String.valueOf(c))){
				temp=stringStack.peek();
				count++;
				if(temp!=String.valueOf(c)) {
					stringStack.push(String.valueOf(c));
				}
				stringStack.pop();
			}else {
				stringStack.push(String.valueOf(c));
			}
		}

		while (!stringStack.empty()) {
			sb.insert(0, stringStack.pop());
		}
		return sb.toString();
	}



}
