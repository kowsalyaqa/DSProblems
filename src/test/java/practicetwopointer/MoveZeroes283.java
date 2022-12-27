package practicetwopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes283 {
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining
	 * the relative order of the non-zero elements. Note that you must do this
	 * in-place without making a copy of the array.
	 * 
	 * UQ - 12:17 - 12:27
	 * 
	 * Test Data
	 * 
	 * 1.[0,1,0,3] - [1,3,0,0]
	 * 2.[0,0,1,2] -[1,2,0,0] 
	 * 3.[1,2,0,0]-[1,2,0,0] 
	 * 4.[0] -[0] 
	 * 5.[] - []
	 * 6.[1,0,2,0- [1,2,0,0]
	 * 
	 * Approach - Two pointer - Equi Direction TC - O(N) SC = O(1)
	 * 
	 * PC- 12:28 12:35
	 * --------- 
	 * 1.Declare left=0,right=1,temp=0 
	 * 2.Iterate using while loop using left<nums.length && right<nums.length
	 * 3.if nums[left]== 0 && nums[right!=0 swap left and right values, increment left and right by 1
	 * 4.else if(nums[left]!=0 && nums[right]!=0) left++; 
	 * 5.else if(nums[left]==0 && nums[right]==0) right--; 
	 * 6.return nums once loop is complete
	 * 
	 * code & Debug- 16:01 to 16:05
	 * 
	 * Approach - Bruteforce TC - O(N*2) SC - O(1) 
	 * PC- 16:06 - 16:08
	 * --------- 
	 * 1.Declare left=0,right=1,temp=0 
	 * 2.Iterate 2 for loop using nums.length , first for loop starts from i=0 and second for loop starts from j=i+1
	 * 3.swap if i the element is zero and j th element is not zero
	 * 4.Once loop complete return nums array from function
	 * 
	 * code & Debug  - 16:08 - 16:10
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int nums[] = {0,0,1,2};
		int expected[] = { 1,2,0, 0 };
		int actual[] = moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int nums[] = {1,2,0,0};
		int expected[] = {1,2,0,0};
		int actual[] = moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	private int[] moveZeroes(int[] nums) {
		int left=0,right=1,temp=0;
		while(left<nums.length && right<nums.length) {
			if(nums[left]==0 && nums[right]!=0) {
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right++]=temp;
			}else if(nums[right]==0) {
				right++;
			}else {
				left++;
				right++;
			}
		}
		return nums;
	}

	@Test
	public void tdp6() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroesBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp7() {
		int nums[] = {0,0,1,2};
		int expected[] = { 1,2,0, 0 };
		int actual[] = moveZeroesBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp8() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroesBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp9() {
		int nums[] = {1,2,0,0};
		int expected[] = {1,2,0,0};
		int actual[] = moveZeroesBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp10() {
		int nums[] = { 0, 1, 0, 3 };
		int expected[] = { 1, 3, 0, 0 };
		int actual[] = moveZeroesBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	private int[] moveZeroesBF(int[] nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==0 && nums[j]!=0) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
