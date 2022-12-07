package week8.day2;

import org.junit.Assert;
import org.junit.Test;

public class JewelsAndStonesP2 {

	@Test
	public void tdp1() {
		String jewels = "aA";
		String stones = "aAAbbbb";
		int expected = 3;
		int actual = numJewelsInStones(jewels, stones);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String jewels = "bb";
		String stones = "aAAbbbb";
		int expected = 4;
		int actual = numJewelsInStones(jewels, stones);
		Assert.assertEquals(expected, actual);
	}

	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if (String.valueOf(jewels.charAt(i)).equals(String.valueOf(stones.charAt(j)))) {
					count++;
				}
			}
		}
		return count;
	}

}
