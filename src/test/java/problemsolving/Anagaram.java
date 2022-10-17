package problemsolving;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Anagaram {
	/* Problem - Given input string, say Anagaram when occurence of char count should be same as output string in any order
	 *Examples:
	 * Input: String s="eat", Output: t="tea"
	 * 
	 * Test Data: Positive -  s="eat", Negative - s="", Edge
	 * 
	 * Pseudo Code:
	 * Read input string 
	 * Check input and output string length are same and input and Output String is not empty, else return false
	 * If i/p and o/p String length same 
	 * 	Convert i/p string into char Array
	 * 	Initialize 2 Map with <Character, String> type
	 * 	Iterate using input string length
	 * 	If Map contains current index char, Add char as key, increment 1 in value
	 * 	else Add char as key, value as 1
	 * 	Do the above steps for output char as well
	 * 	Finally compare two maps
	 * 	if equals return true
	 * 	else return false
	 * 
	 * */

	@Test
	public static boolean positive(String s, String t) {
		boolean flag=false;
		if(s.length()==t.length()& s!="") {
			Map<Character, Integer> map1 = getCharCount(s);
			Map<Character, Integer> map2 = getCharCount(t);
			if(map1.equals(map2)) return flag=true;
			else return flag;
		}else return false;
	}

	public static Map<Character,Integer> getCharCount(String s){
		Map<Character, Integer> map=new LinkedHashMap<>();
		char[] charArray = s.toCharArray();
		for (char e: charArray) {
			if(map.containsKey(e)) map.put(e,map.get(e)+1);
			else map.put(e,1);
		}
		return map;
	}

	public static void main(String[] args) {
		String s="eat";
		String t="ate";
		Assert.assertEquals(positive(s,t), true);

		String s1="";
		String t1="";
		Assert.assertEquals(positive(s1,t1), false);
	}

}
