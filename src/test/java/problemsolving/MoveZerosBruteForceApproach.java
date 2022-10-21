package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosBruteForceApproach {

	
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
	 *  
	 *  Read input integer array
	 *  initialize output array with input integer array length
	 *  if(elemnt ==0) -Add in start of the output array
	 *  else -> Add in start of the output array
	 *  compare the ouput with output array
	 *  
	 *  */
	
	public static int[] moveZeros(int[] nums,int length) {
		
		int start=0, end=1,temp=0;
		while(end<length) {
			if(nums[start]==0 && nums[end]!=0){
				temp=nums[start];
				nums[start++]=nums[end];
				nums[end++]=temp;
			}else if(nums[start]==0 && nums[end]==0) {
				end++;
			}else if(nums[start]!=0 && nums[end]==0){
				end++;
				start++;
			}else if(nums[start]!=0 && nums[end]!=0) {
				end++;
				start++;	
			}
		}
		System.out.println(Arrays.toString(nums));
	
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums= {4,2,4,0,0,3,0,5,1,0};
		int length=nums.length;
		int[] expected= {2,1};
		int[] actual=moveZeros(nums,length); 
		Assert.assertArrayEquals(expected, actual);

	}

}
