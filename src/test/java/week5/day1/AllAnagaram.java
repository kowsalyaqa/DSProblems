package week5.day1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AllAnagaram {
	
	/**
	 * 
Input: s = "cbaebabacd", p = "abc"
Output: [0,6]

Input: s = "abab", p = "ab"
Output: [0,1,2]


Pseudo Code:
------------
1. Declare left=0,right=0, i=0, k=p.length, startIndex=0; List<Integer> list=new ArrayList<>();
2. while(i<s.length-k) //first string length traverse
		count=0;
		start=a.charAt(left);
3.   while(right<k){	//Iterate substring length to check char count in substring
		left=i, right=(i-k+1);		
	if(s.charAt(left)==s.charAt(right){ //compare substring char count
			count++;
			left++;
			right++;
		}
		if(count==k-1){//count match with k length-add start pos in list
			list.add(start);
		}
		
	}
i++;
}

4. return list from function


	 * 
	 * 
	 * 
	 * 
	 * 
	 */


	@Test
	public void tdp1() {
		String s="cbaebabacd";
		String p="abc";
		List<Integer> expected= new ArrayList<>();
		expected.add(0);
		expected.add(6);
		List<Integer> actual=findAnagrams(s,p);
	}

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> list= new ArrayList<>();
		int k=p.length(),start=0,left=0,right=0,count=0,i=0;
		while(i<s.length()) {
			start=s.indexOf(s.charAt(i));
			while(right<k) {
				left=i;
				right=0;
				if(s.charAt(left)==(p.charAt(left))){ 
					count++;
					left++;
					right++;
				}
				if(count==k-1){
					list.add(start);
				}
			}
			i++;
			
		}
		
		return list;
	}
}
