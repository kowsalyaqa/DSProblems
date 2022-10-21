package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;

public class IntersectionofTwoArraysTwoPointerApproach {

	/* Given two integer arrays nums1 and nums2, return an array of their intersection.
	 * Each element in the result must be unique and you may return the result in any order.
	 * 
	 * Example 1:

		Input: nums1 = [1,2,2,1], nums2 = [2,2]
		Output: [2]
		Example 2:

		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
		Output: [9,4]
		Explanation: [4,9] is also accepted.
		
		[1,2]
		[3]
	 *  output - []
	 * 
	 * Pseudo code:
	 * 
	 * 1.Read two arrays 
	 * 2.Sort the array using Arrays.sort()
	 * 3.Initialize start=0,end =0, check (nums1 and nums2 length is equal to zero)->return empty array
	 * 4.Iterate using While loop(start<nums1.length &&  nums2.length)
	 * 				if(nums1[start]==nums2[end]) {
				set.add(nums1[start]);
				start++;
				end++;	
			}else if(nums1[start]<nums2[end]){
				start++;
			}else {
				end++;
			}
	 * 
	 * 5.store set value to new array 
	 *6
	 *.compare expected array with output array
	 * 
	 * 
	 * 
	 * */

	public static int[] intersection(int[] nums1,int[] nums2) {
		if(nums1.length==0 | nums2.length==0) {
			return new int[0];
		}

		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		
		int start=0, end=0;
		Set<Integer> set=new HashSet<>();
		
		while(start<nums1.length && end<nums2.length){
			
			if(nums1[start]==nums2[end]) {
				set.add(nums1[start]);
				start++;
				end++;	
			}else if(nums1[start]<nums2[end]){
				start++;
			}else {
				end++;
			}
		}
		
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		int[] actual=new int[list.size()];
		for (int i=0;i<list.size();i++) {
			actual[i]=list.get(i);
		}
		System.out.println(Arrays.toString(actual));
		return actual;


	}
	public static void main(String[] args) {
		int nums1[]= {1,2};
		int nums2[]= {3};
		int[] expected= {};
		int[] actual=intersection(nums1,nums2);
		Assert.assertArrayEquals(expected, actual);

	}

}
