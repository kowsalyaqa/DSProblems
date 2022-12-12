package week10.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayBruteforce {
	/*
	 * int[] nums={2,1,6,3,5};

	output = {1,2,3,5,6}

	PC:
	---
	1.compare each element with next index element, which element is less than next element , swap it.

	code: 9:41 - 9:45

	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		int[] nums= {2,1,6,3,5};
		int[] expected= {1,2,3,5,6};
		int[] actual=sortingBtuteforce(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[] sortingBtuteforce(int[]nums) {
		int temp=0;
		for(int i=0;i<nums.length-1;i++){
				if(nums[i]>nums[i+1]){
					temp=nums[i];
					nums[i]=nums[i+1];
					nums[i+1]=temp;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
