package problemsolving;

import java.util.Arrays;

public class MergeSortedArray_88TwoPointerApporoac {

	public static void main(String[] args) {
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		int n=3,m=3,temp=0,left=0,right=1;
		if((m+n)<=nums1.length){
			for(int i=0;i<nums2.length;i++){
				nums1[m++]=nums2[i];
			}
			System.out.println(Arrays.toString(nums1));//1,2,3,2,5,6
		}

	}
}
