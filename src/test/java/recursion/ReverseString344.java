package recursion;

import org.junit.Assert;
import org.junit.Test;

public class ReverseString344 {
	@Test
	public void tdp1() {
		char[] c={'h','e','l','l','o'};
		char[] expected={'o','l','l','e','h'};
		int left=0;
		char[] actual=reverseString(c,left);
		Assert.assertArrayEquals(expected, actual);
	}

	private char[] reverseString(char[] c, int left) {
		while(left<=c.length/2) {
			char temp=c[left];
			c[left]=c[c.length-1-left];
			c[c.length-1-left]=temp;
			left++;
			reverseString(c,left);			
		}
		return c;	
	}
}
