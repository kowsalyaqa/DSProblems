package week10.day1;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MaximumUnitsonaTruck1710 {
	@Test
	public void tdp1() {
		int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int truckSize = 10;
		int expected = 91;
		int actual = maximumUnits(boxTypes, truckSize);
		Assert.assertEquals(expected, actual);
	}

	public int maximumUnits(int[][] boxTypes, int truckSize) {
		for (int i = 0; i < boxTypes.length - 1; i++) {
			for (int j = 0; j < boxTypes.length - i - 1; j++){
				if (boxTypes[j][1] < boxTypes[j+1][1]){
					int[] t = boxTypes[j];
					boxTypes[j] = boxTypes[j+1];
					boxTypes[j+1] = t;
				}
			}
		}
		int boxCount = 0;
		int units = 0;
		for (int i = 0; i < boxTypes.length; i++){
			boxCount = boxCount+boxTypes[i][0] * boxTypes[i][1];
			units = units+boxTypes[i][0];
			if (units> truckSize) {
				boxCount = boxCount - (units-truckSize)*boxTypes[i][1];
				break;
			}
		}
		return boxCount;
	}
}
