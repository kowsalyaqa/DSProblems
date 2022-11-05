package problemsolving;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.Test;

public class NumberOfArithmeticTriplets2367 {

	/*Test Data:
	 * 
	 * Input: nums = [0,1,4,6,7,10], diff = 3
	   Output: 2

	   Input: nums = [4,5,6,7,8,9], diff = 2
	   Output: 2
	 * 
	 * Pseudo Code:
	 * ------------
	 * 1. Read the vector nums and diff 
	 * 2. Based on condition need three loop,i<j<k check
	 * 3. First loop int i=0;i<nums.size();i++
	 * 4. Second loop int j=i+1;j<nums.siz();j++
	 * 5. Third loop int k=j+1;k<nums.size();k++
	 * 6. add if condition to check nums[j]-nums[i]==diff && nums[k]-nums[j]==3
	 * 7. Condition satisfied increment count by one
	 * 8. Once Loop is over return count value from function
	 * 9. Compare expected value with actual using Assert
	 * 
	 * Brute force:
	 * 
	 * Time Complexity - O(n^3)
	 * Space Complexity - Constant 
	 * 
	 * Optimized Solution:
	 * Time Complexity - O(n^2)
	 * Space Complexity - O(n)
	 * 
	 */

	@Test
	public void tdp1() {
		Vector<Integer> nums = new Vector<>();  
		nums.add(0);
		nums.add(1);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		nums.add(10);
		int diff=3;
		int expected=2;
		int actual=numberOfUniqueArithmeticTriplets(nums,diff);
	}

	@Test
	public void tdp2() {
		int[] nums= {0,1,4,6,7,10};
		int diff=3;
		int expected=2;
		int actual=arithmeticTriplets(nums,diff);
	}

	@Test
	public void tdp3() {
		int[] nums= {4,5,6,7,8,9};
		int diff=2;
		int expected=2;
		int actual=arithmeticTriplets(nums,diff);
	}

	@Test
	public void tdp4() {
		int[] nums= {4,5,6,7,8,9};
		int diff=2;
		int expected=2;
		int actual=arithmeticTripletsUsingSet(nums,diff);
	}
	public int numberOfUniqueArithmeticTriplets(Vector<Integer> nums,int diff) {
		int count=0;
		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {
				for(int k=j+1;k<nums.size();k++) {
					if(nums.get(j)-nums.get(i)==diff && nums.get(k)-nums.get(k)==diff) {
						count++;
					}
				}
			}
		}
		return count;
	}


	public int arithmeticTriplets(int[] nums, int diff) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff) {
						count++;
					}
				}
			}
		}
		return count; 
	}

	public int arithmeticTripletsUsingSet(int[] nums, int diff) {
		int count=0;
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			set.add(nums[i]);
		}
		System.out.println(set);
		for (int i=0;i<nums.length;i++) {
			if(set.contains(nums[i]+diff) && set.contains(nums[i]+diff*2)) {
				count++;
			}
		}	
		return count; 
	}
}
