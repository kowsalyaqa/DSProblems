package week8.day2;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLetters917 {
	@Test
	public void tdp1() {
		String s ="ab-cd";
		String expected ="dc-ba" ;
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	public String reverseOnlyLetters(String s) {
		int left = 0, right = s.length() - 1;
		char temp;
		char[] c = s.toCharArray();
		while(left<right) {
			if(Character.isAlphabetic(c[left]) && Character.isAlphabetic(c[right])) {
				temp = c[left];
				c[left] = c[right];
				c[right] = temp;
				left++;
				right--;
			} else if (!Character.isAlphabetic(c[left]) && Character.isAlphabetic(c[right])) {
				left++;
			} else if(Character.isAlphabetic(c[left]) && !Character.isAlphabetic(c[right])){
				right--;
			}else {
				left++;
				right--;
			}
		}
		return String.valueOf(c);
	}
}