package string.problems;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ReturnUniqueCharacterInAString {
	/*1. String input = ""this is my test string"";
         String output = "r, e, g, h, y, m, n"; (return Unique Character in a string)
	  
	  Test Data: 19:15 - 19:17 
	  String s="aa";
	  String o="";

  	  String s="abb";
	  String o="a";
	  
	  String s="aabb";
	  String o="";
 		
 	  String s="";
	  String o="";
	  
	  Approach - HashMap TC - O(N) SC - O(N)
	  
	  PC: 19:17 - 19:19
	  ---
	  1.Add Frequency of character in Map
	  2.Iterate for loop, value==1 add in new String 
	  3.Return new String
	  
	  Code - 19:19 -  19:26
	  Run & Debug - 19:26 19:28
	  
	  Total time in mins: 15 mins
 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	

	@Test
	public void tdp1() {
		String str1="this is my test string";
		String expected="hmyerng";
		String actual=returnUniqueCharacterInAString(str1);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String str1="aa";
		String expected="";
		String actual=returnUniqueCharacterInAString(str1);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String str1="a";
		String expected="a";
		String actual=returnUniqueCharacterInAString(str1);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		String str1="ab";
		String expected="ab";
		String actual=returnUniqueCharacterInAString(str1);
		Assert.assertEquals(expected, actual);
	}

	private String returnUniqueCharacterInAString(String str1) {
		Map<Character,Integer> map=new HashMap<>();
		String s="";
		for (char c : str1.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		for (char c : str1.toCharArray()) {
			if(map.get(c)==1) {
				s=s+c;
			}
		}
		return s;
	}
}
