package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class maxtargetValueArray {

	@Test
	public void tdp1() {
		int[] input = { 1, 2, 3, 4, 5 };
		int target = 7;
		int[] expected = { 3, 4 };
		int[] actual = maxtargetInArray(input, target);
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] maxtargetInArray(int[] input, int target) {
		int left = 0, right = 1, sum = 0;
		while (left < right) {
			sum = input[left] + input[right];
			if (sum == target)
				return new int[] { input[left], input[right] };
			else {
				left++;
				right++;
			}
		}
		return new int[] {};
	}

}
