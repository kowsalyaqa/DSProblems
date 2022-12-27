package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfNDoubleExist1346 {

	//@Test
	public void tdp1() {
		int[] arr = { 10, 2, 5, 3 };
		boolean expected = true;
		boolean actual = checkIfExist(arr);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp2() {
		int[] arr = { -2,4};
		boolean expected = false;
		boolean actual = checkIfExist(arr);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[] arr = { -2,0,10,-19,4,6,-8};
		boolean expected = false;
		boolean actual = checkIfExistTwoPointer(arr);
		Assert.assertEquals(expected, actual);
	}

	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == (2 * arr[j]) || (2 * arr[i]) == arr[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean checkIfExistTwoPointer(int[] arr) {
		int left=0,right=arr.length-1;
		while(left<right){
			if(arr[left]==(2*arr[right]) || (2*arr[left])==arr[right]) {
				return true;
			}else {
				left++;
			}
		}
		return false;
	}

}
