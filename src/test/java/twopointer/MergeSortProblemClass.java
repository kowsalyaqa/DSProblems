package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortProblemClass {
	@Test
	public void tdp1() {
		int[] nums1= {2,4,5,0,0,0};
		int m=3;
		int[] nums2= {1,6,7};
		int n=3;
		int[] expected= {1,2,4,5,6,7};
		int[] actual=mergeSortTwoArray(nums1,m,nums2,n);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp1() {
		int[] nums1= {2,4,5,0,0,0};
		int m=3;
		int[] nums2= {1,6,7};
		int n=3;
		int[] expected= {1,2,4,5,6,7};
		int[] actual=mergeSortTwoArray(nums1,m,nums2,n);
		Assert.assertArrayEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] nums1= {};
		int m=0;
		int[] nums2= {0};
		int n=0;
		int[] expected= {};
		int[] actual=mergeSortTwoArray(nums1,m,nums2,n);
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] mergeSortTwoArray(int[] nums1,int m,int[] nums2,int n){
		int left=m-1,right=n-1,i=nums1.length-1;
		while(right>=0) {
			if(left>=0 && nums1[left]>nums2[right]) {
				nums1[i--]=nums1[left--];
			}else {
				nums1[i--]=nums2[right--];
			}
		}
		System.out.println(Arrays.toString(nums1));
		return nums1;
	}
}
