package week10.day1;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortOptimalApproach {
	@Test
	public void td1(){
		int[] input = new int[]{5,6,3,1,7,2,4};
		mergeSort(input);
		System.out.println(Arrays.toString(input));
	}
	@Test
	public void td2(){
		int[] input = new int[]{5,6,3,1,7,2,4,0};
		mergeSort(input);
		System.out.println(Arrays.toString(input));
	}

	void mergeSort(int[] input){
		recursive(input, 0, input.length-1);
	}

	/**
	 * 1. find mid
	 * 2. recursive call for start , mid
	 * 3. recursive call for mid+1, end
	 * 4. merge the arrays
	 *
	 *
	 *
	 * 5,6,3,1,7,2,4
	 *
	 *      5,6,3,1
	 *          5,6                              3,1
	 *             5    6
	 */

	void recursive(int[] input, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;

			recursive(input, start, mid); // 5,6,3,1 -> 5,6 -> 5;; 3
			recursive(input, mid + 1, end); // 6;; 3,1 -> 1

			merge(input, start, mid, end); // 5,6;;;3,1;;;
		}
	}


	/**
	 * 5,6   1,3
	 *
	 * i = 5 , j = 3
	 *
	 * tempArrayIndex = 0;
	 * temp[0] = 1
	 * temp[1] = 3
	 *
	 *
	 * 4-7
	 *
	 *
	 **/

	void merge(int[] input, int start, int mid, int end){
		int temp[] = new int[end-start+1];

		int leftArrayIndex = start, rightArrayIndex = mid+1, tempArrayIndex = 0;

		while( leftArrayIndex <= mid && rightArrayIndex <= end){
			if(input[leftArrayIndex] < input[rightArrayIndex])
				temp[tempArrayIndex++] = input[leftArrayIndex++];
			else
				temp[tempArrayIndex++] = input[rightArrayIndex++];
		}

		while(leftArrayIndex <= mid)
			temp[tempArrayIndex++] = input[leftArrayIndex++];

		while(rightArrayIndex <= end)
			temp[tempArrayIndex++] = input[rightArrayIndex++];


		for(int i =start; i<=end;i++){
			input[i] = temp[i-start];
		}
	}
}
