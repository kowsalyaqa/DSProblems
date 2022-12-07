package week4.day1.classproblems;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagWithRange {
	
	@Test
	public void tdp3() {
		int[] arr= {5,7,2,9,1,14,12,10,5,3};
		int[] expected= {3,1,2,5,5,9,7,10,14,12};
		int[] actual=dutchFlagWithRange(arr);
		Assert.assertArrayEquals(expected, actual);
	}
	
	
	public int[] dutchFlagWithRange(int[] arr) {
		int low=0,middle=0,high=arr.length-1,temp=0;
		while(middle<=high) {
			if(getCategory(middle).equals("medium")) {
				temp=arr[low];
				arr[low]=arr[middle];
				arr[middle]=temp;
				low++;
				middle++;
			}else if(getCategory(middle).equals("low")) {
				middle++;
			}else if(getCategory(middle).equals("High")) {
				temp=arr[middle];
				arr[middle]=arr[high];
				arr[high]=temp;
				high--;
			}
		}	
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public String getCategory(int n){
		if(n<=3) return "low";
		else if(n>=4 && n<=10) return "medium";
		else if(n>=11 && n<=15) return "High";
		return "";
	}
	

}
