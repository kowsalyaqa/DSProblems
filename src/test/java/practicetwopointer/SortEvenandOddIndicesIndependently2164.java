package practicetwopointer;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class SortEvenandOddIndicesIndependently2164 {
	/*
	 * You are given a 0-indexed integer array nums. Rearrange the values of nums
	 * according to the following rules: Sort the values at odd indices of nums in
	 * non-increasing order. For example, if nums = [4,1,2,3] before this step, it
	 * becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in
	 * non-increasing order. Sort the values at even indices of nums in
	 * non-decreasing order. For example, if nums = [4,1,2,3] before this step, it
	 * becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in
	 * non-decreasing order. Return the array formed after rearranging the values of
	 * nums.
	 * 
	 * UQ - 17:15 - 17:27
	 * 
	 * Approach - Bruteforce TC - O(N*2) SC - O(1) Approach - Twoipointer equi
	 * direction TC - O(N) SC- O(1)
	 * 
	 * Test Data: 17:28 - 17:33 1.[1] - [1] 2.[0] - [0] 3.[] - [] 4.[0,1] - [0,1]
	 * 5.[1,0] - [1,0] 6.[1,1] - [1,1] 7.[0,0] - [0,0] 8.[1,2,3,4,5,6] -
	 * [1,6,3,4,5,2] 9.[4,1,2,3] -[2,3,4,1] 10.[2,1] - [2,1]
	 * 
	 * Bruteforce Approach PC: 17:34 - 17:36 1. Iterate using 2 for loops,
	 * i=0,increment i by 1, j=i+1 increment j by 2 to compare respective index
	 * values 2.compare oddindex with oddindex+1, if(oddindex<oddindex+1) swap it 3.
	 * compare evenIndex with evenIndex+1, if(evenIndex<evenIndex+1) swap it
	 * 4.return nums array from function
	 * 
	 * Code & Debug - 17:36 - 17:54
	 * 
	 * Approach - external Array TC - O(N) SC- O(1) - 17:54
	 * 
	 * UQ and Technique - 18:54 - 20
	 * 
	 * PC: 19:00 - 1.Check nums length is equal to less than or equal to 2, if yes,
	 * return nums array 
	 * 2.Declare two new array to store even and odd numbers and
	 * iterate for loop add even and odd values separately 
	 * 3.Declare result array to add even and odd values after sort 
	 * 4.Use Array.sort to even and odd array
	 * 5.Iterate for loop i=0,i=i+2 for even values to add in result array
	 * 6.Iterate for loop i=1,i=i+2 for odd values from last index to add in result array
	 * 7.return result array Once iteration is complete.
	 * 
	 *
	 */

	@Test
	public void tdp1() {
		int nums[] = { 1 };
		int expected[] = { 1 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int nums[] = { 0 };
		int expected[] = { 0 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int nums[] = {};
		int expected[] = {};
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		int nums[] = { 0, 1 };
		int expected[] = { 0, 1 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		int nums[] = { 1, 0 };
		int expected[] = { 1, 0 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		int nums[] = { 1, 1 };
		int expected[] = { 1, 1 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp7() {
		int nums[] = { 0, 0 };
		int expected[] = { 0, 0 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp8() {
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int expected[] = { 1, 6, 3, 4, 5, 2 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp9() {
		int nums[] = { 4, 1, 2, 3 };
		int expected[] = { 2, 3, 4, 1 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp10() {
		int nums[] = { 2, 1 };
		int expected[] = { 2, 1 };
		int actual[] = sortEvenOdd(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	private int[] sortEvenOdd(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 2; j < nums.length; j = j + 2) {
				if (i % 2 == 0) {
					if (nums[i] > nums[j]) {
						temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				} else if (i % 2 != 0) {
					if (nums[i] < nums[j]) {
						temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
		return nums;
	}

	@Test
	public void tdp11() {
		int nums[] = { 1 };
		int expected[] = { 1 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp12() {
		int nums[] = { 0 };
		int expected[] = { 0 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp13() {
		int nums[] = {};
		int expected[] = {};
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp14() {
		int nums[] = { 0, 1 };
		int expected[] = { 0, 1 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp15() {
		int nums[] = { 1, 0 };
		int expected[] = { 1, 0 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp16() {
		int nums[] = { 1, 1 };
		int expected[] = { 1, 1 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp17() {
		int nums[] = { 0, 0 };
		int expected[] = { 0, 0 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp18() {
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int expected[] = { 1, 6, 3, 4, 5, 2 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp19() {
		int nums[] = { 4, 1, 2, 3 };
		int expected[] = { 2, 3, 4, 1 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp20() {
		int nums[] = { 2, 1 };
		int expected[] = { 2, 1 };
		int actual[] = sortEvenOddTwoPointer(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	// External Array
	private int[] sortEvenOddTwoPointer(int[] nums) {
		if (nums.length <= 2)
			return nums;
		int result[] = new int[nums.length];
		int[] even;
		if (nums.length % 2 == 0) {
			even = new int[nums.length / 2];
		} else {
			even = new int[(nums.length / 2) + 1];
		}
		int[] odd = new int[nums.length / 2];
		int x = 0, y = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			even[x++] = nums[i];
		}
		for (int i = 1; i < nums.length; i = i + 2) {
			odd[y++] = nums[i];
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
		int e = 0, o = odd.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				result[i] = even[e++];
				return result;
			} else {
				result[i] = odd[o--];
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

}
