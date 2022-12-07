package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArray977 {
	@Test
	public void tdp1() {
		int[] nums = {-4,-1,0,3,10};
		int[] expected = {0,1,9,16,100};
		int[] actual = sortedSquares(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums = {-7,-3,2,3,11};
		int[] expected = {4,9,9,49,121};
		int[] actual = sortedSquares(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	public int[] sortedSquares(int[] nums){
		int left=0,right=nums.length-1;
		int[] output=new int[nums.length];
		for(int i=nums.length-1;i>=0;i--) {
			if(Math.abs(nums[left])>Math.abs(nums[right])) {
				output[i]=nums[left]*nums[left];
				left++;
			}else {
				output[i]=nums[right]*nums[right];
				right--;
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
}
