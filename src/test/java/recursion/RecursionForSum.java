package recursion;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RecursionForSum {
	
	@Test
	public void findCombinationOfSum() {
		int arr[]={2,3,5,6,8,10};
		int val=10;
		List<List<Integer>> findCombination = findCombination(arr,val);
		System.out.println(findCombination);
	}

	public List<List<Integer>> findCombination(int[] arr, int val) {
		List<List<Integer>> output = new ArrayList<>();
		helper(arr, val, 0, output, new ArrayList<>(), 0);
		return output;
	}

	private void helper(int[] arr, int val, int sum, List<List<Integer>> output, List<Integer> temp, int start) {
		if (sum >= val) {
			if (sum == val) {
				output.add(new ArrayList<>(temp));
			}
			return;
		}

		for (int i = start; i < arr.length; i++) {
			temp.add(arr[i]);
			helper(arr, val, sum + arr[i], output, temp, i);
			temp.remove(temp.size() - 1);
		}
	}

}
