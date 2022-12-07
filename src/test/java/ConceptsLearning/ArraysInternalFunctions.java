package ConceptsLearning;

import java.util.Arrays;
import java.util.List;

public class ArraysInternalFunctions {

	public static void main(String[] args) {
		// asList();
		//binarySearch();
		//binarySearchUsingIndex();
		//copyOfRangeArray();
		equals();
		deepEquals();
	}

	public static void asList() {
		int intArr[] = { 10, 20, 15, 22, 35 };
		List<int[]> asList = Arrays.asList(intArr);
		System.out.println("Address:" + asList);
		System.out.println("List Size: " + asList.size());
		System.out.println("First List Element Array Length: " + asList.get(0).length);
		System.out.println("First Array Element return from List: " + asList.get(0)[0]);
	}

	public static void binarySearch() {
		// Binary Search Algorithm
		// Arrays must be sorted
		int intArr[] = { 10, 20, 15, 22, 35 };
		int elementPosition = Arrays.binarySearch(intArr, 35);
		System.out.println("Passed Element Position in Array: " + elementPosition);// 4
		int lessFirstElement = Arrays.binarySearch(intArr, 5);
		System.out.println("Passed Element Position in Array: " + lessFirstElement);// -1
		int greaterLastElement = Arrays.binarySearch(intArr, 36);
		System.out.println("Passed Element Position in Array: " + greaterLastElement);// -6
	}

	public static void binarySearchUsingIndex() {
		int intArr[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(intArr);// 10,15,20,22,35
		int intKey = 22;
		// fromIndex - Inclusive, toIndex- exclusive
		int elementPosition = Arrays.binarySearch(intArr, 1, 3, intKey);
		System.out.println("Passed Element Position in Array: " + elementPosition);// 4
		int lessFirstElement = Arrays.binarySearch(intArr, 1, 3, 5);
		System.out.println("Passed Element Position in Array: " + lessFirstElement);// -1
		int greaterLastElement = Arrays.binarySearch(intArr, 1, 3, 23);
		System.out.println("Passed Element Position in Array: " + greaterLastElement);// -6
	}

	public static void copyOfArray() {
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// To print the elements in one line
		System.out.println("Integer Array: " + Arrays.toString(intArr));

		System.out.println("\nNew Arrays by copyOf:\n");

		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intArr, 10)));
	}
	
	public static void copyOfRangeArray() {
		// Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To print the elements in one line
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));
  
        System.out.println("\nNew Arrays by copyOfRange:\n");
  
        // To copy the array into an array of new length
        System.out.println("Integer Array: "
                           + Arrays.toString(
                                 Arrays.copyOfRange(intArr, 1, 3)));
	}
	
	public static void equals() {
	     // Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // Get the second Arrays
        int intArr1[] = { 10, 15, 22 };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.equals(intArr, intArr1));
	}

	public static void deepEquals() {
		  // Get the Arrays
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
  
        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 22 } };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.deepEquals(intArr, intArr1));
	}
}
