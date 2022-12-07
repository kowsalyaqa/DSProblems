package ConceptsLearning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayConcept {

	public static void main(String[] args) {
	
	    // Get the Array
      /*  int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To convert the elements as List
        List<int[]> asList = Arrays.asList(intArr);
      //  System.out.println("Integer Array as List: " + Arrays.asList(intArr));
	
        //binary Search
        int binarySearch = Arrays.binarySearch(intArr, 15);
      //  System.out.println(binarySearch);
	
        String[] s=new String[] {"zza","zbz"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        
        Arrays.sort(s,Collections.reverseOrder());
        System.out.println(Arrays.toString(s));
               
        String s1="abc";
        String s2="efg";
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.codePointAt(1));
        System.out.println(s1.codePointAt(2));
        System.out.println();
        
        
        System.out.println(s2.codePointAt(0));
        System.out.println(s2.codePointAt(1));
        System.out.println(s2.codePointAt(2));
        
        System.out.println(s1.compareTo(s2));
   
        
        Arrays.binarySearch(null, 0)
	}*/
		int A[]= {4,9,5};
		  int B[]= {9,4,9,8,4};

		  ArrayList<Integer> ans=new ArrayList<>();

		  int i = 0, j = 0; // to traverse the arrays

		  while (i < A.length && j < B.length) {
		    if (A[i] < B[j]) { //if current element in i is smaller
		      i++;
		    } else if (B[j] < A[i]) {
		      j++;
		    } else {
		      ans.add(A[i]); //both elements are equal
		      i++;
		      j++;
		    }
		  }
		  System.out.print("The elements are: ");
		  for (i = 0; i < ans.size(); i++) {
		    System.out.print(ans.get(i)+" ");
		  }	
	}

}
