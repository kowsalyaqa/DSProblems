package week4.day2.classproblems;

import java.util.HashSet;
import java.util.Map;

public class FindSumEqualTargetUsingHashMap {
	
	
	/**
	 * 	Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
	 * 
	 * 
	 * 
	 * 
	 * Pseudo Code:
	 * 
	 * 1.Read input array 
	 * 2.input array convert into HashMap using for loop(key - index, value- array index value)
	 * 3.Iterate using for loop by map.entry set
	 * 4.Passing index as key and get value for current and next index
	 * 5.sum both values and compare with target 
	 * 6.If it matches returns index and index+1 value
	 * 7.Compare the output with expected value
	 * 
	 * 
	 */
	
	
	public void tdp1() {
		int[] arr= {3,2,4};
		int target=6;
		int[] actual=findSumEqualTargetUsingHashMap(arr);
	}
	
	public int[] findSumEqualTargetUsingHashMap(int[] arr) {
		
		Map<Integer,Integer> map=new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], i);
		}
		
		return new int[] {};
	}

}
