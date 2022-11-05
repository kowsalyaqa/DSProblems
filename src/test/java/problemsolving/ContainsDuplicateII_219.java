package problemsolving;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateII_219 {
	/*
	 * Given an integer array nums and an integer k, return true if there are two
	 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
	 * - j) <= k.
	 * 
	 * Test Data: ---------- Example 1: Input: nums = [1,2,3,1], k = 3 Output: true
	 * 
	 * Example 2: Input: nums = [1,0,1,1], k = 1 Output: true
	 * 
	 * Example 3: Input: nums = [1,2,3,1,2,3], k = 2 Output: false
	 * 
	 * 
	 * Pseudo Code: ------------- 1.Read integer array nums and intger k 2.Iterate
	 * two for loops with nums.length 3.int second For loop starts with 1 index
	 * 4.Add if (nums[i]==nums[j] & (i<j),if yes 5.int subtract=i-j;
	 * 6.subtract=Math.absolute(subtract) 7.Compare if(Subtract<=k) return true;
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
	 *
	 *
	 *
	 * Total Time: 32 mins ------------- 1.Understand Question - 3 mins 2.Login
	 * Build - 3 mins 3.Pseudo code - 5 mins 4.Code - 5 mins 5. Run and Debug - 10
	 * mins
	 * 
	 * Time complexity - O(n^2) Space complexity - Constant
	 */

	@Test
	public void tdp1() {
		int[] nums = {1,2,3,1};
		int k = 3;
		boolean expected = true;
		boolean actual = containsDuplicateII(nums, k);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums = {1,0,1,1};
		int k = 1;
		boolean expected = true;
		boolean actual = containsDuplicateII(nums, k);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		boolean expected = false;
		boolean actual = containsDuplicateII(nums, k);
		Assert.assertEquals(expected, actual);
	}
	 public boolean containsDuplicateI(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int i = 0; i < nums.length; i++) {
	            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
	            map.put(nums[i], i);
	        }
	        return false;
	    }

	 
	  public boolean containsDuplicateII(int[] nums, int k) {
	        int substract=0;
			for(int i=0;i<nums.length;i++) {
				for(int j=i+1;j<nums.length;j++) {
					if(i<j && nums[i]==nums[j]) {
						substract=i-j;
						substract=Math.abs(substract);
						if(substract<=k) {
							return true;
						}

					}
				}
			}
			return false;
	    }
}
