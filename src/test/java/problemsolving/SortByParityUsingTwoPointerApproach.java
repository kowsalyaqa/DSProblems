package problemsolving;

import java.util.Arrays;

import org.junit.Assert;

public class SortByParityUsingTwoPointerApproach {

	/* Given integer arrays nums, move 	all the even integers at the beginning of the array followed by all odd integers
	 * 
	 *Return any array that satisfies  this condition
	 *
	 *Input: nums = [3,1,2,4]
	 *Output: [2,4,3,1]
	 *Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 *  Example 2:
	 *  Input: nums = [0]
	 *  Output: [0]
	 *  
	 *  Test Data - Positive - [3,1,2,4], negative - Empty Array, Edge - [1,1,1,1]
	 *  
	 *  Pseudo Code;
	 *  
	 *  Read input integer array nums
	 *  Initialize left=0 and right=length of the array -1
	 *  condition for traverse is While(left<right)
	 *  if(left==even) No Swap
	 *  		left++;
	 *  if(right==Odd) No Move
	 *  	right--;
	 *  if(left==odd & right==Even)
	 *  	swap
	 *  	left++;
	 *  	right++;
	 *  }
	 *  
	 *   {3,1,2,4};//[4,2,1,3]
	 *   {3,1,2,4,6,9};// [6, 4, 2, 1, 3, 9]
	 *   {3,1,2,4,2,6,9,2,1};//[2,4,2,6,9,1,1,3]
	 *  
	 *  Time Complexity - Array Length - 4 | Loop Count - 2
	 *  Time Complexity - Array Length - 6 | Loop Count - 2
	 *  Time Complexity - Array Length - 9 | Loop Count - 4
	 * 	 
	 * Time Complexity - O(n/2) 
	 *  
	 */

	public static int[] SortByParity(int[] nums,int length){
		int left=0,right=length-1,temp=0,loop=0;
		while(left<right){
			if(nums[left]%2==0) left++;
			if(nums[right]%2!=0) right--;
			if(nums[left]%2!=0 & nums[right]%2==0) {
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}
			loop++;
		}
		System.out.println("Loops:"+loop);
		System.out.println(Arrays.toString(nums));
		return nums;
	}

	public static void main(String[] args) {

		int[] nums= {3,1,2,4,6,9};
		int[] expected= {6, 4, 2, 1, 3, 9};
		System.out.println(Arrays.toString(expected));
		Assert.assertArrayEquals(expected, SortByParity(nums,nums.length));
	}

}
