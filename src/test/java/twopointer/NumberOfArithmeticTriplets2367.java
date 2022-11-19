package twopointer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfArithmeticTriplets2367 {
	/*
	 * 2367. Number of Arithmetic Triplets You are given a 0-indexed, strictly
	 * increasing integer array nums and a positive integer diff. A triplet (i, j,
	 * k) is an arithmetic triplet if the following conditions are met:
	 * 
	 * i < j < k, nums[j] - nums[i] == diff, and nums[k] - nums[j] == diff. Return
	 * the number of unique arithmetic triplets.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [0,1,4,6,7,10], diff = 3 Output: 2 Explanation: (1, 2, 4) is an
	 * arithmetic triplet because both 7 - 4 == 3 and 4 - 1 == 3. (2, 4, 5) is an
	 * arithmetic triplet because both 10 - 7 == 3 and 7 - 4 == 3. Example 2:
	 * 
	 * Input: nums = [4,5,6,7,8,9], diff = 2 Output: 2 Explanation: (0, 2, 4) is an
	 * arithmetic triplet because both 8 - 6 == 2 and 6 - 4 == 2. (1, 3, 5) is an
	 * arithmetic triplet because both 9 - 7 == 2 and 7 - 5 == 2.
	 * 
	 * Constraints:
	 * 
	 * 3 <= nums.length <= 200 0 <= nums[i] <= 200 1 <= diff <= 50 nums is strictly
	 * increasing.
	 * 
	 * 
	 * understand Question - 18:38 - 19:07
	 * 
	 * Pseudo Code: 19:11 - 19:13 ------------- 1.Declare Map<Integer,Integer>
	 * map=new HashMap<>(); Key - nums element, value - index, int count=0; 2.Add
	 * nums elements into map using foreach loop with nums.length 3.Iterate for loop
	 * using nums.length and check if(map.contains the second the third element
	 * using formula nums[i]+diff=second number, nums[i]+(diff*diff)=third number
	 * 4.If condition staisfy increase count by 1 5.Once loop complete, return
	 * count;
	 * 
	 * code - 19:14 - 19:18
	 * 
	 * Run & Debug - 19:17 - 19:18
	 * 
	 * Time complexity - O(N) Space Complexity - O(N)
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
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		int nums[] = { 0, 1, 4, 6, 7, 10 };
		int diff = 3;
		int expected = 2;
		int actual = arithmeticTriplets(nums, diff);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int nums[] = { 4, 5, 6, 7, 8, 9 };
		int diff = 2;
		int expected = 2;
		int actual = arithmeticTriplets(nums, diff);
		Assert.assertEquals(expected, actual);
	}

	public int arithmeticTriplets(int[] nums, int diff) {
		int count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) map.put(nums[i], i);
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] + diff) && map.containsKey(nums[i] + diff * 2)) count++;
		}
		return count;
	}
}
