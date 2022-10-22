package problemsolving;

import org.junit.Assert;
import org.junit.Test;


public class HighestSumOfArrayBruteForceApproach {

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
		2.Initialize x=0, max=output[0] for output array
		3.First Loop using nums array and Condition must be less and equal to nums.length-k
		4.Second Loop using j=i, j<k;j++ - To add k elements and store in sum variable
		5.Once out of second loop add sum to output[x++]=sum ,till iterate first loop complete
		6.Iterate Loop using output array to find Max value with output array length
		7.Assign Max=output[0] before loop, Inside Loop compare output[i]>max,true Assign output[i]=max
		8.Once complete loop, compare the max with expected value and validate using asserts
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */

	public  int highestSum(int[] nums,int k){
		if(nums.length<k) return 0;
		int[] output=new int[nums.length];
		int sum=0,x=0,max=output[0];

		for(int i=0;i<=(nums.length-k);i++){
			sum=0;
			for(int j=i;j<(i+k);j++){
				sum +=nums[j];
			}
			output[x++]=sum;
		}

		for(int i=0;i<output.length;i++){			
			if(output[i]>max){
				max=output[i];
			}
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
