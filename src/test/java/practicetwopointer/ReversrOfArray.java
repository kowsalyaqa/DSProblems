package practicetwopointer;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class ReversrOfArray {
/*Reverse of Array 1:30 - 1:45
 * 
 * Approach - Two pointer - TC - O(N) SC - O(1)
 * Approach - External Array TC - O(N) SC- O(N)
 * 
 * Test Data:
 * 
 * 1.[5,4,3,2,1] - [1,2,3,4,5]
 * 2.[1,2,3,4,5] - [5,4,3,2,1]
 * 3.[1,5,3,4,2] - [2,4,3,5,1]
 * 4.[1,1] - [1,1]
 * 5.[] - []
 * Approach - Two pointer - TC - O(N) SC - O(1)
 * 
 * PC: 1:45 - 1:50
 * ----
 * 1.Declare left=0 index and right=arraylength-1 index
 * 2.Iterate while loop with condition (left<right)
 * 3.swap left and right, Increment left and right by 1
 * 4.return reversed array from method
 * 
 * Code and Debug- 1:51 - 2:09
 * 
 */
	
	@Test
	public void tdp1() {
		int nums[]= {5,4,3,2,1};
		int expected[]= {1,2,3,4,5};
		int actual[]= reverseArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int nums[]= {1,2,3,4,5};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int nums[]= {1,5,3,4,2};
		int expected[]= {2,4,3,5,1};
		int actual[]= reverseArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]= reverseArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int nums[]= {};
		int expected[]= {};
		int actual[]= reverseArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	//Approach - Two pointer - TC - O(N) SC - O(1)
	private int[] reverseArray(int[] nums) {
		int left=0,right=nums.length-1,temp=0;
		while(left<right) {
			temp=nums[left];
			nums[left++]=nums[right];
			nums[right--]=temp;
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	@Test
	public void tdp6() {
		int nums[]= {5,4,3,2,1};
		int expected[]= {1,2,3,4,5};
		int actual[]= reverseArrayExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp7() {
		int nums[]= {1,2,3,4,5};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp8() {
		int nums[]= {1,5,3,4,2};
		int expected[]= {2,4,3,5,1};
		int actual[]= reverseArrayExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp9() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]= reverseArrayExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp10() {
		int nums[]= {};
		int expected[]= {};
		int actual[]= reverseArrayExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	//Approach - External Array TC - O(N) SC- O(N)
	private int[] reverseArrayExternalArray(int[] nums) {
		int result[]=new int[nums.length];
		int x=0;
		for(int i=nums.length-1;i>=0;i--) {
			result[x++]=nums[i];
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
