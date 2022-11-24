package stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;


public class DecodeString394 {
	/*
	    Given an encoded string, return its decoded string.
		The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
		You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
		The test cases are generated so that the length of the output will never exceed 105.

		Example 1:

		Input: s = "3[a]2[bc]"
		Output: "aaabcbc"
		Example 2:

		Input: s = "3[a2[c]]"
		Output: "accaccacc"
		Example 3:

		Input: s = "2[abc]3[cd]ef"
		Output: "abcabccdcdcdef"


		Constraints:

		1 <= s.length <= 30
		s consists of lowercase English letters, digits, and square brackets '[]'.
		s is guaranteed to be a valid input.
		All the integers in s are in the range [1, 300].

		Understand the question - 30 mins 
		Logic Build - 2 hour
		Pseudo Code: 30 mins
		----------------------
		1.Initialize k=0
		2.Create numberStack and stringStack
		3.Iterate using String by converting to char array
		4.Check character is digit add to number stack
		5.Check character is '[' add to string check
		6.Check any other character than ']' char, add in string check
		7.Check the character is ']', Start popping out character from stack till pop out '[' 
		  and store it String Builder in start index
		8.Again store the string into stack, repeat the same till complete the loop
		9.return string from function

		code - 30 mins 
		Run & Debug - 10 mins

		Time Complexity - O(N)
		Space Complexity - O(N)

	 */
	
	@Test
	public void tdp1() {
		String s="3[a]2[bc]";
		String expected="aaabcbc";
		String actual=decodeString(s);
		Assert.assertEquals(expected, actual);
	}
	@Test 
	public void tdp2() {
		String s="3[a2[c]]";
		String expected="accaccacc";
		String actual=decodeString(s);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp3() {
		String s="2[abc]3[cd]ef";
		s.
		String expected="abcabccdcdcdef";
		String actual=decodeString(s);
		Assert.assertEquals(expected, actual);
	}

	public String decodeString(String s) {
		Stack<Integer> numStack = new Stack<>();
		Stack<String> stringStack = new Stack<>();
		int k = 0;

		for (char c : s.toCharArray()) {

			if (Character.isDigit(c)) {
				k = (k * 10) + (c - '0');
				continue;
			}

			if (c == '[') {
				numStack.push(k);
				k = 0;
				stringStack.push(String.valueOf(c));
				continue;
			}

			if (c != ']') {
				stringStack.push(String.valueOf(c));
				continue;
			}

			StringBuilder temp = new StringBuilder();
			while (!stringStack.peek().equals("["))
				temp.insert(0, stringStack.pop());

			// remove the "["
			stringStack.pop();

			// Get the new string
			StringBuilder replacement = new StringBuilder();
			int count = numStack.pop();
			for (int i = 0; i < count; i++)
				replacement.append(temp);

			// Add it to the stack
			stringStack.push(replacement.toString());
		}

		StringBuilder result = new StringBuilder();
		while (!stringStack.empty()) {
			result.insert(0, stringStack.pop());
		}
		return result.toString();
	}
}