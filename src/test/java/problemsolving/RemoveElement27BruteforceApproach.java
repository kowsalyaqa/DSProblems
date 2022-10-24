package problemsolving;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;

public class RemoveElement27BruteforceApproach {
	/* Problem - Given integer array numbers nums,value val remove all occurences of val in nums , order may be changed
	 * 
	 * Examples - Input: nums = [3,2,2,3], val = 3
				  Output: 2, nums = [2,2,_,_]
	 * 
	 * 
	 * Test Data , Positive - [3,2,2,3]  , negative - {2,2,2,2},Val which is not present in integer array, Edge - 
	 *  
	 *  Pseudo Code: Brute Force Approach
	 *  
	 *  1)Read input integer array and Value of occurence to Remove
	 *  2)Iterate the array using loop with input array length for taking each element
	 *  and Second Itearte for first loop element with remaning element
	 *  2.1)Sort the array
	 *  3)compare current index value with target value to remove
	 *  		If matches 
	 *             currentIndex value = NextIndex value;
	 *  4)Compare after completed iteration with expected output Array 
	 *          
	 *        
	 *  
	 *  */

	public static int removeOccurence(int[] nums, int val) {
		int temp=0,k=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
		for(int i:nums) {
			if(i!=val) {
				nums[k]=i;
				k++;
			}	
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(k);
		return k;
	}



	public static void main(String[] args) {
		int[] nums= {3,2,2,3};
		int val=3;
		int expected=2;
		int actual=removeOccurence(nums,val);
		Assert.assertEquals(expected, actual);

	}


}
