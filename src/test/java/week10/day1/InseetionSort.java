package week10.day1;

import java.util.Arrays;

import org.junit.Test;

public class InseetionSort {
	/**
	 * Pseudocode
	 *
	 * 1. Loop from 0 to length-1 of the array
	 * 2. compare adjacent values, if left is greater than right, swap
	 * 3. then find the apt position in the left sub-array, by swapping until its left is smaller than the current index
	 *
	 *
	 *
	 *
	 *TC - O(N2)
	 *SC -O(1)
	 */
	
	@Test
	public void insertionSort() {
		int[] arr = {-13,6,2,1,3,7,-4, 3};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	void insertionSort(int[] arr) {

		for( int i =0 ;i < arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				swap(arr, i, i+1);
				int pointer = i;
				while(pointer > 0 && arr[pointer] < arr[ pointer-1]) {
					if(arr[pointer] < arr[ pointer-1])
						swap(arr, pointer, pointer-1);
					pointer--;
				}
			}
		}
	}

	void swap(int[] arr, int index1 ,int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}	

}
