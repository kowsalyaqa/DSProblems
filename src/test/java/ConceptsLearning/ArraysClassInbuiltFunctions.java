package ConceptsLearning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysClassInbuiltFunctions {

	public static void  a() {
		
	}
	
	public static void main(String[] args) {
		int[] nums= {2,3,1,8,2};
		
		//Arrays - class
		//java.util. package
		//Part of Java collection Framework
		
		//Arrays consists Static Methods
		//public class Arrays extends Object
		
		
		
		
		//1. Arrays.asList()  - returns List, parameter - array reference
		List<int[]> asList = Arrays.asList(nums);
		
		//2.Arrays.binarySearch(nums, 8) - returns index of the key element - o/p - 3
		int binarySearch = Arrays.binarySearch(nums, 8);
		System.out.println(binarySearch);
		
		
	//String compare() - s1==s1->0, s1<s2->-1, s1>s2->1
		String s1="a";
		String s2="a";
		String s3="ab";
		String s4="a";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3)); //s2.length-s3.length =>1-2=-1
		System.out.println(s3.compareTo(s4)); //s3.length-s4.length =>2-1=1
		
		int[] newArray = Arrays.copyOf(nums, nums.length);
		System.out.println(Arrays.toString(newArray));
		
		
		int[] newArray1 = Arrays.copyOf(nums, nums.length-1);
		System.out.println(Arrays.toString(newArray1));
		
		//copyOfRange(originalArray, fromIndex, endIndex) - endIndex(inclusive)
		int[] newArray2 = Arrays.copyOfRange(nums, 1,nums.length);
		System.out.println(Arrays.toString(newArray2));
		
		
		  int intArr[][] = { { 10, 20, 15, 22, 35 } };
		  
		  int intArr1[][] = { { 10, 15, 22 } };
		
		  System.out.println(Arrays.deepEquals(intArr, intArr1));
		  
		  int[] a1= {1,2,3,4,5};
		  int[] a2= {1,2,4,3,5};
		  int[] a3= {5,4,3,2,1};

		  
		  Arrays.sort(a2);
		  
		  System.out.println(Arrays.toString(a2));
		  
		  Arrays.sort(a3,2,a3.length-1);
		  
		  System.out.println(Arrays.toString(a3));
		  
		  int[] a6 ={1,2,3,4,5,6,7,8,9,10};
		  
		  String str = Arrays.toString(a6);
		  System.out.println(str);
		  
		  str=str.replace("[", "");
		  str=str.replace("]", "");
		  
		  StringBuilder sb=new StringBuilder(str);
		  System.out.println(sb.reverse());
		  
		  
		  
		  
		  
		  
		  
		 
		
	}

}
