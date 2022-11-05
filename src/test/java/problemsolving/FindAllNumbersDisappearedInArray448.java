package problemsolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class FindAllNumbersDisappearedInArray448 {
	
	/*Test Data:
	 * 
	 * Example 1:
		Input: nums = [4,3,2,7,8,2,3,1]
		Output: [5,6]
		
		Example 2:
		Input: nums = [1,1]
		Output: [2]
	 * 
	 * Pseudo Code:
	 * -------------
	 * 1.Read integer array nums 
	 * 2.Declare List<Integer> list=new ArrayList<>();
	 * 3.Declare Set<Integer> set=new HashSet<>(); 
	 * 3.Iterate for loop using nums.length and add nums elements in set
	 * 4.Again Iterate using nums.length,int j=0; add if condition
	 * 5.If(!set.contains(j+1))->if true, add into list
	 * 6.Return list value from function and compare with expected value using Assert
	 * 
	 * Time Complexity - O(n^2)
	 * Space Complexity - O(N)
	 * 
	 */
	
	@Test
	public void tdp1() {
		int[] nums= {4,3,2,7,8,2,3,1};
		List<Integer> expected=new ArrayList<>();
		expected.add(5);
		expected.add(6);
		List<Integer> actual=findDisappearedNumbers(nums);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[] nums= {1,1};
		List<Integer> expected=new ArrayList<>();
		expected.add(2);
		List<Integer> actual=findDisappearedNumbers(nums);
		Assert.assertEquals(expected, actual);
	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
		Set<Integer> set=new HashSet<>();
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		for(int j=0;j<nums.length;j++) {
			if(!set.contains(j+1)) {
			list.add(j+1);
			}
		}
		return list;
	}
}
