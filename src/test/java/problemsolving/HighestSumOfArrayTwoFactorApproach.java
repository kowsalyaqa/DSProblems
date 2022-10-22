package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class HighestSumOfArrayTwoFactorApproach {

	/* Test Data
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
		2.Initialize sum=0,left=0,right=k-1,max=0;
		3.Loop using i=0,i<=nums.length-k,i++
		4.sum the nums[left]+nums[left+1]+nums[right] and store in sum
		5.increment right position by 1
		6.compare (sum>Max) ->True->Max=sum 
		.Once complete loop, compare the max with expected value and validate using asserts
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public  int highestSum(int[] nums,int k){
		if(nums.length<k) return 0;
		int sum=0,left=0,right=k-1,max=0;

		for(int i=0;i<=(nums.length-k);i++){
			sum +=nums[left]+nums[left=left+1]+nums[right++];
			if(sum>max) {
				max=sum;
			}
			sum=0;
		}

		System.out.println(max);
		return max;
	}
	@Test
	public  void positive() {
		int[] nums={1,5,2,3,7,1};
		int k=3;
		int expected=12;
		int actual=highestSum(nums,k);
		Assert.assertEquals(expected,actual);
	}
}
