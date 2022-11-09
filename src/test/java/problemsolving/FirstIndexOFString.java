package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class FirstIndexOFString {
	
	@Test
	public void tdp1() {
		String haystack="hello";
		String needle="ll";
		int actual=2;
		int expected=firstIndexOfString(haystack,needle);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp2() {
		String haystack="sadbutsad";
		String needle="sad";
		int actual=0;
		int expected=firstIndexOfString(haystack,needle);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp3() {
		String haystack="leetcode";
		String needle="leeto";
		int actual=-1;
		int expected=firstIndexOfString(haystack,needle);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp4() {
		String haystack="a";
		String needle="a";
		int actual=0;
		int expected=firstIndexOfString(haystack,needle);
		Assert.assertEquals(expected,actual);
	}
	public int firstIndexOfString(String haystack, String needle) {
		  int pointer=0,k=pointer+needle.length();
	        String substring="";
	        while(pointer<(pointer+k) && pointer<=haystack.length()-needle.length()){
	            substring=haystack.substring(pointer,pointer+k);
	            if(substring.equals(needle)) return pointer;
	            pointer++;
	        }
	        return -1;
	}

}
