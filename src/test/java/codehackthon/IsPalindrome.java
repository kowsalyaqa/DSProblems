package codehackthon;

import org.junit.Assert;
import org.junit.Test;

public class IsPalindrome {

	@Test
	public void tdp1() {
		String s = "A man, a plan, a canal: Panama";
		boolean expected = true;
		boolean actual = isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "race a car";
		boolean expected = false;
		boolean actual = isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s = "";
		boolean expected = true;
		boolean actual = isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	public boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--))
				return false;
		}
		return true;
	}
	
	@Test
	public void tdp6() {
		String s = "A man, a plan, a canal: Panama";
		boolean expected = true;
		boolean actual = isPalindromeBF(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp7() {
		String s = "race a car";
		boolean expected = false;
		boolean actual = isPalindromeBF(s);
		Assert.assertEquals(expected, actual);
	}
	
	public boolean isPalindromeBF(String s) {
		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		for(int i=0,j=s.length()-1;i<s.length()-1 & j>=0;i++,j--) {
				if(s.charAt(i)!=s.charAt(j)) return false;
		}
		return true;
	}
	
	

}
