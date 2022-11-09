package problemsolving;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZero1089 {

	// @Test
	public void tdp1() {
		int[] arr = { 1, 2, 3 };
		int[] expected = { 1, 2, 3 };
		duplicatesZero(arr);
	}

	// @Test
	public void tdp2() {
		int[] arr = { 0 };
		duplicatesZero(arr);
	}

	// @Test
	public void tdp3() {
		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
		duplicatesZero(arr);
	}

	//@Test
	public void tdp4() {
		int[] arr = { 0, 0, 0, 0, 0, 0, 0 };
		duplicatesZero1(arr);
	}

	
	@Test
	public void tdp5() {
		int[] arr = {1,0,2,3,0,4,5,0};
		duplicatesZero1(arr);
	}

	
	public void duplicatesZero(int[] arr) {

		int[] output = new int[arr.length];
		int left = 0, x = 0;
		while (left < arr.length && x < arr.length && arr.length > 1) {
			output[x++] = arr[left];
			if (arr[left] == 0 && x < arr.length) {
				output[x] = arr[left];
				x++;
			}
			left++;
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = output[i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public void duplicatesZero1(int[] arr) {
		int[] output = new int[arr.length];
		int i = 0, j = 0;
		while (i < arr.length && j < arr.length) {
			if (arr[i] != 0) {
				output[j] = arr[i];
				i++;
				j++;
			} else {
				i++;
				j = j + 2;
			}
		}
		for (int k = 0; k < output.length; k++) {
			arr[k] = output[k];
		}

	}

}
