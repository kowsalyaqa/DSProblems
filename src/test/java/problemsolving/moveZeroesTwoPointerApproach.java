package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class moveZeroesTwoPointerApproach {

	
	/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
	 * Note that you must do this in-place without making a copy of the array.
	 * 
	 * Example 1:
	 * Input: nums = [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 * 
	 * Example 2:
	 * Input: nums = [0]
	 * Output: [0]
	 * 
	 *  Read input integer array
	 *  initialize start=0,end=1 start and end<input array length
	 *  start!=0,end ==0->increment end<length
	 *  if(start==0,end!=0) ->swap
	 *  compare the ouput with output array
	 *  
	 *  */
	
	
	@Test
	public static int[] moveZeros(int[] nums,int length) {
		int start=0, end=1,temp=0;
		
		while(end<length){
			if(nums[start]==0 && nums[end]!=0) {
				temp=nums[start];
				nums[start++]=nums[end];
				nums[end++]=temp;
			}else if(nums[start]==0&&nums[end]==0){
				end++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}
	
	public static void main(String[] args) {
		int[] nums= {0,1,0,12,1,0};
		int length=nums.length;
		int[] expected= {1,12,1,0,0,0};
		int[] actual=moveZeros(nums,length); 
		Assert.assertArrayEquals(expected, actual);


	}

}
