package hashmap;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ReturnTargetIndicesFromArray {
	
	@Test
	public void tdp1() {
		int[] nums= {2,5,3,7,9,10};
		int target=5;
		int[] expected= {0,2};
		int[] actual=returnTargetIndicesFromArray(nums,target);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums= {0,5};
		int target=5;
		int[] expected= {0,1};
		int[] actual=returnTargetIndicesFromArray(nums,target);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int[] nums= {5};
		int target=5;
		int[] expected= {};
		int[] actual=returnTargetIndicesFromArray(nums,target);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[] returnTargetIndicesFromArray(int[] nums,int target) {
		if(nums.length==1) return new int[] {};
		Map<Integer,Integer> map=new HashMap<>();
		for(int j=0;j<nums.length;j++) {
			map.put(nums[j],j);
		}
		System.out.println(map);
		for(int i=0;i<nums.length;i++) {
			int diff=Math.abs(nums[i]-target);
			if(map.containsKey(diff)) {
				return new int[] {i,map.get(diff)};
			}
		}
		
		return new int[]{};
		
	}

}
