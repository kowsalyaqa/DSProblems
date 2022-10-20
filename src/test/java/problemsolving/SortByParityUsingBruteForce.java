package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortByParityUsingBruteForce {

	/* Given integer arrays nums, move 	all the even integers at the beginning of the array followed by all odd integers
	 * 
	 *Return any array that satisfies  this condition
	 *
	 *Input: nums = [3,1,2,4]
	 *Output: [2,4,3,1]
	 *Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 *  Example 2:
	 *  Input: nums = [0]
	 *  Output: [0]
	 *  
	 *  Test Data - Positive - [3,1,2,4], negative - Empty Array, Edge - [1,1,1,1]
	 *  
	 *  even,even - 2,1,3,4
	 *  even,odd -  2,1,4,3
	 *  odd, odd - 3,4,2,1
	 *  odd, even - 3,1,2,4
	 *  
	 *  Pseudo Code;
	 * 
	 *  Read input integer array nums, Expected Integer expected
	 *  Initialize int start=0; and end=length-1;and 
	 *  Initialize Output Array with length of Input String
	 *  Iterate for loop using input string length
	 *  Take each element and Identify is even or odd
	 *  If even add in OutputArray[start]=even number, increment start++;
	 *  else odd add in OutputArray[end]=even number, increment end--;
	 *  Compare Expected Array with Actual output Array
	 *  
	 *   {3,1,2,4};//[4,2,1,3], [2, 4, 1, 3]
	 *   {3,1,2,4,6,9};// [2, 4, 6, 9, 1, 3]
	 *   {3,1,2,4,2,6,9,2,1};//[2,4,2,6,9,1,1,3]
	 *  
	 *  Time Complexity - Array Length - 4 | Loop Count - 4
	 *  Time Complexity - Array Length - 6 | Loop Count - 6
	 *  Time Complexity - Array Length - 9 | Loop Count - 9
	 * 	 
	 * Time Complexity - O(n) ,Space Complexity - O(n)
	 *  
	 */
	
	@Test
	public void postiveData1() {
		int[] nums= {1,2,1,2};
		int[] expected= {2,2,1,1};
		int[] actual=SortByParity(nums,nums.length);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void postiveData2() {
		int[] nums= {};
		int[] expected= {0};
		int[] actual=SortByParity(nums,nums.length);
		Assert.assertArrayEquals(expected, actual);
	}
	
	
	private int[] SortByParity(int[] nums,int length){
		if(length==0) 
		return new int[]{0};
		
		int[] output=new int[length];
		int start=0,end=length-1,loop=0;
		for(int i=0;i<length;i++) {
			if(nums[i]%2==0) {
				output[start++]=nums[i];
			}else if(nums[i]%2!=0){
				output[end--]=nums[i];
			}
			loop++;
		}
		System.out.println("Loops:"+loop);
		System.out.println("Actual: "+Arrays.toString(output));
		return output;
	}
	
}
