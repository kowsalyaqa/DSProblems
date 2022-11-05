package problemsolving;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfGoodPairs1512HashMap {
	/*
	 * 1512. Number of Good Pairs Given an array of integers nums, return the number
	 * of good pairs. A pair (i, j) is called good if nums[i] == nums[j] and i < j.
	 * 
	 * Test Data: ----------- Example 1: Input: nums = [1,2,3,1,1,3] Output: 4
	 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
	 * 
	 * Example 2: Input: nums = [1,1,1,1] Output: 6 Explanation: Each pair in the
	 * array are good.
	 * 
	 * Example 3: Input: nums = [1,2,3] Output: 0
	 * 
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 100 1 <= nums[i] <= 100
	 * 
	 * 
	 * Total Time:16 mins --------------- 1.Understand Question - 3 mins 2.Logic
	 * build - 3mins 3.PseudoCode- 4 mins 4.Code - 3 mins 5.Run and debug - 3 mins
	 * 
	 * PseudoCode: ----------- 1.Read input array nums 2.Initialize
	 * Map<Integer,Integer> map=new HashMap<>(); int count=0; 3.Iterate for each
	 * loop using nums array 4.Inside loop add if condition to check already key is
	 * exist, if exist we have add value to count 5. Then add value by 1 6.else add
	 * key and value as 1 7.Return count from Function and compare with expected
	 * value using assert
	 * 
	 * 
	 * 
	 * Time Complexity: O(N) Space Complexity: O(N)
	 * 
	 */
	@Test
	public void tdp1() {
		int[] nums = { 1, 2, 3, 1, 1, 3 };
		int expected = 4;
		int actual = numIdenticalPairs1(nums);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdn1() {
		int[] nums = { 1, 1, 1, 1 };
		int expected = 6;
		int actual = numIdenticalPairs1(nums);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tde1() {
		int[] nums = { 1, 2, 3 };
		int expected = 0;
		int actual = numIdenticalPairs1(nums);
		Assert.assertEquals(expected, actual);
	}

	public int numIdenticalPairs(int[] nums) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			if (map.containsKey(i)) {
				count = count + map.get(i);
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(count);
		return count;
	}
	
	public int numIdenticalPairs1(int[] nums) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
			if(map.get(i)!=1)count+=map.get(i)-1;
		}
		System.out.println(count);
		return count;
	}

}
