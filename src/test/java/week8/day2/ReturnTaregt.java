package week8.day2;

import org.junit.Assert;
import org.junit.Test;


public class ReturnTaregt {


	@Test
	public void tdp1() {
		int nums[]= {-1,0,3,5,9,12};
		int target=9;
		int expected=4;
		int actual=returnTaregtMatchedEleIndex(nums,target);
		Assert.assertEquals(expected, actual);
	}
	public int returnTaregtMatchedEleIndex(int[] nums,int target) {
		int left=0,right=nums.length-1;

		while(left<right){
			if(nums[left]==target){
				return left;
			}else if(nums[right]==target){
				right--;
			}else if(nums[left]<target){
				left++;
			}else if(nums[right]>target){
				right--;
			}
		}
		return -1;
	}
}
