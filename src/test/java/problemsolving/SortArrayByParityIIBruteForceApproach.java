package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityIIBruteForceApproach {

	/*
	 * 922. Sort Array By Parity II Given an array of integers nums, half of the
	 * integers in nums are odd, and the other half are even. Sort the array so that
	 * whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
	 * Return any answer array that satisfies this condition.
	 * 
	 * Example 1: Input: nums = [4,2,5,7] Output: [4,5,2,7] Explanation: [4,7,2,5],
	 * [2,5,4,7], [2,7,4,5] would also have been accepted.
	 * 
	 * [3, 1, 4, 2]=>[2, 1, 4, 3 ]
	 * [4,2,5,7,2,2,5,8,6,4]=>[4, 5, 2, 7, 2, 5, 2, 4, 6, 8]
	 * [3,4]=>[4,3]
	 * 
	 * Example 2: Input: nums = [2,3] Output: [2,3]
	 * 
	 * Test Data - Positive [2,3],[4,2,5,7] [3, 1, 4, 2] Negative - [1][], Edge
	 * -[1,1,1,1],[2,2,2,2]
	 * 
	 * Pseudo Code: Read input integer array nums 
	 * Initialize int temp=0 for swap
	 * Iterate for first for loop using from 0 index element using input array length, i increment by 2
	 * Iterate second for loop using from 1 index element using input array length,  j increment by 2
	 * if(nums[i]%2!=0 && nums[j]%2=0){
	 * 				temp=nums[i];
	 *				nums[i]=nums[j];
	 *				nums[j]=tempp;
	 * }
	 * }
	 * 	compare nums array with expected array
	 * 
	 * 
	 * 
	 * Time Complexity - Array Length - 4 | Loop Count - outer - 4 inner - 1 
	 * Time Complexity - Array Length - 10 | Loop Count - outer - 25 inner - 2
	 * Time Complexity - Array Length - 2 | Loop Count - outer - 1 inner - 1 
	 * 
	 * Time Complexity - O(N+m), Space Complexity - No
	 */

	@Test
	public void postiveData() {
		int[] nums = {4,2,5,7};// 3,1,4,2
		int[] expected = {4,5,2,7};// 2,1,4,3
		int[] actual = SortArrayByParityII(nums, nums.length);
		Assert.assertArrayEquals(expected, actual);
	}

	private int[] SortArrayByParityII(int[] nums, int length) {
		if (nums.length == 0)
			if (nums.length == 0)
				return new int[] { 0 };
		int temp = 0;

		for (int i = 0; i < nums.length; i=i+2) {
			for(int j=1;j<nums.length;j=j+2) {
				if(nums[i]%2!=0 && nums[j]%2==0) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}
}
