package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLetters917 {
	/*
	 * 917. Reverse Only Letters
	 * 
	 * Given a string s, reverse the string according to the following rules:
	 * 
	 * All the characters that are not English letters remain in the same position.
	 * All the English letters (lowercase or uppercase) should be reversed. Return s
	 * after reversing it.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "ab-cd" Output: "dc-ba" Example 2:
	 * 
	 * Input: s = "a-bC-dEf-ghIj" Output: "j-Ih-gfE-dCba" Example 3:
	 * 
	 * Input: s = "Test1ng-Leet=code-Q!" Output: "Qedo1ct-eeLg=ntse-T!"
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 100 s consists of characters with ASCII values in the range
	 * [33, 122]. s does not contain '\"' or '\\'.
	 * 
	 * 
	 * understand problem - 18:02 - 18:04
	 * 
	 * Pseudo code: - 18:04 - 18:08 -------------------------- 1.Read String s,
	 * declare int left=0,right=s.length-1 2.Iterate for each loop for after convert
	 * s into char array 3.Iterate using while(left<right> loop swap char if it is
	 * both are character, increment left, decrement right by 1 4.else if(left is
	 * not character),increment left by 1, if(right!=Character) decrement right by 1
	 * 5.else increment left by 1, decrement right by 1 4.Once loop is over convert
	 * char array into string and return from function
	 * 
	 * code - 18:19 - 18:30 Run & Debug - 18:31- 18:33
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - Constant
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String s = "ab-cd";
		String expected = "dc-ba";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "a-bC-dEf-ghIj";
		String expected = "j-Ih-gfE-dCba";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s = "Test1ng-Leet=code-Q!";
		String expected = "Qedo1ct-eeLg=ntse-T!";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	public String reverseOnlyLetters(String s) {
		int left = 0, right = s.length() - 1;
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			while (left < right) {
				if (Character.isAlphabetic(c[left]) && Character.isAlphabetic(c[right])) {
					char temp = c[left];
					c[left++] = c[right];
					c[right--] = temp;
				} else if (!Character.isAlphabetic(c[left]))
					left++;
				else if (!Character.isAlphabetic(c[right]))
					right--;
				else {
					left++;
					right--;
				}
			}
		}
		return new String(c);
	}

}
