package string.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringwithAtLeastKRepeatingCharacters395 {
	
	@Test
	public void tdp1() {
		String s= "aaabb";
		int k=3;
		int expected=3;
		int actual=longestSubstring(s,k);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void tdp2() {
		String s= "ababbc	";
		int k=2;
		int expected=5;
		int actual=longestSubstring(s,k);
		Assert.assertEquals(expected,actual);
	}
	
	  public int longestSubstring(String s, int k) {
		  Map<Character, Integer> map = new HashMap<Character, Integer>();  
		    for(int i=0; i<s.length(); i++){
		        char c = s.charAt(i);
		        if(map.containsKey(c)){
		        	map.put(c, map.get(c)+1);
		        }else{
		        	map.put(c, 1);
		        }
		    }
		 
		    Set<Character> keySet = new HashSet<Character>();
		    for(char c: map.keySet()){
		        if(map.get(c)<k){
		        	keySet.add(c);
		        }
		    }
		 
		    if(keySet.isEmpty()){
		        return s.length();
		    }
	
		    int max = 0,i=0,j=0;
		    while(j<s.length()){
		        char c = s.charAt(j);
		        if(keySet.contains(c)){
		            if(j!=i){
		                max = Math.max(max, longestSubstring(s.substring(i, j), k));
		            }
		            i=j+1;
		        }
		        j++;
		    }
		 
		    if(i!=j)
		         max = Math.max(max, longestSubstring(s.substring(i, j), k));
		 
		    return max; 
	  }
	
	

}
