package binarySearch;

import org.junit.Assert;
import org.junit.Test;

public class returnMatchedIndexfromTarget {

	//@Test
	public void tdp1() {
		int nums[] = { -1, 0, 3, 5, 9, 12 };
		int target = 9;
		int expected = 4;
		int actual = returnTaregtMatchedEleIndex(nums, target);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int nums[] = { 1,3,5,6 };
		int target = 5;
		int expected = 2;
		int actual = returnTaregtMatchedEleIndex2(nums, target);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int nums[] = { 1,3,5,6 };
		int target = 2;
		int expected = 1;
		int actual = returnTaregtMatchedEleIndex2(nums, target);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp7() {
		int nums[] = { 1,3,5,6 };
		int target = 7;
		int expected = 4;
		int actual = returnTaregtMatchedEleIndex2(nums, target);
		Assert.assertEquals(expected, actual);
	}

	public int returnTaregtMatchedEleIndex(int[] nums, int target) {
		int left=0,right=nums.length-1,mid;

		while(left<=right){
			mid=(left+right)/2;
			if(nums[mid]==target){
				return mid;
			}else if(nums[left]<target){
				left=mid+1;
			}else if(nums[right]>target){
				right=mid-1;
			}  
		}
		return -1;
	}
	
	public int returnTaregtMatchedEleIndex2(int[] nums, int target) {
		int left=0,right=nums.length-1,mid;

		while(left<=right){
			mid=(left+right)/2;
			if(nums[mid]==target){
				return mid;
			}else if(nums[left]<target){
				left=mid+1;
			}else if(nums[right]>target){
				right=mid-1;
			}  
		}
		return -1;
	}
}
