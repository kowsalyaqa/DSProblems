package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class MaxVowelInSubstring {
	/* 
	 * 
		Test Data:
		Positive - String s="workaattech" k=3 output:2  
		Negative - String s="abf" k=3 output: 1
		Edge String s="bcd", k=3 output: 0


		Pseudo code: 
		1.Read input String s, substring size=k
		2.Initialize int variables left=0,right=k-1, count=0, max=Integer.MIN_VALUE
		3.Iterate while loop with condition of while(left<right && right<s.length)
		4.Inside while loop add if condition to check left and right element value is equal vowels value
		5.If Condition is true, increment count by 1, increment left by 1, decrement right by 1 
		6.if(max<count)->max=count
		6.out side if loop add left++,right++
		7.return max value from function and compare with expected value using Assert

	 * 
	 *
	 * */

	public int maxVowelInSubstring(String s, int k){
		int left=0,right=k-1,count=0,max=Integer.MIN_VALUE;
		while(left<right && right<s.length()){
			count=0;
			if(s.charAt(left)=='a'|| s.charAt(left)=='e'||s.charAt(left)=='i'|| s.charAt(left)=='o'||s.charAt(left)=='u'|| s.charAt(left)=='A'|| s.charAt(left)=='E'||s.charAt(left)=='I'|| s.charAt(left)=='O'||s.charAt(left)=='U'){
				count++;
				left=left+1;
				max=Math.max(max,count);
			}
			
			right=right+1;
		}

		return max;
	}


	@Test
	public void tdp1(){
		String s="workaattech";
		int k=3;
		int expected=2;
		int actual=maxVowelInSubstring(s,k);
		Assert.assertEquals(expected,actual);
	}
}
