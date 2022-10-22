package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class HighestSumOfArraySlidingWindowApproach {
	
	/* 	
	 * Sliding Window keywords ->Consective and Fixed window Size only we can use this alogo
	 * else we can try in brute force approach
	 * 
	 * Test Data
	 *  Positive :
	 *  --------------
	 *  int[] nums={1,5,2,3,7,1};
		int k=3;
		int expected=12;

		int[] nums[1,2,3,4]
		int k=3;
		int expected =9

		Negative:
		----------
		int[] nums={1,1};
		int k=3;
		int expected=0;

		Edge Case:


		Pseudo Code:
		-----------------
		1.Read input Array nums and consecutive number k
		2.Initialize pointer=0, sum=0, max=Integer.Min_Value
		3.Find sums of two elements in first consecutive window
			a)Use while(pointer<k-1) condition
			b)inside Loop do sum for all the elements and increment pointer till condition to go out of loop
				sum=sum+nums[pointer++]
		4.Loop using nums.length to add sum for remains elements in the array
			a)Use while(pointer<nums.length) condition
			b)add last consecutive element value into sum=sum+nums[pointer++]; 
					Compare sum and Max value if(sum>Max)->True->Max=sum
			c)Fixed window size completed, Pointer also incremented, Now need to remove first element(left) of consecutive window
					use formula = (pointer-(fixed window size-1))
			d)Subtract nums[pointer-(k+1))] value from sum to complete next window fram
			e)Increment Pointer by 1
			g)Complete the loop
			h)return max value from function
			
		5.Once complete loop, compare the max with expected value and validate using asserts
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public  int highestSum(int[] nums,int k){
		if(nums.length<k) return 0;
		int sum=0,pointer=0,max=Integer.MIN_VALUE;
		while(pointer<k-1) {
			sum +=nums[pointer++];
		}
		
		while(pointer<nums.length) {
			sum +=nums[pointer];
			if(sum>max) {
				max=sum;
			}
			sum =sum-nums[pointer-k+1];
			pointer++;
		}
		
		System.out.println(max);
		return max;
	}
	@Test
	public  void positive() {
		int[] nums={1,2,3,4};
		int k=3;
		int expected=9;
		int actual=highestSum(nums,k);
		Assert.assertEquals(expected,actual);
	}
}
