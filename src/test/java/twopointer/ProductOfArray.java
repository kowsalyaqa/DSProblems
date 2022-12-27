package twopointer;

import java.util.Arrays;

public class ProductOfArray {

	public static void main(String[] args) {
		int[] arr= {4,2,3,1};
		int[] outputArray=new int[arr.length];
		int product=1,x=0;
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
		}
		for(int j=0;j<arr.length;j++) {
			outputArray[x++]=product/arr[j];
		}
	}
	
	


}
