package problemsolving;

import java.util.Arrays;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import junit.framework.Assert;

public class RemoveElement27TwoPointerApproach {

	/* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

		Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

		Return k after placing the final result in the first k slots of nums.

		Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

		Custom Judge:

		The judge will test your solution with the following code:

		int[] nums = [...]; // Input array
		int val = ...; // Value to remove
		int[] expectedNums = [...]; // The expected answer with correct length.
		                            // It is sorted with no values equaling val.

		int k = removeElement(nums, val); // Calls your implementation

		assert k == expectedNums.length;
		sort(nums, 0, k); // Sort the first k elements of nums
		for (int i = 0; i < actualLength; i++) {
		    assert nums[i] == expectedNums[i];
		}
		If all assertions pass, then your solution will be accepted.



		Example 1:

		Input: nums = [3,2,2,3], val = 3
		Output: 2, nums = [2,2,_,_]
		Explanation: Your function should return k = 2, with the first two elements of nums being 2.
		It does not matter what you leave beyond the returned k (hence they are underscores).
		Example 2:

		Input: nums = [0,1,2,2,3,0,4,2], val = 2
		Output: 5, nums = [0,1,4,0,3,_,_,_]
		Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
		Note that the five elements can be returned in any order.
		It does not matter what you leave beyond the returned k (hence they are underscores).
	 * 
	 * 
	 * 
	 * Pseudo Code:
	 * 
	 * Read input array nums, and Val
	 * Initialize start=0,end=nums.length, temp=0
	 * Iterate using for loop and compare with val
	 * 	if matches we have to add right side
	 * 			check value , equal->right++,again have to check 
	 * 
	 *  if(nums[left]==val && nums[right]!=val) ->swap left++, right--
	 *  
	 *  else if(nums[right]==val]->right++
	 *  		[0,1,2,2,3,0,4,2], val = 2  ==>0,1,4,2,3,0,2,2=>10,1,4,0,3,2,2,2
	 *  
	 *  Iterate loop , non duplicates values store in new array and return count
	 *  compare expected count with actual
	 *  
	 *  
	 *  *  */

	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int val=1;
		int num=3;
		int actual=removeElement(nums,val);
		Assert.assertEquals(num, actual);	
	}

	private static int removeElement(int[] nums, int val) { 
		boolean flag=false;
		for(int i:nums) {
			if(i==val) {
				flag=true;
			break;
			}
		}
		
		if(flag) {
			int left=0,right=nums.length-1,temp=0,k=0;
			while(left<right){

				if(nums[left]==val && nums[right]==val) {
					right--;
				}else if(nums[left]!=val && nums[right]==val) {
					left++;
				}else if(nums[left]!=val && nums[right]!=val) {
					left++;
				}

				if(nums[left]==val && nums[right]!=val){
					temp=nums[left];
					nums[left++]=nums[right];
					nums[right--]=temp;
				}
			}

			System.out.println(Arrays.toString(nums));
			int[] expected=new int[nums.length];
			for(int i=0;i<nums.length;i++) {
				if(nums[i]!=val) {
					expected[k++]=nums[i];
				}	
			}
			System.out.println(Arrays.toString(expected)+":"+k);
			return k;
		}else {
			int i=nums.length;
			System.out.println(i);
			return i;
		}
	}

}
