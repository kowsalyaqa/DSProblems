package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortedArray {

	//@Test
	public void tdp1() {
		int[] nums1 = {1,4,5,0,0,0};
		int m = 3;
		int[] nums2 = { 2,5,6};
		int n = 3;
		int[] expected = { 1, 2,4,5,6,6};
		int[] actual = mergeSortedArray11(nums1, m, nums2, n);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		int[] nums1 = {1,4,5,6};
		int m = 4;
		int[] nums2 = {2,3,6,7};
		int n = 4;
		int[] expected = { 1,2,3,4,5,6,6,7};
		int[] actual = mergeSortedArray12(nums1, m, nums2, n);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[] mergeSortedArray11(int[] nums1, int m, int[] nums2, int n) {
		  	int i=m-1;
		     int j=n-1;
		     int k=m+n-1;
		     while(i>=0 && j>=0){
		         if(nums1[i]>nums2[j]){
		             nums1[k--]=nums1[i--];
		         }else{
		             nums1[k--]=nums2[j--];
		         }
		     }
		     while(j>=0){
		         nums1[k--]=nums2[j--];
		     }
		     System.out.print(Arrays.toString(nums1));
		return nums1;
	}
	
	public int[] mergeSortedArray12(int[] nums1, int m, int[] nums2, int n) {
		int i=0,j=0,x=0;
		int[] output=new int[nums1.length+nums2.length];
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<nums2[j]) {
				output[x++]=nums1[i++];
			}else {
				output[x++]=nums2[j++];
			}
		}
		while(i<nums1.length) {
			output[x++]=nums1[i++];
		}
		while(j<nums2.length) {
			output[x++]=nums2[j++];
		}
		nums1=Arrays.copyOfRange(output, 0,nums1.length+nums2.length);
		System.out.print(Arrays.toString(nums1));
		return nums1;
}

}
