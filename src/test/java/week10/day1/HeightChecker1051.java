package week10.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HeightChecker1051 {
	/*
	 * Input: heights = [1,1,4,2,1,3]
		Output: 3
		Explanation: 
		heights:  [1,1,4,2,1,3]
		expected: [1,1,1,2,3,4]
		Indices 2, 4, and 5 do not match.
	 * 
	 * Example 2:

		Input: heights = [5,1,2,3,4]
		Output: 5
		Explanation:
		heights:  [5,1,2,3,4]
		expected: [1,2,3,4,5]
		All indices do not match.

		Input: heights = [1,2,3,4,5]
		Output: 0
		Explanation:
		heights:  [1,2,3,4,5]
		expected: [1,2,3,4,5]
		All indices match.
	 * 
	 *  PC:
	 * -----
	 * 1.Sort array and store in another array
	 * 2.Compare both array and when value is not matched count increment by 1
	 * 3.Return count once loop complete
	 * 
	 * 
	 * TC- O(N2)
	 * SC -O(1)
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void tdp1() {
		int[] nums= {1,1,4,2,1,3};
		int expected= 3;
		int actual=heightChecker(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums= {5,1,2,3,4};
		int expected= 5;
		int actual=heightChecker(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[] nums= {1,2,3,4,5};
		int expected= 0;
		int actual=heightChecker(nums);
		Assert.assertEquals(expected, actual);
	}
	public int heightChecker(int[]nums) {
		int[] newSortArray = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			newSortArray[i] = nums[i];
		}
		Arrays.sort(newSortArray);
		int count = 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=newSortArray[i]){
				count++;
			}
		}

		return count;
	}
}
