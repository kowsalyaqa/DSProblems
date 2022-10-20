package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionofTwoArraysTwoPointerApproach {


	public static int[] intersection(int[] nums1,int[] nums2) {
		int start=0, end=nums1.length-1;
		Set<Integer> set=new HashSet<>();

		while(start<end){

		for(int i=0;i<nums2.length;i++){
		if(nums1[start++]==nums2[i] | nums1[end--]==nums2[i]){
		set.add(nums2[i]);
		}
		}
		}
		List<Integer> list=new ArrayList<Integer>(set);
		int[] actual=new int[list.size()];
		for (int i=0;i<list.size();i++) {
		actual[i]=list.get(i);
		}
		System.out.println(Arrays.toString(actual));
		return nums1;


	}
	public static void main(String[] args) {
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		intersection(nums1,nums2);
	}

}
