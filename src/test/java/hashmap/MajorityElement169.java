package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MajorityElement169 {
	/*
	 * Given an array nums of size n, return the majority element.
		
		The majority element is the element that appears more than ⌊n / 2⌋ times.
		You may assume that the majority element always exists in the array.
		
		Example 1:
		Input: nums = [3,2,3]
		Output: 3
		
		Example 2:
		Input: nums = [2,2,1,1,1,2,2]
		Output: 2
		
		Example 3:
		Input: nums = [2,2,2,3,3,3]
		Output: 2
		
		Constraints:
		n == nums.length
		1 <= n <= 5 * 104
		-109 <= nums[i] <= 109
	 * 
	 * UnderstandQuestion - 15 mins
	 * 
	 * Approach- Hash Map
	 * 
	 * Time Complexity - O(N)
	 * Space Complexity - O(N)
	 * 
	 * Pseudo Code: - 5 mins
	 * ------------
	 * 1.Declare Hash Map using data type Integer to store array element as key 
	 * and frequency as value
	 * 2.Find majority Element int frequency = nums.length/2
	 * 2.Iterate for loop using array length and store elements in map
	 * 3.Iterate for loop using array length check array element is in map, if present
	 * 		get map value and compare with frequency, if matched return array element
	 * 
	 * Code - 10 mins
	 * Run & Debug - 5 mins
	 * 
	 * Total Time -  35 mins 
	 */
	
	@Test
	public void tdp1() {
		int[] nums = {3,2,3};
		int expected = 3;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums = {2,2,1,1,1,2,2};
		int  expected = 2;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[] nums = {2,2,2,3,3,3};
		int expected = 0;
		int actual = majorityElement(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp4() {
		int[] nums = {3,2,3};
		int expected = 3;
		int actual = majorityElementArrySorting(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int[] nums = {2,2,1,1,1,2,2};
		int  expected = 2;
		int actual = majorityElementArrySorting(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp6() {
		int[] nums = {2,2,2,3,3,3};
		int expected = 3;
		int actual = majorityElementArrySorting(nums);
		Assert.assertEquals(expected, actual);
	}
	
	 public int majorityElement(int[] nums) {
	        Map<Integer,Integer> map=new HashMap<>();
	        int val=nums.length/2;
	        for(int i=0;i<nums.length;i++){
	            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	        }
	        for(int i=0;i<nums.length;i++){
	            if(map.containsKey(nums[i])){
	                if(map.get(nums[i])>val){
	                    return nums[i];
	                }
	            }
	        }
	            return 0;
	    }
	 
	 //Arrays sorting
	 public int majorityElementArrySorting(int[] nums) {
	      Arrays.sort(nums);
	      return nums[nums.length / 2];
	}
	 //Brute force
	  public int majorityElementBruteForce(int[] nums) {
		    int count=0, val=nums.length/2;
		    for(int i=0;i<nums.length;i++){
		        for(int j=i+1;j<nums.length;j++){
		            if(nums[i]==nums[j]){
		                count++;
		            }
		        }
		        if(count>=val){
		            return nums[i];
		        }
		        count=0;
		    }
		    return count;
		}
	
}
