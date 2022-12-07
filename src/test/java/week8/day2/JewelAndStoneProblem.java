package week8.day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class JewelAndStoneProblem {

	@Test
	public void tdp1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int expected = 3;
		int actual = numJewelsInStones4(jewels, stones);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String jewels = "z";
		String stones = "ZZ";
		int expected = 0;
		int actual = numJewelsInStones4(jewels, stones);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		String jewels = "aAA";
		String stones = "aAAbbbb";
		int expected = 3;
		int actual = numJewelsInStones4(jewels, stones);
		Assert.assertEquals(expected, actual);
	}
	
	//TC - O(N)
	public int numJewelsInStones(String jewels, String stones) {
		Map<Character, Integer> map = new HashMap<>();
		int count = 0;
		for (int i = 0; i < stones.length(); i++) {
			map.put(stones.charAt(i), map.getOrDefault(stones.charAt(i), 0) + 1);
		}
		for (int i = 0; i < jewels.length(); i++) {
			if (map.containsKey(jewels.charAt(i))) {
				count = count + map.get(jewels.charAt(i));
			}
		}
		return count;
	}
	
	//TC - O(N)
	public int numJewelsInStones1(String jewels, String stones) {
		int count = 0;
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++) {
			set.add(jewels.charAt(i));
		}
		for (int i = 0; i < stones.length(); i++) {
			if (set.contains(stones.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public int numJewelsInStones2(String jewels, String stones) {
		int count = 0;
		for (char c : stones.toCharArray()) {
			if (jewels.indexOf(c) != -1)
				count++;
		}
		return count;
	}
	
	public int numJewelsInStones3(String jewels, String stones) {
		System.out.println(stones.replaceAll("[^" + jewels + "]", ""));
		return stones.replaceAll("[^" + jewels + "]", "").length();
	}

	//TC - O(M+N)
	public int numJewelsInStones4(String jewels, String stones) {
		int count = 0;
		int[] countOfStones = new int[128];
		for (char c : stones.toCharArray())
			countOfStones[c]++;
		for (char c : jewels.toCharArray()) {
			count=count+countOfStones[c];
		}
		return count;
	}
}
