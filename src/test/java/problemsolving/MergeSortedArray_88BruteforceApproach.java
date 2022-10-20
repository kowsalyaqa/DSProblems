package problemsolving;

import java.util.Arrays;

public class MergeSortedArray_88BruteforceApproach {


	public static int[] mergeSortedArray(int nums1[],int nums2[]) {
		int n=1,m=0,temp=0;
		if((m+n)<=nums1.length){
			for(int i=0;i<nums2.length;i++){
				nums1[m++]=nums2[i];
			}

			for(int i=0;i<nums1.length-1;i++){
				if(nums1[i]>nums1[i+1]){
					temp=nums1[i];
					nums1[i]=nums1[i+1];
					nums1[i+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums1));
		return nums1;

	}

	public static void main(String[] args) {
		int[] nums1={1};
		int[] nums2={};
		int[] expected= {1};
		int[] actual=mergeSortedArray(nums1,nums2);

	}

}
