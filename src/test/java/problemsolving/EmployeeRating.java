package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeRating {
	
	@Test
	public void tdp1() {
		int[] workLoad = {2,3,7,8,7,6,3,8,12,11,12,10};
		int N = 12;
		int expected = 5;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[] workLoad = { 2,3,7,8,7,6,3};
		int N = 7;
		int expected = 3;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp3() {
		int[] workLoad = {1};
		int N = 1;
		int expected = 0;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int[] workLoad = {0};
		int N = 1;
		int expected = 0;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp5() {
		int[] workLoad = {6};
		int N = 1;
		int expected = 0;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp6() {
		int[] workLoad = {7};
		int N = 1;
		int expected = 1;
		int actual = solve(N, workLoad);
		Assert.assertEquals(expected, actual);
	}

	private int solve(int N, int[] workLoad) {
		int count = 0,max=0;
		for (int d : workLoad) {
		  if (d > 6) {
		    ++count;
		    max=Math.max(max, count);
		  } else {
		    count = 0;
		  }
		}
		return max;
	}
	
	@Test
	public void tdp7() {
		int[] workLoad = {7};
		int N = 1;
		int expected = 1;
		int actual = solve1(N, workLoad);
		Assert.assertEquals(expected, actual);
	}
	
	private int solve1(int N, int[] workLoad) {
		int count = 0,max=0,left=0,right=0;
		while(right<N) {
			if(left==right) {
				while(workLoad[right]>6) {
					count++;
					right++;
				}
				max=Math.max(max, count);
				left=right;
				right++;
			}
		}
		return max;
	}
}
