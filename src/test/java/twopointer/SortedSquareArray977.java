package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class SortedSquareArray977 {
	/*977. Squares of a Sorted Array
	 * 
	 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
		
		Example 1:
		Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
		
		Example 2:
		Input: nums = [-7,-3,2,3,11]
		Output: [4,9,9,49,121]
		 
		Constraints:
		
		1 <= nums.length <= 104
		-104 <= nums[i] <= 104
		nums is sorted in non-decreasing order.
	 * 
	 * Understand Question - 10 mins
	 * Logic Build - 45 mins
	 * Pseudo Code - 5 mins
	 * -----------------------
	 * 1.Declare left=0,right=nums.length-1,x=nums.length-1
	 * 2.Create output array with nums.length
	 * 3.Iterate for loop using nums.length, i value starts from last
	 * 4.Find absolute value of left and right, if left value is greater or equal to right
	 * 		Square of left and add output array and increment left
	 * 5.Else Square of right and add output array and decrement left
	 * 6.return output Array
	 * 
	 *
	 * code - 5 mins
	 * Run and Debug - 10 mins
	 * 
	 * Total Time - 75 mins
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - O(N)
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
		int[] nums = {-4,-1,0,3,10};
		int[] expected = {0,1,9,16,100};
		int[] actual = sortedSquares(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[] nums = {-7,-3,2,3,11};
		int[] expected = {4,9,9,49,121};
		int[] actual = sortedSquares(nums);
		Assert.assertArrayEquals(expected, actual);
	}


	 public int[] sortedSquares(int[] nums) {
		 int[] output = new int[nums.length];
		    int left = 0,right = nums.length - 1;
		    for (int i = nums.length - 1; i >= 0; i--) {
		      if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
		        output[i] = nums[left] * nums[left];
		          left++;
		        } else {
		        	output[i] = nums[right] * nums[right];
		          right--;
		         }
		     }
		    return output;
	    }
}
