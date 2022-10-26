package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLetters917BruteforceApproach {

	/*Test Data - String s="ab_cd" 
	 * 
	 * Negative - String s="1133_3+)("
	 * 
	 * Edge String s="";
	 * 			
	 * Pseudo Code:
	 * 1.Read input String s
	 * 2.Convert the input string to char array
	 * 3.Initialize left is zero and right is s.lenghth-1
	 * 4.Iterate while loop with condition left<right
	 * 6.Inside if condition using Character class check the left and right char element is alphabet or not 
	 * 7.if Condition is true, Swap C[left] with c[right] using temp variable
	 * 8.If Condition is false, check left and right is letter or not using character class
	 * 9.if left element is not English letter, increment left by 1
	 * 10.if right element is not English letter, decrement right by 1
	 * 11.Convert char array to string and return from function 
	 * 12.Compare actual string with expected string using Assert
	 * 
	 * 
	 * 
	 * */

	public String reverseLetters(String s) {
		char[] c=s.toCharArray();
		int left=0,right=s.length()-1;
		char temp=' ';

		while(left<right) { 
			if(Character.isAlphabetic(c[left]) && Character.isAlphabetic(c[right])) { 
				temp=c[left]; c[left]=c[right];
				c[right]=temp; 
				left++; right--; 
			}else if(!Character.isAlphabetic(c[left])){
				left++; 
			}else if(!Character.isAlphabetic(c[right])){
				right--; 
			} 
		}
		return String.valueOf(c);
	}


	@Test public void tdp1() { String s="ab_cd"; String expected="dc_ba"; String
	actual=reverseLetters(s); Assert.assertEquals(expected,actual);

	}

	@Test
	public void tdp2() {
		String s="Test1ng-Leet=code-Q!";
		String expected="Qedo1ct-eeLg=ntse-T!";
		String actual=reverseLetters(s);
		Assert.assertEquals(expected,actual);

	}


}
