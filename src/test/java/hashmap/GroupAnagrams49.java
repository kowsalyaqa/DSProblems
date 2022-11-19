package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagrams49 {
	/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

		An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

		Example 1:

		Input: strs = ["eat","tea","tan","ate","nat","bat"]
		Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
		Example 2:

		Input: strs = [""]
		Output: [[""]]
		Example 3:

		Input: strs = ["a"]
		Output: [["a"]]


		Constraints:

		1 <= strs.length <= 104
		0 <= strs[i].length <= 100
		strs[i] consists of lowercase English letters.
	 * 
	 * understand the question - 5:30 to 6:03
	 * 
	 * Pseudo code: 6:03 - 6:13
	 * 1.Declare Map<String,List<String>> , String - sortedString, Value - list of original String that sorted String matched with each sorted remains string in array
	 * 2.Iterate for each loop to pass each string from String Array 
	 * 3.Sort the String Value by convert each string into char Array
	 * 4.Check map contains key as sorted String, If No,add key - sorted String and value-Original string
	 * 5.else we can add original string into list
	 * 6.return by create new array list stored map values only 
	 * 
	 * 
	 * Code- 6:13 - 6:38
	 * Run & Debug - 6:38 - 6:40
	 * 
	 * Time Complexity - O(N^m)
	 * Space Complexity - O(1)
	 * 
	 * 
	 */
	@Test
	public void tdp1() {
		String[] strs={"eat","tea","tan","ate","nat","bat"};
		List<List<String>> expected=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		list1.add("bat");
		List<String> list2=new ArrayList<>();
		list2.add("nat");
		list2.add("tan");
		List<String> list3=new ArrayList<>();
		list3.add("ate");
		list3.add("eat");
		list3.add("tea");
		expected.add(list3);
		expected.add(list1);
		expected.add(list2);
		List<List<String>> actual=groupAnagrams(strs);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp2() {
		String[] strs={""};
		List<List<String>> expected=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		list1.add("");
		expected.add(list1);
		List<List<String>> actual=groupAnagrams(strs);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp3() {
		String[] strs={"a"};
		List<List<String>> expected=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		list1.add("a");
		expected.add(list1);
		List<List<String>> actual=groupAnagrams(strs);
		Assert.assertEquals(expected,actual);
	}
	//Approach1 - HashMap
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String,List<String>> map=new HashMap<>();
		for(String s:strs) {
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String sortedStr=String.valueOf(c);
			if(!map.containsKey(sortedStr)) map.put(sortedStr,new ArrayList<String>());
			map.get(sortedStr).add(s);
		}
		return new ArrayList<>(map.values());
	}
}