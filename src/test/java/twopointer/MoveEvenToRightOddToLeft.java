package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveEvenToRightOddToLeft {
	@Test
	public void tdp1() {
		int[] nums= {2,3,4,2,1,1,5,7};
		int[] expected= {7,3,5,1,1,2,4,2};
		int[] actual=moveEvenToRightOddToLeft(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	public int[] moveEvenToRightOddToLeft(int[] nums) {
		int left=0,right=nums.length-1,temp=0;
		while(left<right) {
			if(nums[left]%2 ==0 && nums[right]%2 !=0) {
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}else if(nums[left]%2 !=0) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
}
