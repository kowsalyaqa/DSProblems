package problemsolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MostCommonWord819 {

	/*
	 * Total Time: 1 hour 40 mins
	 * ---------------------------
	 * 1.Understand Question - 5 mins 
	 * 2.Logic Build - 5 mins 
	 * 3.PseudoCode- 10 mins 
	 * 4.Code - 20 mins 	
	 * 4.Run and debug -   60 mins
	 * 
	 * Test Data:
	 * -----------
	 * Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.",
	 * banned = ["hit"] Output: "ball"
	 * 
	 * Input: paragraph = "a.", banned = [] Output: "a"
	 * 
	 * 
	 * Input: paragraph = "a", banned = [b] Output: "a"
	 * 
	 * Input: paragraph = "+", banned = [b] Output: ""
	 * 
	 * PseudoCode:
	 * --------------- 
	 * 1.Read input String paragraph and Input array banned
	 * 2.Initialize Map<String,Integer> map=new HashMap<>(); int max=Integer.MAX_VALUE;String newOutputString="";
	 * 2.Convert paragraph String into String Array by using lower case onvert  and Replace Punctuations "\\W+"using Regex 
	 * 3.Iterate two loop using for with paragraph input string and banned array, using boolean flag to find non-matched words
	 * 4.Compare paragraph input string and banned array elements, if matched flag=true, else flag=false
	 * 5.flag is false,add paragraph input[i] to map by using map,put(paragraph input[i],map.getOrDefeault(paragraph input[i],0)+1);
	 * 6.Iterate Map using foreach using map.entrySet()
	 * 7.Compare each map.getValue() with Max,If max is greater than map.getValue(),replace max=map.getValue()
	 * 8.Assign outputstring =map.getKey() of Max Value
	 * 9.Finally return the string from function and compare with expected string using assert
	 *  
	 *  
	 *  Time Complexity: O(n2)
	 *  Space Complexity:O(n)
	 * 
	 */

	@Test
	public void tdp1() {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = { "hit" };
		String expected = "ball";
		String actual = mostCommonWord(paragraph, banned);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdn1() {
		String paragraph = "a.";
		String[] banned = {};
		String expected = "a";
		String actual = mostCommonWord(paragraph, banned);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdn2() {
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = { "a" };
		String expected = "b";
		String actual = mostCommonWord(paragraph, banned);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdn3() {
		String paragraph = "abc abc? abcd the jeff!";
		String[] banned = { "abc", "abcd", "jeff" };
		String expected = "the";
		String actual = mostCommonWord(paragraph, banned);
		Assert.assertEquals(expected, actual);
	}

	public String mostCommonWord(String paragraph, String[] banned) {
		Map<String, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		String newOutputString = "";
		String[] paragraphArr = paragraph.toLowerCase().split("\\W+");
		System.out.println(Arrays.toString(paragraphArr));
		System.out.println(Arrays.toString(banned));

		if (banned.length == 0) {
			for (String str : paragraphArr)
				newOutputString = newOutputString + str;
			System.out.println(newOutputString);
			return newOutputString;
		}
		boolean mismatch = false;
		for (int i = 0; i < paragraphArr.length; i++) {
			mismatch = false;
			for (int j = 0; j < banned.length; j++) {
				if (paragraphArr[i].equalsIgnoreCase(banned[j])) {
					mismatch = true;
					break;
				}
			}
			if (!mismatch)
				map.put(paragraphArr[i], map.getOrDefault(paragraphArr[i], 0) + 1);
		}

		System.out.println(map);

		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (max <= m.getValue()) {
				max = m.getValue();
				newOutputString = m.getKey();
			}
		}
		System.out.println(newOutputString);
		return newOutputString;
	}

}
