package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesfromSortedArray26 {
	 @Test
	public void tdp1() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int expected = 5;
		int actual = removeDuplicates(nums);
		Assert.assertEquals(expected, actual);
	}

	// @Test
	public void tdp2() {
		int[] nums = { 2, 2, 2, 4, 6, 6 };
		int expected = 3;
		int actual = removeDuplicates(nums);
		Assert.assertEquals(expected, actual);
	}

	//@Test
	public void tdp3() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int expected = 5;
		int actual = removeDuplicateFromSortedArray(nums);
		Assert.assertEquals(expected, actual);
	}

	//@Test
	public void tdp4() {
		int[] nums = { 2, 2, 2, 4, 6, 6 };
		int expected = 3;
		int actual = removeDuplicateFromSortedArray(nums);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp5() {
		int[] nums = { 2, 2, 2, 4, 6, 6 };
		int expected = 3;
		int actual = removeDuplicateFromSortedArrayUsingIndex(nums);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp6() {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int expected = 5;
		int actual = removeDuplicateFromSortedArray(nums);
		Assert.assertEquals(expected, actual);
	}

	public int removeDuplicates(int[] nums) {
		int newIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				nums[newIndex] = nums[i];
				newIndex++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return newIndex;
	}

	public int removeDuplicateFromSortedArray(int[] nums) {
		int left = 0, right = 1, count = 0;
		while (left < nums.length && right < nums.length) {
			if (nums[left] != nums[right]) {
				count++;
				left = right;
				right++;
			} else {
				right++;
			}
		}
		return count + 1;
	}
	

	public int removeDuplicateFromSortedArrayUsingIndex(int[] nums) {
	int i=0,j=0;
	while(i<nums.length-1) {
		if(nums[i]!=nums[i+1]) {
			nums[j++]=nums[i];
		}
		i++;
	}
		return j+1;
	}
}
