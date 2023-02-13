package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedDNASequences187 {
	
	/*
	 * UQ: 17 mins
	 * 
	 * Test Data:
	 * 
	 * Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT" Output:
	 * ["AAAAACCCCC","CCCCCAAAAA"]
	 * 
	 * 
	 * Input: s = "AAAAAAAAAAAAA" Output: ["AAAAAAAAAA"]
	 * 
	 * 
	 * Input: s = "AAAAAAAAAACCCCCCC" Output: [""]
	 * 
	 * Input: s = "A" Output: [""]
	 * 
	 * Input: s = "BBBBBBBBBBBBBYYYYYYYYYY" Output: [""]
	 * 
	 * Input: s = "AAAAAAAAAAA" Output: [""]
	 * 
	 * 
	 * 
	 * PC: --- 
	 * 1.String length is less than 10 return empty list 
	 * 2.Iterate for loop
	 * s.length(),i=0,i++
	 *  3.Extract substring(i,i+10) 
	 *  4.create HashMap String integer 
	 * 5.add if map.contains(substring) with count 1 
	 * 6.else check key value>1 then add in list 
	 * 7.return result
	 * 
	 * Code:8:26 - 8:42
	 * 
	 * TC - O(N)
	 * SP - O(N)
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAACCCCC");
		expected.add("CCCCCAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String s = "AAAAAAAAAAAAA";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAAAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String s = "AAAAAAAAAACCCCCCC";
		List<String> expected = new ArrayList<>();
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		String s = "BBBBBBBBBBBBBYYYYYYYYYY	";
		List<String> expected = new ArrayList<>();
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		String s = "A";
		List<String> expected = new ArrayList<>();
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		String s = "AAAAAAAAAAA";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAAAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequences(s);
		Assert.assertEquals(expected, actual);
	}

	//HashMap and set solution
	public List<String> findRepeatedDnaSequences(String s) {
		Set<String> list = new HashSet<>();
		if (s.length() < 10)
			return new ArrayList<>();
		if (!(s.contains("A") || s.contains("C") || s.contains("G") || s.contains("T")))
			return new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length() - 9; i++) {
			String substring = s.substring(i, i + 10);
			map.put(substring, map.getOrDefault(substring, 0) + 1);
			if (map.containsKey(substring)) {
				if (map.get(substring) > 1) {
					list.add(substring);
				}
			}
		}
		System.out.println(list);
		return new ArrayList<>(list);
	}

	@Test
	public void tdp7() {
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAACCCCC");
		expected.add("CCCCCAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp8() {
		String s = "AAAAAAAAAAAAA";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAAAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp9() {
		String s = "AAAAAAAAAACCCCCCC";
		List<String> expected = new ArrayList<>();
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp10() {
		String s = "BBBBBBBBBBBBBYYYYYYYYYY	";
		List<String> expected = new ArrayList<>();
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp11() {
		String s = "A";
		List<String> expected = new ArrayList<>();
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp12() {
		String s = "AAAAAAAAAAA";
		List<String> expected = new ArrayList<>();
		expected.add("AAAAAAAAAA");
		System.out.println(expected);
		List<String> actual = findRepeatedDnaSequencesSubstring(s);
		Assert.assertEquals(expected, actual);
	}

	// Substring - Time Limit Exceed
	public List<String> findRepeatedDnaSequencesSubstring(String s) {
		Set<String> list = new HashSet<>();
		if (s.length() < 10)
			return new ArrayList<>();
		if (!(s.contains("A") || s.contains("C") || s.contains("G") || s.contains("T")))
			return new ArrayList<>();
		for (int i = 0; i < s.length() - 9; i++) {
			if (s.substring(i + 1).contains(s.substring(i, i + 10))) {
				list.add(s.substring(i, i + 10));
			}
		}
		return new ArrayList<>(list);
	}
}
