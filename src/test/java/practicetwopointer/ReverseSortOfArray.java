package practicetwopointer;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Assert;
import org.junit.Test;

public class ReverseSortOfArray {
	/*Reverse sort of Array 14:25 - 14:39
	 * 
	 * Approach - Collections.Revers() TC - ? SC - O(N)
	 * 
	 * Test Data:
	 * 
	 * 1.[5,4,3,2,1] - [5,4,3,2,1]
	 * 2.[1,2,3,4,5] - [5,4,3,2,1]
	 * 3.[1,5,3,4,2] - [5,4,3,2,1]
	 * 4.[1,1] - [1,1]
	 * 5.[] - []
	 * 
	 * PC: 
	 * ----
	 * 1.Declare Integer array with nums array length
	 * 2.Store nums array elements into integer array by convert Integer.valueOf(nums[i])
	 * 3.Use Arrays.sort(nums,Collections.reversOrder) to sort in descending order nums elements
	 * 4.Convert integer array into int array and return nums array from method
	 * 
	 * Code and Debug- 1:51 - 2:09
	 * 
	 * 
	 * 	//Approach - Brute Force TC - O(N*2) SC - O(1)
	 * 
	 * PC:  14:30  -14: 48 
	 * ----
	 * 1.Declare temp=0
	 * 2.Iterate 2 for loop using nums array length , first for loop starts from i=0, second for loop starts from j=1
	 * 3.Swap element if a[i]<a[j]
	 * 4.Complete loop and return nums from method
	 * 
	 * Code and Debug- 1:51 - 2:09
	 * 
	 */

	@Test
	public void tdp11() {
		int nums[]= {5,4,3,2,1};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayCollections(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp12() {
		int nums[]= {1,2,3,4,5};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayCollections(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp13() {
		int nums[]= {1,5,3,4,2};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayCollections(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp14() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]= reverseArrayCollections(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp15() {
		int nums[]= {};
		int expected[]= {};
		int actual[]= reverseArrayCollections(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	//Approach - Collections.Revers()
	private int[] reverseArrayCollections(int[] nums) {
	     Integer[] newArray = new Integer[nums.length];
	     for (int i = 0; i < nums.length; i++) {
	         newArray[i] = Integer.valueOf(nums[i]);
	     }
	    Arrays.sort(newArray,Collections.reverseOrder());
	    System.out.print(Arrays.toString(newArray));
	    for (int i = 0; i < newArray.length; i++) {
	    	nums[i] = newArray[i].intValue();
	    }
	    System.out.println(Arrays.toString(nums));
	    return nums;
	}
	
	@Test
	public void tdp16() {
		int nums[]= {5,4,3,2,1};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp17() {
		int nums[]= {1,2,3,4,5};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp18() {
		int nums[]= {1,5,3,4,2};
		int expected[]= {5,4,3,2,1};
		int actual[]= reverseArrayBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp19() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]= reverseArrayBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp20() {
		int nums[]= {};
		int expected[]= {};
		int actual[]= reverseArrayBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	//Approach - Brute Force TC - O(N*2) SC - O(1)
	private int[] reverseArrayBF(int[] nums) {
	   int temp=0;
	   for(int i=0;i<nums.length;i++) {
		   for(int j=i+1;j<nums.length;j++) {
			   if(nums[i]<nums[j]) {
				   temp=nums[i];
				   nums[i]=nums[j];
				   nums[j]=temp;
			   }
		   }
	   }
	   System.out.println(Arrays.toString(nums));
	    return nums;
	}
}
