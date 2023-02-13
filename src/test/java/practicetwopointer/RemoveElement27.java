package practicetwopointer;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElement27 {

	/*
	 *  Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.
		Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
		Return k after placing the final result in the first k slots of nums.
		Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.
	 * 
	 * UQ-16:43 - 16:49
	 * 
	 * Test Data: 16:49 - 16:54
	 * 1.[1,2,2,3,5,2,7] val -2  :  [1,3,5,7,2,2,2] or [1,7,5,3,2,2,2] o/p:  4
	 * 2.[1,3] - val-2 : [1,2] o/p:0
	 * 3.[2,2] - Val - 2 : [] o/p:0
	 * 4.[] val - 2 : [] o/p:0
	 * 5.[] val - : [] o/p: 0
	 * 7.[3,2,2,3] val-3 : [2,2,3,3] o/p:2
	 * 8.[0,1,2,2,3,0,4,2] val - 2 : [0,1,4,0,3,_,_,_] o/p: 5
	 * 
	 * Approach - Bruteforce - TC - O(N*2) SC-O(1)
	 * Approach - Two pointer - opposite Direction TC - O(N), SC - O(1)
	 * 
	 * Approach - Bruteforce - TC - O(N*2) SC-O(1)
	 * PC: 16:55 - 16:58
	 * -
	 * 1.Declare temp=0,k=0
	 * 2.Iterate 2 for loops using i=1 and j=j+1
	 * 3.Swap if nums[i]==val && nums[j]!=val, increment k by 1
	 * 4.Return k value once loop is complete
	 * 
	 * cod& Debug - 17:49 - 18:00
	 * 
	 * Approach - Two pointer - opposite Direction TC - O(N), SC
	 * PC: 18:00 - 18:26
	 * 1.Declare left=0,right=nums.length-1
	 * 2.Iterate while loop using left<right
	 * 3.If(nums[left]==val && nums[right]!=val) swap and increment left by 1 and decrement right by 1
	 * 4.else if(nums[right]==val) decrement by right--
	 * 5.else left++
	 * 6.Return Right once loop complete
	 * 
	 * Approach - Two pointer - Equi Direction TC - O(N), SC - O(1)
	 * PC:
	 * 1.Declare left =0,right=0
	 * 2.Iterate while loop with left<nums.length
	 * 3.if nums[left]!=val ,if yes, Assign nums[right]=nums[left] increment right and left by 1
	 * 4.else increment left by 1
	 * 5.return right index value from method
	 * 
	 * code - 5mins
	 * Run - 2 mins
	 */
	
	@Test 
	public void tdp1() {
		int nums[]= {1,2,2,3,5,2,7};
		int val=2;
		int expected=4;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp2() {
		int nums[]= {1,3};
		int val=2;
		int expected=2;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp3() {
		int nums[]= {2,2};
		int val=2;
		int expected=0;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp4() {
		int nums[]= {};
		int val=2;
		int expected=0;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp5() {
		int nums[]= {};
		int val=0;
		int expected=0;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp6() {
		int nums[]= {3,2,2,3};
		int val=2;
		int expected=2;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp7() {
		int nums[]= {0,1,2,2,3,0,4,2};
		int val=2;
		int expected=5;
		int actual=removeElement(nums,val);
		Assert.assertEquals(expected, actual);

	}
	
	private int removeElement(int[] nums, int val) {
		int temp=0,k=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==val && nums[j]!=val) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val) k++;
		}
		return k;
	}
	
	@Test 
	public void tdp8() {
		int nums[]= {1,2,2,3,5,2,7};
		int val=2;
		int expected=4;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp9() {
		int nums[]= {1,3};
		int val=2;
		int expected=2;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp10() {
		int nums[]= {2,2};
		int val=2;
		int expected=0;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp11() {
		int nums[]= {};
		int val=2;
		int expected=0;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp12() {
		int nums[]= {};
		int val=0;
		int expected=0;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp13() {
		int nums[]= {3,2,2,3};
		int val=2;
		int expected=2;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp14() {
		int nums[]= {0,1,2,2,3,0,4,2};
		int val=2;
		int expected=5;
		int actual=removeElementTwoPointer(nums,val);
		Assert.assertEquals(expected, actual);

	}
	
	private int removeElementTwoPointer(int[] nums, int val) {
		int left=0,right=nums.length-1,temp=0;
		while(left<right) {
			if(nums[left]==val && nums[right]!=val) {
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}else if(nums[right]==val) {
				right--;
			}else {
				left++;
			}
		}
		int j=0;
		for (int i : nums) if(i!=val) j++;
		return j;
	}
	
	@Test 
	public void tdp15() {
		int nums[]= {1,2,2,3,5,2,7};
		int val=2;
		int expected=4;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp16() {
		int nums[]= {1,3};
		int val=2;
		int expected=2;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp17() {
		int nums[]= {2,2};
		int val=2;
		int expected=0;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp18() {
		int nums[]= {};
		int val=2;
		int expected=0;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp19() {
		int nums[]= {};
		int val=0;
		int expected=0;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp20() {
		int nums[]= {3,2,2,3};
		int val=2;
		int expected=2;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	@Test 
	public void tdp21() {
		int nums[]= {0,1,2,2,3,0,4,2};
		int val=2;
		int expected=5;
		int actual=removeElementTwoPointerEquiDirection(nums,val);
		Assert.assertEquals(expected, actual);

	}
	
	private int removeElementTwoPointerEquiDirection(int[] nums, int val) {
		 int left=0,right=0;
			while(left<nums.length){
				if(nums[left]!=val){
					nums[right++]=nums[left];
				}
				left++;
			}
			return right;
	}
}

