package week4.day1.classproblems;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DutchFlagAlgorithm {
	
	public void tdp1() {
		int[] arr= {1,2,0,1,2};
		int[] expected={0,1,1,2,2};
		int[] actual=sortArrayUsingDutchAlogo(arr);
		Assert.assertArrayEquals(expected, actual);
	}
	
	
	public void tdp2() {
		int[] arr= {-1,-2,3,-2};
		int[] expected= {-2,-2,-1,3};
		int[] actual=sortArrayUsingDutchAlogo(arr);
		Assert.assertArrayEquals(expected, actual);
	}
	

	@Test
	public void tdp3() {
		int[] arr= {1,2,3};
		int[] expected= {3,2,1};
		int[] actual=sortArrayDescendingOrderUsingDutchAlogo(arr);
		Assert.assertArrayEquals(expected, actual);
	}

	public int[] sortArrayUsingDutchAlogo(int[] arr) {
		int low=0,middle=0,high=arr.length-1,temp=0;
		while(middle<=high) {
			if(arr[middle]==-2) {
				temp=arr[low];
				arr[low]=arr[middle];
				arr[middle]=temp;
				low++;
				middle++;
			}else if(arr[middle]==-1) {
				middle++;
			}else if(arr[middle]==3) {
				temp=arr[middle];
				arr[middle]=arr[high];
				arr[high]=temp;
				high--;
			}
		}	
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	public int[] sortArrayDescendingOrderUsingDutchAlogo(int[] arr) {
		int low=arr.length-1,middle=arr.length-1,high=0,temp=0;
		while(middle<=low) {
			if(arr[middle]==3) {
				temp=arr[low];
				arr[low]=arr[middle];
				arr[middle]=temp;
				low--;
				middle--;
			}else if(arr[middle]==2) {
				middle++;
			}else if(arr[middle]==1) {
				temp=arr[middle];
				arr[middle]=arr[high];
				arr[high]=temp;
				high--;
			}
		}	
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	public static void main(String[] args) {
		String a="Test";
		System.out.println(a.codePointAt(0));
		System.out.println(a.charAt(0));
	}

}
