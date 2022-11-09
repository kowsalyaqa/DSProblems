package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import org.junit.Test;

public class SortArraybyIncreasingFrequency1636 {


	private static void sortArrayElementsByFrequency(int[] inputArray)
	{
		//Create LinkedHashMap with elements as keys and their occurrences as values
		//Remember LinkedHashMap maintains insertion order of elements

		final Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();

		//Check presence of each element in elementCountMap 

		for (int i = 0; i < inputArray.length; i++) 
		{
			if (elementCountMap.containsKey(inputArray[i]))
			{
				//If element is present in elementCountMap, increment its value by 1

				elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
			}
			else
			{
				//If element is not present, insert this element with 1 as its value

				elementCountMap.put(inputArray[i], 1);
			}
		}

		//Construct an ArrayList holding all Entry objects of elementCountMap

		List<Integer> listOfEntry = new ArrayList<Integer>(elementCountMap.keySet());



		Collections.sort(listOfEntry,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(elementCountMap.get(o1)==elementCountMap.get(o2)) return elementCountMap.get(o1)-elementCountMap.get(o2);
				else return elementCountMap.get(o2)-elementCountMap.get(o1);
			}
		}); 

		int[] outputArray=new int[inputArray.length];
		int x=0;
		System.out.println(listOfEntry);
		for (Integer integer : listOfEntry) {
			int freq=elementCountMap.get(integer);
			while(freq>=1) {
				outputArray[x++]=integer;
				freq--;
			}
			
		}

		System.out.println(Arrays.toString(outputArray));

	}

	public static void main(String[] args) 
	{
		sortArrayElementsByFrequency(new int[] {7, 1, 3, 4, 7, 1, 7, 1, 4, 5, 1, 9, 3});




	}

}
