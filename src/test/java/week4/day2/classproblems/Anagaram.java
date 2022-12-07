package week4.day2.classproblems;

public class Anagaram {

/*
 * 
 * 
 * 
 * 
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Constrains: s and t consist of lowercase English letters.

Test Data

Input: s = "anagram", t = "nagaram"
Output: true

(don't use hash map "& set)

Pseudo Code:
------------
1.Read two string s and t,Initialize int count=0,int[] output1=new int[s.length],int[] output2=new int[s.length],int min=Integer.MAX_VALUE;
2.Check both string has same length, if true proceed,else return false
3.Iterate using for loop s.length using outer, inner using s.length
4.if(s.charAt(i)==s.charAt(j)) count++;
5.Once inner loop is over add count into output array,and reset count=0;
6.Do the same  3-5 steps for t string as well
7.sort the output1 and output2 by itearate for loop, compare Math.min(min,output1[i]) and compare Math.min(min,output2[j]);
8.compare the two arrays if it is equal,return true, else return false
 * 
 * */	
	
	
	
	
	public boolean anagaramCheck(){
		
	}
	
	
	
	
	public void anagaram() {
		String s="anagram";
		String t="nagaram";
		
	}
	
}
