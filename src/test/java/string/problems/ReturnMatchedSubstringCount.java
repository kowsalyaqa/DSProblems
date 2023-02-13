package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class ReturnMatchedSubstringCount {
	/*
	 * 1. return matched substring count
	   a = "ABCDCDC"
	   b = "CDC"
	   
	   TestData:
	   
	   a = "ABCDCDC"
	   b = "CDC"
	   count =2
	   
	   a = "ABCDCDD"
	   b = "CDC"
	   count =1
	   
	   a = "ABCDCDD"
	   b = "AAA"
	   count =0
	   
	   a = "A"
	   b = "A"
	   count=1
	   
	   a = "A"
	   b = "B"
	   count=0
	   
	   
	   UQ - 15:33 - 15:43 - 10 mins
	   
	   Approach - Substring Match TC - O(N) SC - O(1)
	   
	   PC:  15:44 - 15:45 1 mins
	   ---
	   1.Declare count=0
	   2.Iterate for loop with First String length increment iteration  by 1
	   3.Get Substring for second String length compare matched increment count
	   4.return count
	   
	   Code - 15:47 - 15:53 7 mins
	   Debug  - 15:54 - 15:55 - 1 mins
	   
	   Total mins - 19 mins
	   	  
	 * 
	 */
	

	@Test
	public void tdp1() {
		String str1="ABCDCDC";
		String str2="CDC";
		int expected=2;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String str1="ABCDCDD";
		String str2="CDC";
		int expected=1;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String str1="ABCDCDD";
		String str2="AAA";
		int expected=0;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		String str1="A";
		String str2="A";
		int expected=1;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		String str1="A";
		String str2="B";
		int expected=0;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp6() {
		String str1="";
		String str2="";
		int expected=1;
		int actual=returnMatchedSubstringCount(str1,str2);
		Assert.assertEquals(expected, actual);
	}
	private int returnMatchedSubstringCount(String str1, String str2) {
		int count=0;
		for(int i=0;i<str1.length()-str2.length()+1;i++) {
			if(str1.substring(i, i+str2.length()).equals(str2)) count++;
		}
		return count;
	}

}
