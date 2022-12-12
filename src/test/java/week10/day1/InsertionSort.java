package week10.day1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class InsertionSort {
	/* int nums[]={3,6,1,-7} - 12:40
	 * 
	 * PC:
	 * --
	 * 1.First identify pivot value is less than pivot+1 value
	 * 2.if pivot<pivot+1 value, Swap it
	 * 3.Compare adjacent left value from pivot by iteration pivot to 0 index
	 * 4.Increment pivot value and continue the loop
	 * 
	 * 
	 * TC - (O(N3)
	 * SC - O(1)
	 * 
	 * 
	 * 
	 * 
	 */
	@Test
	public void tdp1() {
		int[] nums= {3,6,2,1,-7};
		int[] expected= {-7,1,2,3,6};
		int[] actual=insertSort(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[] insertSort(int[]nums) {
		int temp=0;
		for(int i=0;i<nums.length-1;i++){
			int pivot=i;
			for(int j=i+1;j<nums.length	;j++) {
				if(nums[j]<nums[pivot]){
					pivot=j;
				}
			}
			if(pivot!=i) {
				temp=nums[pivot];
				nums[pivot]=nums[i];
				nums[i]=temp;
			}
			for(int k=pivot;k>-1;k--) {
				temp=nums[pivot];
				nums[pivot]=nums[pivot-1];
				nums[pivot-1]=temp;
				k--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
