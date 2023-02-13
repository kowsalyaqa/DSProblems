package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class GoodCitizen {

	@Test
	public void tdp1() {
		int[] Behaviour = { 3, 1, 4, 5, 2 };
		int N = 5;
		int expected = 3;
		int actual = solve(N, Behaviour);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[] Behaviour = { 3, 1, 4 };
		int N = 3;
		int expected = 2;
		int actual = solve(N, Behaviour);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int[] Behaviour = {1};
		int N = 1;
		int expected = 1;
		int actual = solve(N, Behaviour);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int[] Behaviour = {0};
		int N = 1;
		int expected = 0;
		int actual = solve(N, Behaviour);
		Assert.assertEquals(expected, actual);
	}

	private int solve(int N, int[] Behaviour) {
		int currentValue = 0, previousValue = 0, nextValue = 0, count = 0;

		while (currentValue < N) {
			if(N>1) {
			if (currentValue == 0) {
				if (Behaviour[currentValue] > (previousValue + Behaviour[currentValue + 1]) / 2) {
					count++;
				}
			} else if (currentValue == N - 1) {
				if (Behaviour[currentValue] > (nextValue + Behaviour[currentValue - 1]) / 2) {
					count++;
				}
			}else {
				if (Behaviour[currentValue] > (Behaviour[currentValue+1] + Behaviour[currentValue - 1]) / 2) {
					count++;
				}
			}
			}else {
				if (Behaviour[currentValue] > (previousValue+nextValue) / 2) {
					count++;
				}
			}
			currentValue++;
		}

		return count;
	}

}
