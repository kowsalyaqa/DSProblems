package practicetwopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity905 {
	/*Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
	  Return any array that satisfies this condition.

	  UQ - 21:12 -21:13

	  Test Data: 21:14 - 21:17
	  -----------
	  1.[0] - [0]
	  2.[1] -[1]
	  3.[0,1] -[0,1]
	  4.[1,0] - [0,1]
	  5.[1,1] - [1,1]
	  6.[0,0] - [0,0]
	  7.[1,2,3,4,5,6] - [6,2,4,3,5,1]
	  8.[] -[]
	  9.[-1,0] - [0,-1]
	  10.[-1,-2] - [-2,-1]
	 * 
	 * Approach - Two-Pointer
	 * TC - O(N)
	 * SC - O(1)
	 * 
	 * Approach - Brute force
	 * TC - O(N*2)
	 * SC - O(1)
	 * 
	 * PC:21:19 - 21:25
	 * --------------
	 * 1.Declare leftPtr=0,rightPtr=nums.length-1, temp=0
	 * 2.Iterate while loop with condition left is less than right pointer
	 * 3.If nums[leftPtr] reminder is equal zero and nums[rightPtr] reminder is not equals to zero
	 *   swap two poniters and leftPtr increment by 1 and decrement rightPtr by 1
	 * 4.else If nums[leftPtr] reminder is equal zero and nums[rightPtr] reminder is equals to zero
	 *   decrement rightPtr by 1
	 * 5.else If nums[leftPtr] reminder is equal and nums[rightPtr] reminder is equals to zero
	 *   increment leftPtr by 1
	 * 6.Once complete loop return nums array from method
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		int nums[]= {3,1,2,4};
		int expected[]= {4,2,1,3};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int nums[]= {0};
		int expected[]= {0};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int nums[]= {1};
		int expected[]= {1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int nums[]= {0,1};
		int expected[]= {0,1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int nums[]= {1,0};
		int expected[]= {0,1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp6() {
		int nums[]= {1,2,3,4,5,6};
		int expected[]= {6,2,4,3,5,1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp7() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp8() {
		int nums[]= {0,0};
		int expected[]= {0,0};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp9() {
		int nums[]= {-1,0};
		int expected[]= {0,-1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp10() {
		int nums[]= {-1,-2};
		int expected[]= {-2,-1};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp11() {
		int nums[]= {};
		int expected[]= {};
		int actual[]=sortArrayByParity(nums);
		Assert.assertArrayEquals(expected, actual);
	}


	@Test
	public void tdp12() {
		int nums[]= {3,1,2,4};
		int expected[]= {2,4,3,1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp13() {
		int nums[]= {0};
		int expected[]= {0};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp14() {
		int nums[]= {1};
		int expected[]= {1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp15() {
		int nums[]= {0,1};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp16() {
		int nums[]= {1,0};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp17() {
		int nums[]= {1,2,3,4,5,6};
		int expected[]= {2,4,6,1,5,3};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp18() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp19() {
		int nums[]= {0,0};
		int expected[]= {0,0};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp20() {
		int nums[]= {-1,0};
		int expected[]= {0,-1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp21() {
		int nums[]= {-1,-2};
		int expected[]= {-2,-1};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp22() {
		int nums[]= {};
		int expected[]= {};
		int actual[]=sortArrayByParityBF(nums);
		Assert.assertArrayEquals(expected, actual);
	}



	@Test
	public void tdp23() {
		int nums[]= {3,1,2,4};
		int expected[]= {2,4,3,1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp24() {
		int nums[]= {0};
		int expected[]= {0};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp25() {
		int nums[]= {1};
		int expected[]= {1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp26() {
		int nums[]= {0,1};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp27() {
		int nums[]= {1,0};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp28() {
		int nums[]= {1,2,3,4,5,6};
		int expected[]= {2,4,6,1,3,5};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp29() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp30() {
		int nums[]= {0,0};
		int expected[]= {0,0};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp31() {
		int nums[]= {-1,0};
		int expected[]= {0,-1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp32() {
		int nums[]= {-1,-2};
		int expected[]= {-2,-1};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp33() {
		int nums[]= {};
		int expected[]= {};
		int actual[]=sortArrayByParityArrayAuxiliaryArray(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp34() {
		int nums[]= {3,1,2,4};
		int expected[]= {2,4,3,1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp35() {
		int nums[]= {0};
		int expected[]= {0};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp36() {
		int nums[]= {1};
		int expected[]= {1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp37() {
		int nums[]= {0,1};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp38() {
		int nums[]= {1,0};
		int expected[]= {0,1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp39() {
		int nums[]= {1,2,3,4,5,6};
		int expected[]= {2,4,6,1,5,3};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp40() {
		int nums[]= {1,1};
		int expected[]= {1,1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp41() {
		int nums[]= {0,0};
		int expected[]= {0,0};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp42() {
		int nums[]= {-1,0};
		int expected[]= {0,-1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp43() {
		int nums[]= {-1,-2};
		int expected[]= {-2,-1};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp44() {
		int nums[]= {};
		int expected[]= {};
		int actual[]=sortArrayByParityArrayInPlace(nums);
		Assert.assertArrayEquals(expected, actual);
	}

	//Two-pointer - Opposite Direction
	private int[] sortArrayByParity(int[] nums) {
		int leftPtr=0,rightPtr=nums.length-1,temp=0;
		while(leftPtr<rightPtr) {
			if(nums[leftPtr]%2!=0 &&  nums[rightPtr]%2==0) {
				temp=nums[leftPtr];
				nums[leftPtr++]=nums[rightPtr];
				nums[rightPtr--]=temp;
			}else if(nums[leftPtr]%2!=0 &&  nums[rightPtr]%2!=0){
				rightPtr--;
			}else {
				leftPtr++;
			}
		}
		return nums;
	}

	//Brute force
	private int[] sortArrayByParityBF(int[] nums) {
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]%2!=0 & nums[j]%2==0) {
					temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		return nums;
	}

	//Two-pointer - Array in-place Solution
	private int[] sortArrayByParityArrayInPlace(int[] nums) {
		int i=0,j=0,temp=0;
		while(j<nums.length) {
			if(nums[j]%2==0) {
				temp=nums[i];
				nums[i++]=nums[j];
				nums[j]=temp;
			}
			j++;
		}
		return nums;
	}

	//Create an auxiliary array and copy even and then odd numbers into it.
	private int[] sortArrayByParityArrayAuxiliaryArray(int[] nums) {
		int result[]=new int[nums.length];
		int x=0;
		//Even Number
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				result[x++]=nums[i];
			}
		}

		//Odd Number
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2!=0) {
				result[x++]=nums[i];
			}
		}
		return result;
	}
}
