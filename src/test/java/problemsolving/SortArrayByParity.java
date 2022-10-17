package problemsolving;

import java.util.Arrays;

public class SortArrayByParity {
	/*
	 * Given an integer array nums, move all the even integers at the beginning of
	 * the array followed by all the odd integers. Return any array that satisfies
	 * this condition. 
	 * 
	 * Example 1:
	 * Input: nums = [3,1,2,4] Output: [2,4,3,1] Explanation: The outputs [4,2,3,1],
	 * [2,4,1,3], and [4,2,1,3] would also be accepted. 
	 * 
	 * Example 2:
	 * Input: nums = [0] Output: [0]
	 * 
	 * Read the input arrays
	 * Initiazlize start and end position with array starting index and end length
	 * Iterate for loop using input array length
	 * check array element is even or odd
	 * if even 
	 * 		Store the value in start index and increment the start index
	 * if Odd
	 * 		Store the value in end index and increment the end index
	 * 
	 * return the array and compare with output array
	 */

	public static void sortByParity(int n[],int l,int[] o) {
		int start=0,end=l-1;
		int[] t=new int[l];
		for(int i=0;i<l;i++) {
			if(n[i]%2==0) {
				t[start++]=n[i];
			}else {
				if(n[i]%2!=0) {
					t[end--]=n[i];	
				}
			}
		}
		System.out.println(Arrays.toString(t));	
		int temp=0;
		for(int i=0;i<t.length-1;i++) {
			for(int j=i+1;j<t.length-1;j++) {
				if(t[i]>t[j]) {
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
			}
		System.out.println(Arrays.toString(t));

		int s=0,e=t.length-1,temp1=0;
		
		for(int i=0;i<e;i++) {
			if(s<e) {
			temp=t[s];
			t[s++]=t[e];
			t[e--]=temp;
			}
			
		}
		
		System.out.println(Arrays.toString(t));
		

	}	
	public static void main(String[] args) {

		int[] n= {3,1,2,4,5};
		int length=n.length;
		int[] o= {2,4,1,3};
		sortByParity(n,length,o);



	}

}
