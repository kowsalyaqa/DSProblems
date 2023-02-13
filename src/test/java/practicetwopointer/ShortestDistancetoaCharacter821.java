package practicetwopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ShortestDistancetoaCharacter821 {
	/*821. Shortest Distance to a Character
	 * 
	 * Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

		The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
		
		Example 1:
		Input: s = "loveleetcode", c = "e"
		Output: [3,2,1,0,1,0,0,1,2,2,1,0]
		Explanation: The character 'e' appears at indices 3, 5, 6, and 11 (0-indexed).
		The closest occurrence of 'e' for index 0 is at index 3, so the distance is abs(0 - 3) = 3.
		The closest occurrence of 'e' for index 1 is at index 3, so the distance is abs(1 - 3) = 2.
		For index 4, there is a tie between the 'e' at index 3 and the 'e' at index 5, but the distance is still the same: abs(4 - 3) == abs(4 - 5) = 1.
		The closest occurrence of 'e' for index 8 is at index 6, so the distance is abs(8 - 6) = 2.
		
		Example 2:
		Input: s = "aaab", c = "b"
		Output: [3,2,1,0]
		
		Constraints:
		
		1 <= s.length <= 104
		s[i] and c are lowercase English letters.
		It is guaranteed that c occurs at least once in s.
	 * 
	 * Test Data:
	 * 
	 * s="ababcabc"
	 * c=a
	 * o/P: [0,1,0,1,1,0,1,2]
	 * 
	 * Approach - Bruteforce TC - O(N*2) SC - O(N)
	 * 
	 * PC: 15:51 - 15:54
	 * ---
	 * 1.Create new Empty result array with string length
	 * 2.Fill result array with maximum Value of integer
	 * 3.Iterate for loop with s.length condition
	 * 4.check if same char s.charAt(i) and c value, Then Iterate Inner for loop from j=0
	 * 5.Identify Math.min(exist result value and Math.min(i-j)) and assign to result[j]
	 * 6.Return Final Array
	 * 
	 * code - 10 mins
	 * Run & Debug - 10 mins
	 * 
	 * Approach - Two-Pointer TC - O(N*2) SC - O(N)
	 * 
	 * PC: 15:51 - 15:54
	 * ---
	 * 1.Create new Empty result array with string length
	 * 2.Iterate for loop with s.length condition
	   3.check if same char s.charAt(i) and c value,then Find abs value of i-j , add to result[i]
	   4.Iterate For loop using s.length()-1 to 0, Find Min distance of exist value and abs(i-j)
	   5.Return Final result Array 
	 * 
	 * code - 10 mins
	 * Run & Debug - 10 mins
	 * 
	 * 
	 * Total Mins - 2 hours
	 * 
	 * 
	 * 
	 */
	
	@Test 
	public void tdp1() {
		String s="loveleetcode";
		char c='e';
		int[] expected= {3,2,1,0,1,0,0,1,2,2,1,0};
		int[] actual=shortestToChar(s,c);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test 
	public void tdp2() {
		String s="aaab";
		char c='b';
		int[] expected= {3,2,1,0};
		int[] actual=shortestToChar(s,c);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test 
	public void tdp5() {
		String s="ababcabc";
		char c='a';
		int[] expected= {0,1,0,1,1,0,1,2};
		int[] actual=shortestToChar(s,c);
		Assert.assertArrayEquals(expected, actual);
	}


	//Bruteforce - TC - O(N*2) SC- O(N)
	private int[] shortestToChar(String s, char c) {
		int[] result=new int[s.length()];
		Arrays.fill(result, Integer.MAX_VALUE);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) {			
				for(int j=0;j<s.length();j++) {
					result[j]=Math.min(result[j], Math.abs(i-j));
				}
			}
		}
		return result;
	}
	
	
	@Test 
	public void tdp3() {
		String s="loveleetcode";
		char c='e';
		int[] expected= {3,2,1,0,1,0,0,1,2,2,1,0};
		int[] actual=shortestToCharApproach2(s,c);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test 
	public void tdp4() {
		String s="aaab";
		char c='b';
		int[] expected= {3,2,1,0};
		int[] actual=shortestToCharApproach2(s,c);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test 
	public void tdp6() {
		String s="ababcabc";
		char c='a';
		int[] expected= {0,1,0,1,1,0,1,2};
		int[] actual=shortestToCharApproach2(s,c);
		Assert.assertArrayEquals(expected, actual);
	}

	//Two Pointer TC - O(N*2) SC- O(N)
		private int[] shortestToCharApproach2(String s, char c) {
			int[] result=new int[s.length()];
			int cPos=-s.length();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)==c) {
					cPos=i;
				}
				result[i]=Math.abs(i-cPos);
			}
			System.out.println(Arrays.toString(result));
			
			for(int i=s.length()-1;i>=0;i--) {
				if(s.charAt(i)==c) {
					cPos=i;
				}
				result[i]=Math.min(result[i], Math.abs(i-cPos));
			}
			System.out.println(Arrays.toString(result));
			return result;
		}

}
