package problemsolving;

import java.util.Arrays;
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
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] output=new int[nums1.length+nums2.length];
		int x=0,k=0,count=0,count1=0;
		for(int i=0;i<nums1.length;i++) {
			count=count(nums1,nums1[i]);	
			System.out.println("count:"+count);
			for(int j=0;j<nums2.length;j++) {
				count1=count(nums2,nums2[j]);
				System.out.println("count1:"+count1);
				int min=0;
				if(count<count1) {
					min=count;
				}else if(count>count1) {
					min=count1;
				}else if(count==count1){
					min=count;
				}
				System.out.println("Min: "+min);
				if(nums1[i]==nums2[j] && min==1) {
					output[x++]=nums1[i];
					k++;
					System.out.println(Arrays.toString(output));
					break;
				}else if(nums1[i]==nums2[j]) {
					output[x++]=nums1[i];
					k++;
					System.out.println(Arrays.toString(output));
				}
			}
		}


		System.out.println(Arrays.toString(output));
		int[] actual=Arrays.copyOfRange(output,0,k);
		return actual;

	}

	public int count(int[] num, int val) {
		int count=0;
		for (int n2 : num) {
			if(n2==val) {
				count++;
			}
		}
		return count;
	}

	@Test
	public void positive() {
		int nums1[]= {1,2,2,1};
		int nums2[]= {2};
		int expected[]= {2};
		int actual[]=intersect(nums1, nums2);
		Assert.assertArrayEquals(expected, actual);
	}

}
