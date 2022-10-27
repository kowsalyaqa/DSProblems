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
		3.Loop using while with condition left less than string length
		4.Create getValue(Char left) method for repective Roman Character to return respective left and right roman letter values
		5.Once received left and right char respectiveint values from method assign to int variable 
		6.Add if condition to check which element is greater,if(left>right), true, add left and right element value with sum
			else do  subtraction from right to left then Perfom Sum action
		7.ouside of the loop increment left and right by 1
		8.Once loop is completed, return sum value from function and compare with expected value using Assert

	 *
	 * */

	@Test
	public void tdp1(){
		String s="III";
		int expected=3;
		int actual=romanToInt(s);
		Assert.assertEquals(expected,actual);
	}

	public int romanToInt(String s){
		int left=0,right=1,sum=0,leftValue=0,rightValue=0,subtractValue=0,x=0;
		int[] romanValuesArr=new int[s.length()];
		while(left<right && right<s.length()){
			leftValue=getRomanValueForChar(s.charAt(left));
			rightValue=getRomanValueForChar(s.charAt(right));
			if(leftValue>rightValue){
					romanValuesArr[x++]=leftValue;

			}else if(leftValue<rightValue){
				subtractValue=rightValue-leftValue;
					romanValuesArr[x++]=subtractValue;
			}else {
				romanValuesArr[x++]=leftValue;
			}
			left++;
			right++;
		}

		for(int a:romanValuesArr) {
			sum=sum+a;
		}

		return sum;
	}


	public int getRomanValueForChar(char c){

		int mactchedValue=0;

		switch(c){
		case 'I':
			mactchedValue=1;
			break;

		case 'V':
			mactchedValue=5;
			break;

		case 'X':
			mactchedValue=10;
			break;

		case 'L':
			mactchedValue=50;
			break;
		case 'C':
			mactchedValue=100;
			break;

		case 'D':
			mactchedValue=500;
			break;
		case 'M':
			mactchedValue=1000;
			break;
		default:
			return 0;
		}
		return mactchedValue;
	}
}
