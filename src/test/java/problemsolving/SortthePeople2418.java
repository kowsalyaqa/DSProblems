package problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortthePeople2418 {

	public static void main(String[] args) {
		
		String[] names = {"Mary","John","Emma"};
		int[] heights = {180,165,170};
		int x=0;
		
		TreeMap<Integer, String> map= new TreeMap<>(Collections.reverseOrder());
		
		for(int i=0;i<names.length;i++) map.put(heights[i], names[i]);
	
		for(String i:map.values()) {
			names[x++]=i;
		}
		
		System.out.println(Arrays.toString(names));
		
			
		}
}
