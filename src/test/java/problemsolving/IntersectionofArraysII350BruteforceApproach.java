package problemsolving;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionofArraysII350BruteforceApproach {

	/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
	 * 
	 *  Test Data:
	 *  	Positive - nums1[1,2,2,1], nums2=[2,2] ,output: [2,2]
	 *  	Negative - nums1[1,1,1,1], nums2=[3] output: []
			
			int nums1[]= {4,9,5};
			int nums2[]= {9,4,9,8,4};
			int expected[]= {4,9};
	 *  
	 *  Pseudo Code:
	 *  1.Read two integer arrays nums1 and nums2
	 *  2.Sort the two arrays using Array.sort() method
	 *  3.Initialize int variable x=0 for output array increment and k=0 for count non zero value int output arary
	 *  4.Initialize output array with length of first + second Array length
	 *  5.To find Intersection, Compare two arrays
	 *  		a)Iterate first for loop using nums1 array with length of nums1.length
	 *  		b)Iterate Second for loop using using nums2.length 
	 *  		c)using if loop compare first array value with second array
	 *  		d)Matched add the second array value into output array and increment the output array index
	 *  		f)Break the inner loop
	 *  6.To Remove zero using iterate output array, check output array value equals to zero, No increment for K else increment k
	 *  7.Using Arrays.copyOf(output array, K) return final actual array 
	 *  8.return actual array from function
	 *  7.compare the received output array with expected array using Assert
	 *  8.If Matched,no output will print, else assert exception print in console	
	 *  */

	public int[] intersect(int[] nums1, int[] nums2) {
		int output[]=new int[nums2.length+nums1.length];
		int x=0,k=0;
		Set<Integer> set=new LinkedHashSet<>();
		Arrays.sort(nums1);
		for (int i : nums1) {
			set.add(i);
		}
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));

		for(int i:set) {
			for(int j=0;j<nums2.length;j++) {
				if(i==nums2[j]){
					output[x++]=nums2[j];
					break;
				}
			}
		}

		for(int i=0;i<output.length;i++){
			if(output[i]!=0){
				k++;
			}
		}

		int[] copy = Arrays.copyOf(output, k);
		System.out.println(Arrays.toString(copy));
		return copy;
		

	}

	@Test
	public void positive() {
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		int expected[]= {4,9};
		int actual[]=intersect(nums1, nums2);
		Assert.assertArrayEquals(expected, actual);
	}

}
