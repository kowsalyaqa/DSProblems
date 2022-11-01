package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class RomanToInteger13 {

	/* 
	 * Test Data :
		Input: s = "III"
		Output: 3
		Explanation: III = 3.

		Input: s = "LVIII"
		Output: 58
		Explanation: L = 50, V= 5, III = 3.

		Input: s = "MCMXCIV"
		Output: 1994
		Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

		Pseudo Code: 
		============
		1.Read input string s
		2.Initialize left=0,right=1;
		3.Iterate using for loop with condition left is less than s.length-1
		4.Inside for loop  add Switch case to get value of the roman letter
		5.Add if condition to add and subtraction of value with sum value
		6.if(left>right) do Sum=sum-right;
		7.else if(left<right) sum=sum+right;
		8.Once loop is completed, return sum value from function and compare with expected value using Assert
		
		
		Time Complexity - O(n) - only one for loop used
		Space Complexity - constant
		
		Total time to solve problem: 1hour 10 mins
		1.understand the problem - 10 mins
		2.Login Build - 10 mins
		3.Pesudo Code - 10 mis
		4.script Code -10 mins
		5.Run and Debug - 30 mins 2 test data passed,one condition failed , debug and changed conditions

	 *
	 * */

	@Test
	public void tdp1(){
		String s="MCMXCIV";
		int expected=1994;
		int actual=romanToInt(s);
		Assert.assertEquals(expected,actual);
	}

	public int romanToInt(String s){
		int left=0,right=0,sum=0;
		for(int i=s.length()-1;i>=0;i--) {
			switch(s.charAt(i)){
			case 'I':
				right = 1;
				break;
			case 'V':
				right = 5;
				break;
			case 'X':
				right = 10;
				break;
			case 'L':
				right = 50;
				break;
			case 'C':
				right = 100;
				break;
			case 'D':
				right = 500;
				break;
			case 'M':
				right = 1000;
				break;
			}
			
			if ( left > right) {
				sum -= right;
			}else{
				sum += right;
				left = right;
			}

		}
		return sum;
	}
}
