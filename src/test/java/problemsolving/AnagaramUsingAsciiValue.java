package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AnagaramUsingAsciiValue {
	
	
	@Test
	public void tdp1() {
		String s = "abc";
		String t = "cde";
		boolean expected = true;
		boolean actual = anagaramUsingHashing(s, t);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp1() {
		String s = "abc";
		String t = "cde";
		boolean expected = true;
		boolean actual = anagaramUsingHashing(s, t);
		Assert.assertEquals(expected, actual);
	}

	public boolean anagaramUsingHashing(String s, String t) {
		if (s.length() != t.length())
			return false;
		int[] m1 = new int[256];
		int[] m2 = new int[256];

		for (int i = 0; i < s.length(); i++) {
			System.out.print(m1[s.charAt(i)-'a']);
			m1[s.charAt(i)-'a']=m1[s.charAt(i)-'a']+1;
		}
		
		for (int i = 0; i < t.length(); i++) {
			System.out.print(m2[s.charAt(i)-'a']);
			m2[s.charAt(i)-'a']=m2[s.charAt(i)-'a']+1;
		}
		return Arrays.equals(m1, m2);
	}
}
