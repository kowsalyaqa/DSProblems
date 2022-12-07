package slidingwindow;

public class LongestSubstringWithoutRepeatingCharacters {
	/*
	 * 3. Longest Substring Without Repeating Characters
	 * 
	 * Given a string s, find the length of the longest 
	   substring without repeating characters.
	
		Example 1:
		Input: s = "abcabcbb"
		Output: 3
		Explanation: The answer is "abc", with the length of 3.
		
		Example 2:
	
		Input: s = "bbbbb"
		Output: 1
		Explanation: The answer is "b", with the length of 1.
		Example 3:
	
		Input: s = "pwwkew"
		Output: 3
		Explanation: The answer is "wke", with the length of 3.
		Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	
	
		Constraints:
	
		0 <= s.length <= 5 * 104
		s consists of English letters, digits, symbols and spaces.


	 * UQ - 5 mins
	 * 
	 * PC:15:05
	 * ---
	 * 1.Declare HashMap to store each and occurence Value
	 * 2.Declare left =0, right=0 for get substring and max=0
	 * 3.Iterate using while loop using right< s.length
	 * 4.Inside For loop add each right char to map, and increment count by check if key is already available
	 * 5.Once add first element increment left by 1
	 * 6.Suppose map.size greater than 1 need to take substring and identify difference then identify max value  
	 * 7.if left is only one directly identify Math value
	 * 8.Return max once loop gets completed
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
