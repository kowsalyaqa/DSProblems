package codehackthon;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionofTwoArraysII350 {

	@Test
	public void tdp1() {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2,2};
		int[] expected= {2,2};
		int[] actual=intersect(nums1,nums2);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		int[] expected= {4,9};
		int[] actual=intersect(nums1,nums2);
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] intersect(int[] nums1, int[] nums2) {
		int[] result=new int[nums1.length+nums2.length];
		int left=0,right=0,k=0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		while(left<nums1.length && right<nums2.length) {
			if(nums1[left]==nums2[right]) {
				result[k++]=nums1[left];
				left++;
				right++;
			}else if((nums1[left]<nums2[right])){
				left++;
			}else {
				right++;
			}
		}
		System.out.println(Arrays.toString(result));

		return Arrays.copyOf(result, k);
	}
}
