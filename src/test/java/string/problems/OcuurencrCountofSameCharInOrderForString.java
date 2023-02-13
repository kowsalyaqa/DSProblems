package string.problems;

import org.junit.Assert;
import org.junit.Test;

public class OcuurencrCountofSameCharInOrderForString {

	/*1. String input = "aaabbccaad";
    String output = "a3b2c2a2d1";

    TestData:

    String input = "";
    String output = "";

    UQ - 18:45 - 18:50
    Approach - Two- Pointer TC -O(N) SC - O(1)

    PC: 18:51- 19:02
    ----
    1.Declare int count=1,StringBuilder
    2.Iterate for loop using str.length
    3.compare adjacent element same, increment count
    4.String builder append element and count
    4.reset count=1
    5.Finally return the new string

    Code - 19:02 - 19:08
    Run - 19:08 - 19:10
    Debug - 
    
    Total mins - 25 mins
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String str1="aaabbaad";
		String expected="a3b2a2d1";
		String actual=ocuurencrCountofSameCharInOrderForString(str1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String str1="1111aa@@D";
		String expected="14a2@2D1";
		String actual=ocuurencrCountofSameCharInOrderForString(str1);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String str1="";
		String expected="";
		String actual=ocuurencrCountofSameCharInOrderForString(str1);
		Assert.assertEquals(expected, actual);
	}

	private String ocuurencrCountofSameCharInOrderForString(String str1) {
		int count=1;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str1.length();i++) {
			if(i<str1.length()-1 && str1.charAt(i)==str1.charAt(i+1)) {
				count++;
				continue;
			}
			sb.append(str1.charAt(i));
			sb.append(count);
			count=1;
		}
		System.out.println(sb);
		return String.valueOf(sb);
	}

}
