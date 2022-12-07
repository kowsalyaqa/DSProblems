package SelfSolvedProblems;

import org.junit.Assert;
import org.junit.Test;


public class IsPairExistBruteForceApproach {
	/*
	 * Question:
	 * 
	 * Given a sorted (in ascending order) integer array nums of n elements and a target value, find if there exists any pair of elements (nums[i], nums[j], i!=j) such that their sum is equal to target
	 * 
	 * Test Data 
	 * ----------
	 * Positive - int[] nums={1,2,3}, target=5 ,true, int[] nums={1,5,8,10,13,16,27,32,45,60} target=40, true
	 * Negative - int[] nums={3,2,3}, target=5, true, int[] nums={1,1} target=3, false
	 * Edge - int[]={}, target=0,target=1 false
	 * 
	 * Pseudo Code:
	 * 
	 * Use for Loops to traverse array to find matched elements
	 * 
	 * 
	 */


	public boolean isPairSumExistInArray(int[] nums,int target){
		if(nums==null || nums.length==0) {
			return false;
		}

		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					return true;
				}

				if(nums[i]>nums[i]) {
					break;
				}
			}
		}
		return false;
	}


	@Test
	public void tdp1(){
		int[] nums= {1,5,8,10,13,16,27,32,45,60};
		int target=40;
		boolean expected=true;
		boolean actual=isPairSumExistInArray(nums,target);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void tdp2(){
		int[] nums= {3,2,3};
		int target=5;
		boolean expected=true;
		boolean actual=isPairSumExistInArray(nums,target);
		Assert.assertEquals(expected,actual);
	}
	

	@Test
	public void tdn1(){
		int[] nums= {1,1};
		int target=3;
		boolean expected=false;
		boolean actual=isPairSumExistInArray(nums,target);
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void tde1(){
		int[] nums= {};
		int target=1;
		boolean expected=false;
		boolean actual=isPairSumExistInArray(nums,target);
		Assert.assertEquals(expected,actual);
	}


}
