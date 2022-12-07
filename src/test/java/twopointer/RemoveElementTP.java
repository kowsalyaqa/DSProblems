package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTP {
	@Test
	public void tdp1() {
		int[] nums= {0,1,2,2,3,0,4,2};
		int val=2;
		int expected=5;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);
	}


	public int removeElement(int[] nums, int val) {
		int left=0,right=nums.length-1,k=0,temp=0;
		while(left<right){
			if(nums[left]==val && nums[right]!=val){
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}else if(nums[left]!=val){
				left++;
			}else if(nums[right]==val){
				right--;
			}
		}
		int j=0;
		System.out.println(Arrays.toString(nums));
		for (int i : nums) {
			if(i==val) {
				
			}else {
				j++;
			}
			System.out.println(i);
		}

		return j;

	}

}
