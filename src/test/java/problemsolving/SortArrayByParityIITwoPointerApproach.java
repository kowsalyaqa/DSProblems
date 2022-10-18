package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityIITwoPointerApproach {


	/* 922. Sort Array By Parity II Given an array of integers nums, half of the
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
	 * Pseudo Code: Read input integer array nums 
	 * Initialize int temp=0, left=0,right=1;
	 * using while checking condition left and right less than length
	 *	if(left->even)
	 *		left=left+2;
	 *if(right->odd)
	 *      right=right+2;
	 *      
	 *  if(left<n & right<n){
	 *   temp=nums[left];
	 *   nums[left]=nums[right];
	 *   nums[right]=temp;
	 *   } else left and right is greater than length break the loop
	 *   
	 * compare expected output array with actual array
	 * 			
	 * Time Complexity - Array Length - 4 | Loop Count - 2
	 * Time Complexity - Array Length - 10 | Loop Count - 6
	 * Time Complexity - Array Length - 2 | Loop Count - 2
	 * 
	 * Time Complexity - O(N), Space Complexity - No
	 */

	@Test
	public void postiveData() {
		int[] nums = {3,4};// 3,1,4,2
		int[] expected = {4,3};// 2,1,4,3
		int[] actual = SortArrayByParityII(nums, nums.length);
		Assert.assertArrayEquals(expected, actual);
	}

	private int[] SortArrayByParityII(int[] nums, int length) {
		if (nums.length == 0)
			return new int[] { 0 };
		int temp = 0, left=0,right=1,outterloop=0;

		for(;left<length & right<length;) {	
			outterloop++;
			if(nums[left]%2==0) {
				left=left+2;
			}
			if(nums[right]%2!=0) {
				right=right+2;
			}
			if(left<length && right<length) {	
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
			}else
				break;
		
		}		
		System.out.println("outerloop:"+outterloop);
		System.out.println(Arrays.toString(nums));
		return nums;
	}


}
