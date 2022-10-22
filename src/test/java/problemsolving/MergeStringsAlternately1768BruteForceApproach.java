package problemsolving;

import java.util.Arrays;

import org.junit.Assert;

public class MergeStringsAlternately1768BruteForceApproach {


	/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string. 1 - min
	 * 
	 * Input: word1 = "abc", word2 = "pqr"
		Output: "apbqcr"
		Explanation: The merged string will be merged as so:
		word1:  a   b   c
		word2:    p   q   r
		merged: a p b q c r

		Test Data: w1="",w2="abc"  , w1="", w="" 
	 * 
	 * 
	 * Pseudo Code: 
	 * 
	 * 1.Read the two Strings 
	 * 2.Initialize output Array with Sum length of the two string length
	 * 3.Iterate output array using for loop with x variable for(int x=0, x<output.length,x++)
	 * 4.Inside the loop add two if loop for checking the length of left and right is less their respective arrays
	 * 			if(left<c1.world){
	 * 				output[x]=c1[left];
	 * 				increment left by 1
	 * 				increment x by 1
	 * 			}
	 * 			if(right<c1.world){
	 * 				output[x]=c1[right];
	 * 				increment left by 1
	 * 				increment x by 1
	 * 			}
	 * 5.Convert output array into String
	 * 6.compare output String with expected string
	 * 7.Matched - Pass
	 * 8.Not Matched - Fail
	 * 
	 * 
	 * 
	 */

	public static String mergeAlternately(String word1,String word2) {
		int length=word1.length()+word2.length(),left=0,right=0;
		char[] c1=word1.toCharArray(); System.out.println(Arrays.toString(c1));
		char[] c2=word2.toCharArray(); System.out.println(Arrays.toString(c2));
		char[] output=new char[length];
		int x=0;
		for(int i=0;i<length;i++) {
			if(left<right){
				output[x++]=c1[left];
				left++;
			}
			if(right>left) {
				
			}
		}
		String s="";
		s=s.valueOf(output);
		System.out.println(s);
		return s;
	}
	public static void main(String[] args) {
		String word1="ab";
		String word2="pq1";
		String expected="apbqcr";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

}
