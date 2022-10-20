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
	
	@Test
	public static int[] moveZeros(int[] nums,int length) {
		int[] output=new int[length];
		int start=0, end=length-1;
		for(int i=0;i<length;i++) {
			if(nums[i]!=0) {
				output[start++]=nums[i];
			}else if(nums[i]==0) {
				output[end--]=nums[i];
			}
		}
		System.out.println(Arrays.toString(output));
		return output;
	}
	
	
	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		int length=nums.length;
		int[] expected= {1,3,12,0,0};
		int[] actual=moveZeros(nums,length); 
		Assert.assertArrayEquals(expected, actual);

	}

}
