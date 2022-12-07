package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class IsPairDivideByGivenNumber {
	@Test
	public void tdp1() {
		int[] nums = { 9, 5, 7, 3 };
		int k = 7;
		boolean expected = true;
		boolean actual = moveZeroToleftOneToRight(nums,k);
		Assert.assertEquals(expected, actual);
	}

	public boolean moveZeroToleftOneToRight(int[] nums, int k) {
		boolean flag = false;
		int left = 0, right = 1, sum = 0;
		while (left < nums.length && right < nums.length) {
			sum = nums[left] + nums[right];
			if (sum %k ==0) {
				return flag = true;
			}
			left++;
			right++;
		}
		return flag;
	}

}
