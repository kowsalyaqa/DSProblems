package week10.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSort {
	/*
	 * PC:11:59
	 * ---- 
	 * 1.compare the i and i+1 index value
	 * 2.Swap elements if first element is greater than the next element  
	 * 3.Repeat till loop for all elements
	 * 
	 * TC - O(N2)
	 * SP -O(1)
	 * 

	 */
	@Test
	public void tdp1() {
		int[] nums= {5, 1, 4, 2, 8};
		int[] expected= {1,2,4,5,8};
		int[] actual=bubbleSort(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums= {3,6,2,1,7,-4, 3};
		int[] expected= {-4,1,2,3,3,6,7};
		int[] actual=bubbleSort(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[] bubbleSort(int[]nums) {
		  int n = nums.length;
	        for (int i = 0; i < n - 1; i++)
	            for (int j = 0; j < n - i - 1; j++)
	                if (nums[j] > nums[j + 1]) {
	                    int temp = nums[j];
	                    nums[j] = nums[j + 1];
	                    nums[j + 1] = temp;
	                }
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
