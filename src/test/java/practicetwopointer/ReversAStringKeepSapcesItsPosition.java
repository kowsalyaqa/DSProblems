package practicetwopointer;

import org.junit.Assert;
import org.junit.Test;

public class ReversAStringKeepSapcesItsPosition {
	/*
	 * To reverse a string keeping spaces at it's position

		For eg. this is a test class
		o/p - 	ssal ct s etas isiht
		
		Approach - Bruteforec 
		TC - ???
		SC - O(N)
		
		
		PC:
		---
		1.Create new Array with length of input String
		2.Input String into char Array
		3.Itearte loop and store space into result Array
		4.Iterate loop to add each from last index by skipping space
		5.Conver char arr into String return from method

	 * 
	 * 
	 * Approach - Tw0-Pointer
		TC - O(N)
		SC - O(1)
		
		PC:
		---
		1.Input String into char Array
		2.Declare left=0, right=s.length()-1 temp=''
	 	3.Iterate while using condition left<right
	 	4.if(c[left]!=' ' && c[right]!=' ') swap ,increment left by 1,  
	 	decrement right by 1 
	 	5.else if (c[left]==' ' && c[right]!=' ') increment left by 1
	 	6.else decrement right by 1
	 	7.return after char array 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String s = "this is a test class";
		String expected = "ssal ct s etas isiht";
		String actual = reversAStringKeepSapcesItsPosition(s);
		Assert.assertEquals(expected, actual);
	}

	private String reversAStringKeepSapcesItsPosition(String s) {
		char[] c = s.toCharArray();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (c[left] != ' ' && c[right] != ' ') {
				char temp = c[left];
				c[left++] = c[right];
				c[right--] = temp;
			} else if (c[left] == ' ' && c[right] != ' ') {
				left++;
			} else {
				right--;
			}
		}
		return String.valueOf(c);
	}

	@Test
	public void tdp2() {
		String s = "this is a test class";
		String expected = "ssal ct s etas isiht";
		String actual = reversAStringKeepSapcesItsPositionBF(s);
		Assert.assertEquals(expected, actual);
	}

	private String reversAStringKeepSapcesItsPositionBF(String s) {
		char[] c = s.toCharArray();
		char[] output = new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ')
				output[i] = c[i];
		}
		int j = s.length() - 1;
		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ') {
				if(output[j]==' ') {
					j--;
				}
				output[j]=c[i];
				j--;
			}
		}
		return String.valueOf(output);
	}

}
