package practicetwopointer;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParityII922 {
	/*
	 * Given an array of integers nums, half of the integers in nums are odd, and
	 * the other half are even. Sort the array so that whenever nums[i] is odd, i is
	 * odd, and whenever nums[i] is even, i is even. Return any answer array that
	 * satisfies this condition.
	 * 
	 * UQ-11:11:21
	 * 
	 * Test Data: 11:21 - 11:28
	 * 
	 * 1.[0,1] - [0,1]
	 * 2.[1,0] - [0,1] 
	 * 3.[1] - [1] 
	 * 4.[0] - [1] 
	 * 5.[0,2,4,1,3,5] - [0,1,2,3,4,5] 
	 * 6.[1,3] - [1,3] 
	 * 7.[2,4] - [2,4] 
	 * 8.[-1,-2] - [-2,-1] 
	 * 9.[-2,-1] - [-2,-1] 
	 * 10.[] - []
	 * 
	 * Approach - Two-Pointer - Equi Direction TC - O(N) SC - O(1)
	 * PC:Re-write - 14:20 
	 * 1.Declare even=0,odd=1, temp=0 
	 * 2.Iterate using while loop using condition even and odd is less the nums array length
	 * 3.Move the index by 2 places only if the current element is even using while condition 
	 * 4.Move the index by 2 places only if the current element is odd using while condition 
	 * 5.swap the even and odd index values 6.return nums array once loop is over
	 * 
	 * code - 11:33 - 11:38 Debug - 11:39 - 14:15
	 * 
	 * Approach - Brute force TC - O(N*2) SC - O(1)
	 * Brute Force - 14:16 - 14:49
	 * 
	 * PC:Re-write - 14:20 
	 * 1.Declare temp=0
	 * 2.Itertae 2 for loop to swap even and Odd position value is not as expected
	 * 3.if nums[i]%2!=0 && nums[j]==0 ,swap it and increment i and j by 2
	 * 4.return nums from function
	 *  
	 * Approach - Auxiliary arrray TC - O(N) SC - O(1)
	 * 
	 * PC:Re-write - 15:20 - 15:22
	 * 1.Declare temp=0, int[] result=new int[nums.length]
	 * 2.Iterate for loop identify even values and insert in even position in result array
	 * 3.Iterate for loop identify odd values and insert in odd position in result array
	 * 4.return result array
	 * 
	 * code & Debug - 15:23 - 14:15
	 * 
	 * Approach - Two-pointer - inplace solution   TC - O(N) SC - O(1)
	 * PC: 14:15 to 17:10
	 * 1.Declare evenIndex=0,oddIndex=1,temp=0
	 * 2.Using while loop with condition find next wrongly placed item with even index
	 * 3.if current even index is wrongly placed swap odd and even index value, increment odd index
	 * 4.else increment even index
	 * 5.return array value
	 *
	 * Code & Debug - 17:11 - 17:15
	 * 
	 *
	 * 
	 */

	@Test
	public void tdp1() {
		int nums[] = { 3, 1, 2, 4 };
		int expected[] = { 4, 1, 2, 3 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int nums[] = { 0 };
		int expected[] = { 0 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int nums[] = { 1 };
		int expected[] = { 1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp4() {
		int nums[] = { 0, 1 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp5() {
		int nums[] = { 1, 0 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp6() {
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int expected[] = { 2, 1, 4, 3, 6, 5 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp7() {
		int nums[] = { 1, 1 };
		int expected[] = { 1, 1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp8() {
		int nums[] = { 0, 0 };
		int expected[] = { 0, 0 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp9() {
		int nums[] = { -1, 0 };
		int expected[] = { 0, -1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp10() {
		int nums[] = { -1, -2 };
		int expected[] = { -2, -1 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp11() {
		int nums[] = { 4, 2, 5, 7 };
		int expected[] = { 4, 5, 2, 7 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp12() {
		int nums[] = { 2, 3 };
		int expected[] = { 2, 3 };
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp13() {
		int nums[] = {};
		int expected[] = {};
		int actual[] = sortArrayByParityII(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	// Two-pointer equi direction
	private int[] sortArrayByParityII(int[] nums) {
		int evenIndex = 0, oddIndex = 1, temp = 0;
		while (evenIndex < nums.length && oddIndex < nums.length) {
			while (evenIndex < nums.length && nums[evenIndex] % 2 == 0) {
				evenIndex = evenIndex + 2;
			}
			while (oddIndex < nums.length && nums[oddIndex] % 2 != 0) {
				oddIndex = oddIndex + 2;
			}

			if (evenIndex < nums.length && oddIndex < nums.length) {
				temp = nums[evenIndex];
				nums[evenIndex] = nums[oddIndex];
				nums[oddIndex] = temp;
			}
		}
		return nums;
	}

	@Test
	public void tdp14() {
		int nums[] = { 3, 1, 2, 4 };
		int expected[] = { 4, 1, 2, 3 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp15() {
		int nums[] = { 0 };
		int expected[] = { 0 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp16() {
		int nums[] = { 1 };
		int expected[] = { 1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp17() {
		int nums[] = { 0, 1 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp18() {
		int nums[] = { 1, 0 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp19() {
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int expected[] = { 2, 1, 4, 3, 6, 5 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp20() {
		int nums[] = { 1, 1 };
		int expected[] = { 1, 1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp21() {
		int nums[] = { 0, 0 };
		int expected[] = { 0, 0 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp22() {
		int nums[] = { -1, 0 };
		int expected[] = { 0, -1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp23() {
		int nums[] = { -1, -2 };
		int expected[] = { -2, -1 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp24() {
		int nums[] = { 4, 2, 5, 7 };
		int expected[] = { 4, 5, 2, 7 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp25() {
		int nums[] = { 2, 3 };
		int expected[] = { 2, 3 };
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp26() {
		int nums[] = {};
		int expected[] = {};
		int actual[] = sortArrayByParityIIBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	// Brute force Approach
	private int[] sortArrayByParityIIBF(int[] nums) {
		int temp = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			for (int j = 1; j < nums.length; j = j + 2) {
				if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}

	@Test
	public void tdp27() {
		int nums[] = { 3, 1, 2, 4 };
		int expected[] = { 2, 3, 4, 1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp28() {
		int nums[] = { 0 };
		int expected[] = { 0 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	//Invalid Data
	//@Test
	public void tdp29() {
		int nums[] = { 1 };
		int expected[] = { 1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp30() {
		int nums[] = { 0, 1 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp31() {
		int nums[] = { 1, 0 };
		int expected[] = { 0, 1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp32() {
		int nums[] = { 1, 2, 3, 4, 5, 6 };
		int expected[] = { 2, 1, 4, 3, 6, 5 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	//Invalid data
	//@Test
	public void tdp33() {
		int nums[] = { 1, 1 };
		int expected[] = { 1, 1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	//Invalid Data
	//@Test
	public void tdp34() {
		int nums[] = { 0, 0 };
		int expected[] = { 0, 0 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp35() {
		int nums[] = { -1, 0 };
		int expected[] = { 0, -1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp36() {
		int nums[] = { -1, -2 };
		int expected[] = { -2, -1 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp37() {
		int nums[] = { 4, 2, 5, 7 };
		int expected[] = { 4, 5, 2, 7 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp38() {
		int nums[] = { 2, 3 };
		int expected[] = { 2, 3 };
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp39() {
		int nums[] = {};
		int expected[] = {};
		int actual[] = sortArrayByParityIIExternalArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	// External Array Solution
	private int[] sortArrayByParityIIExternalArray(int[] nums) {
		if(nums.length==1) return nums;
		int evenIndex=0,oddIndex=1;
		int result[]=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				result[evenIndex]=nums[i];
				evenIndex=evenIndex+2;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				result[oddIndex]=nums[i];
				oddIndex=oddIndex+2;
			}
		}
		return result;
	}

	
	@Test
	public void tdp40() {
		int nums[] = { 4, 2, 5, 7 };
		int expected[] = { 4, 5, 2, 7 };
		int actual[] = sortArrayByParityIIInPlaceArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
		// Two-pointer - inplace solution  
		private int[] sortArrayByParityIIInPlaceArray(int[] nums) {
			int evenIndex=0,oddIndex=1,temp=0;
			while(evenIndex<nums.length && oddIndex<nums.length) {
				if(nums[evenIndex]%2!=0) {
					temp=nums[evenIndex];
					nums[evenIndex]=nums[oddIndex];
					nums[oddIndex]=temp;
					oddIndex=oddIndex+2;
				}else {
					evenIndex=evenIndex+2;
				}
			}
			return nums;
		}
}

