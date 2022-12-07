package SelfSolvedProblems;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeStringBruteForceApproach {


	public String mergeAlternately(String word1,String word2){
		if(word1.length()==0 && word2.length()==0) {
			return "";
		}
		String[] s=new String[word1.length()+word2.length()];
		char[] c1=word1.toCharArray();
		char[] c2=word2.toCharArray();
		int x=0;
		for(int i=0;i<s.length;i++) {
			if(i<word1.length()) {
				s[x++]=String.valueOf(c1[i]);
			}
			if(i<word2.length()) {
				s[x++]=String.valueOf(c2[i]);
			}
		}
		String str="";
		for(String s1:s) {
			str=str+s1;
		}
		System.out.println(str);

		return str;
	}

	@Test
	public void tdn1() {
		String word1="ab";
		String word2="pq1";
		String expected="apbq1";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdn2() {
		String word1="abcd";
		String word2="pq";
		String expected="apbqcd";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp1() {
		String word1="abcd";
		String word2="pqrs";
		String expected="apbqcrds";
		String actual=mergeAlternately(word1,word2);
		Assert.assertEquals(expected, actual);
	}

}
