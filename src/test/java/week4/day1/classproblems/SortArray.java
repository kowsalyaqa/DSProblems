package week4.day1.classproblems;

import org.junit.Assert;
import org.junit.Test;

public class SortArray {

	@Test
	public void tdp1() {
		int[] arr={1,2,0,1,2};
		int[] expected={0,1,1,2,2};
		int[] actual=new sortArray(arr);
		Assert.assertArrayEquals(expected, actual);
	}
 
}
