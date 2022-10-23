package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class MinimumDifferenceBetweenScores1984 {
	/* 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	public int minimumScore(int[] nums,int k){
		if(nums.length<=k) return 0;
		int diff=0,min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]>nums[j]) {
				diff=nums[i]-nums[j];
				}else {
					diff=nums[j]-nums[i];
				}
				min=Math.min(diff,min);
			}
		}
		
		System.out.println(min);
		return min;
	}
	@Test
	public  void positive() {
		int[] nums={87063,61094,44530,21297,95857,93551,9918};
		int k=6;
		int expected=2;
		int actual=minimumScore(nums,k);
		Assert.assertEquals(expected,actual);
	}

}
