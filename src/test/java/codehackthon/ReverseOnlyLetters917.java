package codehackthon;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReverseOnlyLetters917 {

	@Test
	public void tdp1() {
		String s = "Test1ng-Leet=code-Q!";
		String expected = "Qedo1ct-eeLg=ntse-T!";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		String s = "ab-cd";
		String expected = "dc-ba";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "ab-cd1";
		String expected = "dc-ba1";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s = "$1";
		String expected = "$1";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		String s = "";
		String expected = "";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		String s = "Test1ng-Leet=code-Q!";
		String expected = "Qedo1ct-eeLg=ntse-T!";
		String actual = reverseOnlyLetters(s);
		Assert.assertEquals(expected, actual);
	}

	private String reverseOnlyLetters(String s) {
		char[] ch = s.toCharArray();
		int left=0,right=s.length()-1;
		while(left<right) {
			if(Character.isAlphabetic(ch[left])&& Character.isAlphabetic(ch[right])) {
				char temp=ch[left];
				ch[left++]=ch[right];
				ch[right--]=temp;
			}else if(!Character.isAlphabetic(ch[left])&& Character.isAlphabetic(ch[right])) {
				left++;
			}else if(Character.isAlphabetic(ch[left])&& !Character.isAlphabetic(ch[right])) {
				right--;
			}else {
				left++;
				right--;
			}
		}
		return String.valueOf(ch);
	}



	@Test
	public void tdp10() {
		String s = "a good   example";
		String expected = "example good a";
		String actual = reverseWords(s);
		Assert.assertEquals(expected, actual);
	}

	public String reverseWords(String s) {
		if(s.length()==0) return s;
		StringBuilder sb=new StringBuilder();
		s=s.trim();
		String[] s1=s.split(" ");
		System.out.println(s1.length);
		for(int i=s1.length-1;i>=0;i--){
			String temp=s1[i];
			sb.append(temp);
		}
		String s2=String.valueOf(sb);
		System.out.println(s2);
		return s2;
	}
}
