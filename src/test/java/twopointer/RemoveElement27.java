package twopointer;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveElement27 {

	/*
	 * 
	 * understand the problem - 19:21- 19:33
	 * 
	 * Pseudo code: 19:33 - 19:49 
	 * 1.Declare left=0,right=0; 
	 * 2.Iterate while loop through nums.length using left pointer 
	 * 3.if nums[left] is not equal to val, add to nums[right] from nums[left] 
	 * 4.increment the right pointer 
	 * 5.return count of non-matched values
	 * 
	 * code- 19:49 - 19:54
	 * 
	 * Run & Debug - 19:54 - 10:08
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - Constant
	 * 
	 */

	@Test
	public void tdp1() {
		int[] nums = { 3, 2, 2, 3 };
		int val = 2;
		int expected = 2;
		int actual = removeElement(nums,val);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int[] nums = { 2 };
		int val = 2;
		int expected = 0;
		int actual = removeElement(nums,val);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int[] nums = { 3,3,3,3 };
		int val = 2;
		int expected = 4;
		int actual = removeElement(nums,val);
		Assert.assertEquals(expected, actual);
	}

	public int removeElement(int[] nums,int val){
		int left=0,right=0;
		while(left<nums.length){
			if(nums[left]!=val){
				nums[right++]=nums[left];
			}
			left++;
		}
		return right;
	}

}
