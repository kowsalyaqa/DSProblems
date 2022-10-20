package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionofTwoArraysBruteforceApproach {


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
	 * 
	 * 
	 * Pseudo code:
	 * 
	 * 1.Read two arrays 
	 * 2.Initialize output array
	 * 3.compare two arrays, same value store in new array, if already the value is stored 
	 *	do not store
	 *4.compare expected array with output array
	 * 
	 * 
	 * 
	 * */
	@Test
	public static int[] intersection(int[] nums1, int[] nums2) {
			Set<Integer> set=new LinkedHashSet<>();
			for(int i=0;i<nums1.length;i++) {
				for(int j=0;j<nums2.length;j++) {
					if(nums1[i]==nums2[j]){	
							set.add(nums1[i]);
					}
				}
			}
			int[] actual=new int[set.size()];
			List<Integer> list=new ArrayList<>(set);
			for(int i=0;i<=list.size()-1;i++) {
				actual[i]=list.get(i);
			}
			System.out.println(Arrays.toString(actual));
			return actual;	
	}


	public static void main(String[] args) {
		int[] nums1= {1,2,2,1};
		int[] nums2= {2};
		int[] expected= {2};
		int[] actual=intersection(nums1,nums2);
		Assert.assertArrayEquals(expected, actual);

	}

}
