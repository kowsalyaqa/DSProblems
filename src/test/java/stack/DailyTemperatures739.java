package stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class DailyTemperatures739 {
	/*
	 * 739. Daily Temperatures
	 * 
	 * Given an array of integers temperatures represents the daily temperatures,
	 * return an array answer such that answer[i] is the number of days you have to
	 * wait after the ith day to get a warmer temperature. If there is no future day
	 * for which this is possible, keep answer[i] == 0 instead.
	 * 
	 * Example 1: Input: temperatures = [73,74,75,71,69,72,76,73] Output:
	 * [1,1,4,2,1,1,0,0]
	 * 
	 * Example 2: Input: temperatures = [30,40,50,60] Output: [1,1,1,0]
	 * 
	 * Example 3: Input: temperatures = [30,60,90] Output: [1,1,0]
	 * 
	 * Constraints: 1 <= temperatures.length <= 105 30 <= temperatures[i] <= 100
	 * 
	 * UQ - 14:30 - 16:38
	 * 
	 * Pseudo Code: 18:35 - 18:42 ------------------------------------ 1.Declare
	 * input Array with temperatures.length size 2.Declare left=0, right=1 3.Iterate
	 * while loop with left is less tha right 4.inside while loop add if condition
	 * temperatures[left]<temperatures[right] do subtract of
	 * temperatures[right]-temperatures[left],add in output array increment left and
	 * right by 1
	 * 
	 * 5.if condition failed if condition temperatures[left]<temperatures[right]
	 * increment right by 1 and do comparE 6.Suppose no elements matched, add zero
	 * in output array 7.For last element add zero in output array 8. Return output
	 * array
	 * 
	 * Code - 18:43 - 19:00
	 * 
	 * Run&Debug - 19:01 to 19:53
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity -O(N)
	 * 
	 * 
	 */
	//@Test
	public void tdp1() {
		int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int[] expected = { 1, 1, 4, 2, 1, 1, 0, 0 };
		int[] actual = dailyTemperatures(temperatures);
		Assert.assertArrayEquals(expected, actual);
	}

	//@Test
	public void tdp2() {
		int[] temperatures = { 30, 40, 50, 60 };
		int[] expected = { 1, 1, 1, 0 };
		int[] actual = dailyTemperatures(temperatures);
		Assert.assertArrayEquals(expected, actual);
	}

	//@Test
	public void tdp3() {
		int[] temperatures = { 30, 60, 90 };
		int[] expected = { 1, 1, 0 };
		int[] actual = dailyTemperatures(temperatures);
		Assert.assertArrayEquals(expected, actual);
	}

	//@Test
	public void tdp4() {
		int[] temperatures = { 30 };
		int[] expected = { 0 };
		int[] actual = dailyTemperatures(temperatures);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int[] temperatures = { 55,38,53,81,61,93,97,32,43,78 };
		int[] expected = { 3,1,1,2,1,1,0,1,1,0 };
		int[] actual = dailyTemperatures(temperatures);
		Assert.assertArrayEquals(expected, actual);
	}


	public int[] dailyTemperatures(int[] temperatures) {
		  int[] output = new int[temperatures.length];
			int left = 0, right = 1, x = 0, diff = 0;
			while (left < temperatures.length && right < temperatures.length) {
				if (temperatures[left] < temperatures[right]) {
					diff = right - left;
					output[x++] = diff;
					left++;
					if (left == x && right != temperatures.length - 1)
						right = left + 1;
					else
						right++;
				} else
					right++;
			}
			return output;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int[] dailyTemperatures1(int[] temperatures) {

		Stack<Integer> helperStack = new Stack<>();

		int n = temperatures.length;
		int[] result = new int[n];

		for (int idx = n - 1; idx >= 0; idx--) {

			// Popping all indices with a lower or equal
			// temperature than the current index
			while (!helperStack.isEmpty() && temperatures[idx] >= temperatures[helperStack.peek()]) {
				helperStack.pop();
			}

			// If the stack still has elements,
			// then the next warmer temperature exists!
			if (!helperStack.isEmpty()) {
				result[idx] = helperStack.peek() - idx;
			}

			// Inserting current index in the stack
			helperStack.push(idx);
		}

		return result;
	}

	
}


