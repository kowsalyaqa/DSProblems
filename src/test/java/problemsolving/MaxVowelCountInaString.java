package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class MaxVowelCountInaString {

	/* 
	 * Test Data :
			Input: s = "Tesii"
			Output: 2

			Input: s = "abcd"
			Output: 0

			Pseudo Code: 
			============
				1.Read input string s,and substring size k
				2.Initialize sum=0
				3.Interate outer for loop using condition i<s.length-1
				4.Iterate inner for loop using condition j=i, j<i+k-1 Size
				5.Add switch case for to count if vowels present 
				6.after complete inner for loop compare with count, max value
				7.If max<count ,update max=count
				8.Once lopp is completed, return max value from function and compare compare with expected value


			Time Complexity - O(n2) - only one for loop used
			Space Complexity - constant

			Total - 33 mins
			======================
			1.understand problem- 3mins 
			2.Logic build -  5 mins 
			3.Pseudo Code -  5 mins
			4.Script - 10 mins
			5.Run and Debug - 10 mins

	 *
	 * */

	@Test
	public void tdp1(){
		String s="abceee";
		s=s.toLowerCase();
		int k=3,expected=3;
		int actual=maxVowelsInSubstring(s,k);
		Assert.assertEquals(expected,actual);
	}

	public int maxVowelsInSubstring(String s,int k){
		int count=0,max=Integer.MIN_VALUE;
		for(int i=0;i<=s.length()-k;i++) {
			for(int j=i;j<i+k;j++) { 
				switch(s.charAt(j)){
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				}
			}
			max=Math.max(max, count);
			count=0;
		}
		return max;
		
	}
}
