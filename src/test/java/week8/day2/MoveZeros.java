package week8.day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeros {

	@Test
	public void tdp1() {
		int[] nums= {0,1,0,3,12};
		int[] expected= {1,3,12,0,0};
		int[] actual=moveZeroes(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
    public int[] moveZeroes(int[] nums) {
    	   int left=0,right=nums.length-1,temp=0;
    	   while(left<nums.length && right<nums.length) {
    		   if(nums[left]!=0 && nums[right]==0) {
    			   left++;
    		   }else if(nums[left]==0 && nums[right]==0) {
    			   right--;
    		   }else {
    			   temp=nums[left];
    			   nums[left]=nums[right];
    			   nums[right]=temp;
    			   left++;
    			   right--;
    		   }
    	   }
    	   System.out.println(Arrays.toString(nums));
    	
    	return nums;
    } 
	
}
