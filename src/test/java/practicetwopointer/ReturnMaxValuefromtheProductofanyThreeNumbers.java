package practicetwopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ReturnMaxValuefromtheProductofanyThreeNumbers {
	
	@Test
	public void tdp1() {
		int[] nums= {-1,-10,17,15,16,1,2};
		int expected=4080;
		int actual=returnMaxValuefromtheProductofanyThreeNumbers(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums= {5,1,2,3,4};
		int expected=60;
		int actual=returnMaxValuefromtheProductofanyThreeNumbers(nums);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp3() {
		int[] nums= {-1,-10,2,5,4};
		int expected=50;
		int actual=returnMaxValuefromtheProductofanyThreeNumbers(nums);
		Assert.assertEquals(expected, actual);
	}

	private int returnMaxValuefromtheProductofanyThreeNumbers(int[] nums) {
		int max;
		Arrays.sort(nums);
		int minThreeElementProduct=nums[0]*nums[1]* nums[nums.length-1];
		System.out.println(minThreeElementProduct);
		int maxThreeElementProduct=nums[nums.length-3]*nums[nums.length-2]* nums[nums.length-1];
		System.out.println(maxThreeElementProduct);
		max=Math.max(minThreeElementProduct,maxThreeElementProduct);
		return max;
	}

}
