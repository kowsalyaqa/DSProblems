package twopointer;

import org.junit.Test;

public class moveZeros283 {

	/**
	 * https://leetcode.com/problems/move-zeroes/

		6:59 0 19:01 - understand the question

		19:02 - 19:07 Pseudo Code:

		1.Read integer array, intialize left=0,right=0, temp=0
		2.Iterate using while(right<nums.length)
		3.if left is zero and right is not zero, we can swap left and right nums value and increment left & right by 1 
		4.suppose if left==0 but Right==0, Increment right by 1
		5.left is not zero, Increment by 1

		Code:19:07 - 19:13
		Run & Debug - 19:14 - 19:19
		
		Time Complexity - O(N)
		Space Complexity - Constant
		
	 */

	@Test
	public void tdp1(){
		int[] nums={0,1,0,1,3,12};
		moveZeroes(nums);
	}
	@Test
	public void tdp2(){
		int[] nums= {1,1,1,1,1};
		moveZeroes(nums);
	}
	
	@Test
	public void tdp3(){
		int[] nums= {};
		moveZeroes(nums);
	}

	@Test
	public void tdp4(){
		int[] nums= {0};
		moveZeroes(nums);
	}
	public void moveZeroes(int[] nums){
		int left=0,right=0,temp=0;
		while(right<nums.length && left<nums.length){
			if(nums[left]==0 && nums[right]!=0){
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right++;
			}else if (nums[right]==0){
				right++;
			}else{
				left++;
				right++;
			}
		}
	}

}
