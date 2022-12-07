package week8.day2;

import org.junit.Assert;
import org.junit.Test;

public class MaximumAverageSubarrayIP4643 {
	@Test
	public void tdp1() {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		double expected = 12.75000;
		double actual = findMaxAverage(nums, k);
		Assert.assertEquals(expected, actual);
	}

	public double findMaxAverage(int[] nums, int k) {
		int pointer = 0, sum = 0;
		double Average=0,max = Integer.MIN_VALUE;
		while (pointer < k - 1) {
			sum = sum + nums[pointer++];
		}
		while (pointer < nums.length) {
			sum = sum + nums[pointer];
			Average = sum / k;
			max = Math.max(max, Average);
			sum = sum - nums[pointer - k + 1];
			pointer++;
		}
		return max;
	}
}
