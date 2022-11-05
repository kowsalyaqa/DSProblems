package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class RingsAndRods2103 {
	/*Test Data:
	 * 
	 * Example 1:
		String rings="B0B6G0R6R0R6G9";
		int expected=1;
		
		Example 2:
		String rings="G4";
		int expected=0;
	 * 
	 * Pseudo Code:
	 * -------------
	 * 1.Read integer array nums 
	 * 2.Iterate loop using rod count 0 to 9
	 * 3.Inside if condition, check three colorors are the i th postion using contains method, if yes, count++
	 * 4.Once loop complete return count from function and compare with expected value using Assert
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - Constant
	 * 
	 */
	
	@Test
	public void tdp1() {
		String rings="B0B6G0R6R0R6G9";
		int expected=1;
		int actual=countPoints(rings);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String rings="G4";
		int expected=0;
		int actual=countPoints(rings);
		Assert.assertEquals(expected, actual);
	}
	 public int countPoints(String rings) {
		int count=0;
		for(int i=0;i<10;i++) {
			if(rings.contains("R"+String.valueOf(i)) && 
					rings.contains("G"+String.valueOf(i)) && rings.contains("B"+String.valueOf(i))){
				count++;
			}
		}
		return count;
	}	
}
