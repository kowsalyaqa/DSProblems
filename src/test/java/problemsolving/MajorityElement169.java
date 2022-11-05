package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElement169 {

	/*
	 * Test Data:
	 *
	 * Example1: Input: nums = [3,2,3] Output: 3
	 * 
	 * Example1: Input: nums = [2,2,1,1,1,2,2] Output: 2
	 * 
	 * 
	 * Pseudo Code:
	 * ----------------
	 * 1.Read input array and Declare count=0,max=Integer.MIN_VALUE
	 * 2.Iterate two for loops using nums.length to compare current element with next element
	 * 3.First for loop for take each element and compare with remains element in 2 for loop
	 * 4.Inside second for loop add if (nums[i]==nums[j], if yes
	 * 5.Count++, comapre count with max if(max<count) max=count
	 * 6.Compare max is greater than nums.length/2 then return nums[i] as majority element
	 * 7.Return from function and compare with expected ouput using assert
	 *  
	 * 	Total Time: 32 mins
	 * -------------
	 * 1.Understand Question - 5 mins
	 * 2.Login Build - 5 mins
	 * 3.Pseudo code - 7 mins
	 * 4.Code -  5 mins
	 * 5. Run and Debug - 10 mins
	 * 
	 * Time complexity - O(n^2)
	 * Space complexity - Constant
	 */

	// @Test
	public void tdp1() {
		int[] nums = { 3, 2, 3 };
		int expected = 3;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}

	// @Test
	public void tdp2() {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		int expected = 2;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int[] nums = { 6, 5, 5 };
		int expected = 5;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}

	public int majorityElement(int[] nums) {
		int count = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (max < count) {
				max = count;
			}
			if (max > nums.length / 2) {
				return nums[i];
			}
		}

		return 0;
	}

}
