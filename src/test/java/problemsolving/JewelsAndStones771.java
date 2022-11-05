package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class JewelsAndStones771 {
	/***
	 * Example 1:
		Input: jewels = "aA", stones = "aAAbbbb"
		Output: 3
		
		Example 2:
		Input: jewels = "z", stones = "ZZ"
		Output: 0
	 * 
	 * Pseudo Code:
	 * ------------
	 * 1.Declare int count=0
	 * 2.Iterate two for loops with stones and jewel length
	 * 3.compare Stones[i] with jewel[j] , if yes, increment count
	 * 4.Once loop is over return count form function and compare expected value
	 * 
	 * Time Complexity - O(N^2)
	 * Space Complexity - constant
	 * 
	 * Total Time: 20 mins
	 * -------------
	 * 1.Understand Question - 5 mins
	 * 2.Login Build - 2 mins
	 * 3.Pseudo code -  2mins
	 * 4.Code -  5 mins
	 * 5. Run and Debug - 5 mins
	 * 
	 */
	
	@Test
	public void tdp1() {
		String jewels = "aA", stones = "aAAbbbb";
		int expected = 3;
		int actual = numJewelsInStones(jewels,stones);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		String jewels = "z", stones = "ZZ";
		int expected = 0;
		int actual = numJewelsInStones(jewels,stones);
		Assert.assertEquals(expected, actual);
	}
	
	public int numJewelsInStones(String jewels, String stones) {
		int count = 0;
		for(int i=0; i<stones.length();i++){
			for(int j=0;j<jewels.length();j++){
				if(stones.charAt(i) == jewels.charAt(j))
					count++;
			}
		}
		return count;
	}

}
