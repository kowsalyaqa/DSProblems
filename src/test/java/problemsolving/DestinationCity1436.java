package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DestinationCity1436 {

	/*
	 * Test Data:
	 * 
	 * Positive: 5 mins 
	 * Example 1: Input: paths =
	 * [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]] Output:
	 * "Sao Paulo"
	 * 
	 * Example 2: Input: paths = [["B","C"],["D","B"],["C","A"]] Output: "A"
	 * 
	 * Edge case: Input: paths = [["A","Z"]] Output: "Z"
	 * 
	 * 
	 * Logic Build - 5 mins
	 * 
	 * Pseudo Code: - 5 mins 
	 * 1. Read input list paths List<List<String>> and
	 * Initialize Map<String,String> map=new HashMap<>(); 2. Iterate using
	 * paths.size() to add List into Map 3. Inside loop map.put(paths.get(i).get(0)
	 * as Key, map.put(paths.get(i).get(1) as value 4. Iterate loop using
	 * paths.size() to check first list value is present as key, 5. if key is not
	 * exist return the key from function 6. compare returned key with expected one
	 * using assert
	 * 
	 * code - 1hour 10 mins
	 *  
	 * Run and Debug - 10 mins
	 * 
	 * Total time - 1 hour 35 mins
	 * 
	 * 
	 * Time Complexity - O(n2)
	 * Sapce complexity - Constant
	 * 
	 *
	 * 
	 */

	@Test
	public void tdp1() {
		String[][] strArr= {{"London","New York"},{"New York","Lima"},{"Lima","Sao Paulo"}};
		List<List<String>> paths=new ArrayList<List<String>>();
	
		for(int i=0;i<strArr.length;i++) {
			List<String> x = new ArrayList<String>();
			for(int j=0;j<strArr[i].length;j++) {
				x.add(strArr[i][j]);
			}
			paths.add(x);
		}
		String actual=destCity( paths);
		String expected="Sao Paulo";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String[][] strArr= {{"B","C"},{"D","B"},{"C","A"}};
		List<List<String>> paths=new ArrayList<List<String>>();
	
		for(int i=0;i<strArr.length;i++) {
			List<String> x = new ArrayList<String>();
			for(int j=0;j<strArr[i].length;j++) {
				x.add(strArr[i][j]);
			}
			paths.add(x);
		}
		String actual=destCity( paths);
		String expected="A";
		Assert.assertEquals(expected, actual);
	}


	@Test
	public void tdn1() {
		String[][] strArr= {{"A","Z"}};
		List<List<String>> paths=new ArrayList<List<String>>();
	
		for(int i=0;i<strArr.length;i++) {
			List<String> x = new ArrayList<String>();
			for(int j=0;j<strArr[i].length;j++) {
				x.add(strArr[i][j]);
			}
			paths.add(x);
		}
		System.out.println(paths);
		String actual=destCity( paths);
		String expected="Z";
		Assert.assertEquals(expected, actual);
	}


	public String destCity(List<List<String>> paths) {
		Map<String, String> map = new HashMap<>();
		for(int i=0; i<paths.size(); i++) {
			String first = paths.get(i).get(0);
			String second = paths.get(i).get(1);
			map.put(first, second);
		}
		for(int i=0; i<paths.size(); i++) {
			String str = paths.get(i).get(1);
			if(!map.containsKey(str)) {
				System.out.println(str);
				return str;
			}
		}
		return null;
	}

}
