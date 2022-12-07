package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class GroupAnagaramsClass {
	//@Test
	public void tdp1() {
		String[] strs={"eat","tea","tan","ate","nat","bat"};
		List<List<String>> expected=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		list1.add("eat");
		list1.add("tea");
		list1.add("ate");
		List<String> list2=new ArrayList<>();
		list2.add("bat");
		List<String> list3=new ArrayList<>();
		list3.add("tan");
		list3.add("nat");
		expected.add(list1);
		expected.add(list2);
		expected.add(list3);
		List<List<String>> actual=groupAnagarams(strs);
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void tdp2() {
		String[] strs={"eat","tea","tan","ate","nat","bat"};
		List<List<String>> expected=new ArrayList<>();
		List<String> list1=new ArrayList<>();
		list1.add("eat");
		list1.add("tea");
		list1.add("ate");
		List<String> list2=new ArrayList<>();
		list2.add("bat");
		List<String> list3=new ArrayList<>();
		list3.add("tan");
		list3.add("nat");
		expected.add(list3);
		expected.add(list1);
		expected.add(list2);
		List<List<String>> actual=groupAnagaramsAsciiSolution(strs);
		Assert.assertEquals(expected,actual);
	}

	//Method 1: Group by Sorting
	//Time Complexity: O(n∗logk) (k is the length of largest string)
	//Space Complexity: O(n)
	public List<List<String>> groupAnagarams(String[] strs){
		List<List<String>> list=new ArrayList<>();
		Map<String,List<String>> map=new HashMap<>();
		for(String s:strs) {
			char[] c=s.toCharArray();
			Arrays.sort(c);
			String key=String.valueOf(c);
			if(map.containsKey(key)) {
				map.get(key).add(s);
			}else {
				List<String> newList=new ArrayList<>();
				newList.add(s);
				map.put(key,newList);
			}
		}
		list.addAll(map.values());
		return list;
	}

	//Method 2: Group by Frequency
	public List<List<String>> groupAnagaramsAsciiSolution(String[] strs){
		List<List<String>> list=new ArrayList<>();
		Map<String,List<String>> map=new HashMap<>();
		for(String s:strs) {
			int[] charArr = new int[26];
			for(int i=0; i<s.length(); i++){
				charArr[s.charAt(i)-'a']++;
			}
			String key=String.valueOf(charArr);
			if(map.containsKey(key)) {
				map.get(key).add(s);
			}else {
				List<String> newList=new ArrayList<>();
				newList.add(s);
				map.put(key,newList);
			}
			System.out.println(map);
		}
		list.addAll(map.values());
		System.out.println(list);
		return list;
	}
}
