package week10.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindTargetIndicesAfterSortingArray2089 {
	/*	You are given a 0-indexed integer array nums and a target element target.
	A target index is an index i such that nums[i] == target.
	Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
	 * 
	Example 1:
	Input: nums = [1,2,5,2,3], target = 2
	Output: [1,2]
	Explanation: After sorting, nums is [1,2,2,3,5].
	The indices where nums[i] == 2 are 1 and 2.

	Example 2:
	Input: nums = [1,2,5,2,3], target = 3
	Output: [3]
	Explanation: After sorting, nums is [1,2,2,3,5].
	The index where nums[i] == 3 is 3.

	Example 3:
	Input: nums = [1,2,5,2,3], target = 5
	Output: [4]
	Explanation: After sorting, nums is [1,2,2,3,5].
	The index where nums[i] == 5 is 4.


	 * UQ- 10: 10:46
	 * 
	 * Approach - Sort Array and use binary search to return first index
	 * 
	 * PC:10:47
	 * -----
	 * 1.Sort the given number of arry in ascending order
	 * 2.Pass key value and get fisrt index of target value, From that index ,adjacent index check till get not matched index
	 * 3.Return list of indices.
	 * 
	 * TC - O(N2) 
	 * SC - O(N)
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
	 * 
	 * 
	 */
	@Test
	public void tdp1() {
		int[] nums= {1,2,5,2,3};
		int target = 2;
		List<Integer> expected= new ArrayList<>();
		expected.add(1);
		expected.add(2);
		List<Integer>  actual=targetIndices(nums,target);
		Assert.assertEquals(expected, actual);
		//if(intervals.length<=1) return intervals;  
	}
	@Test
	public void tdp2() {
		int[] nums= {1,2,5,2,3};
		int target = 3;
		List<Integer> expected= new ArrayList<>();
		expected.add(3);
		List<Integer>  actual=targetIndicesUsingSelectSort(nums,target);
		Assert.assertEquals(expected, actual);
	}

	public List<Integer> targetIndices(int[] nums, int target) {
		List<Integer> list=new ArrayList<>();
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++)
			if(nums[i]==target) list.add(i);
		return list;
	}
	public List<Integer> targetIndicesUsingSelectSort(int[] nums, int target) {
		List<Integer> list=new ArrayList<>(); 
		selectSort(nums);
		for(int i=0;i<nums.length;i++)
			if(nums[i]==target) list.add(i);
		return list;
	} 
	public int[] selectSort(int[]nums) {
		int temp=0;
		for(int i=0;i<nums.length-1;i++){
			int pivot=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]<nums[pivot]){
					pivot=j;
				}
			}
			if(pivot!=i) {
				temp=nums[pivot];
				nums[pivot]=nums[i];
				nums[i]=temp;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
