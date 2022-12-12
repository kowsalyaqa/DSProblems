package week10.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SelectSort {
	//Code - 10:05 
	//@Test
	public void tdp1() {
		int[] nums= {1,2,4,8,11,22,17,18};
		int[] expected= {1,2,4,8,11,17,18,22};
		int[] actual=selectSort(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	//@Test
	public void tdp2() {
		int[] nums= {22,18,17,11,8,4,2,1};
		int[] expected= {1,2,4,8,11,17,18,22};
		int[] actual=selectSortBruteForce(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void tdp3() {
		int[] nums= {1,2,4,8,11,17,18,22};
		int[] expected= {22,18,17,11,8,4,2,1};
		int[] actual=selectSortBruteForceDescendingOrder(nums);
		Assert.assertArrayEquals(expected, actual);
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
	public int[] selectSortBruteForce(int[]nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	public int[] selectSortBruteForceDescendingOrder(int[]nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					temp=nums[j];
					nums[j]=nums[i];
					nums[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
