import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MergeIntervals56 {
	/*
	 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
	 * 	Example 1:

		Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
		Output: [[1,6],[8,10],[15,18]]
		Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

		Example 2:
		Input: intervals = [[1,4],[4,5]]
		Output: [[1,5]]
		Explanation: Intervals [1,4] and [4,5] are considered overlapping.

		Constraints:
		1 <= intervals.length <= 104
		intervals[i].length == 2
		0 <= starti <= endi <= 104
	 * 
	 * UQ - 11:15 to 11:38
	 * Approach= 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	@Test
	public void tdp1() {
		int[][] intervals= {{1,3},{2,6},{8,10},{15,18}};
		int[][] expected= {{1,6},{8,10},{15,18}};
		int[][] actual=merge(intervals);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[][] intervals= {{1,4},{0,4}};
		int[][] expected= {{0,4}};
		int[][] actual=merge(intervals);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[][] intervals= {{1,4},{0,0}};
		int[][] expected= {{0,0},{0,4}};
		int[][] actual=merge(intervals);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[][] merge(int[][] intervals) {
		if(intervals.length<=1) return intervals;  
		for (int k = 0; k < intervals.length; k++) {
			for (int i= 0; i < intervals[k].length; i++) {
				for (int j = 0; j < intervals[k].length; j++) {
					if (intervals[k][i] < intervals[k][j]) {
						int temp = intervals[k][i];
						intervals[k][i] = intervals[k][j];
						intervals[k][j] = temp;
					}
				}
			}
		}

		System.out.println(Arrays.deepToString(intervals));
		List<int[]> list = new ArrayList<>();
		int startTime=intervals[0][0];
		int endTime=intervals[0][1];

		for(int i=0;i<intervals.length;i++) {
			if(intervals[i][0]<=endTime) {
				endTime=Math.max(endTime,intervals[i][1]);
				if(startTime>intervals[i][0]) {
					startTime=Math.min(startTime,intervals[i][0]);
				}
			}else {
				list.add(new int[] {startTime,endTime});
				startTime=intervals[i][0];
				endTime=intervals[i][1];
			}
		}
		list.add(new int[] {startTime,endTime});
		return list.toArray(new int[0][0]);
	}
}
