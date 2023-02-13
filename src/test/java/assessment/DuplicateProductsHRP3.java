package assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class DuplicateProductsHRP3 {
	@Test
	public void tdp1() {
		List<String> name=new ArrayList<>(Arrays.asList( "ball", "box","ball","ball","box"));
		List<Integer> price=new ArrayList<>(Arrays.asList(2,2,2,2,2));
		List<Integer> weight=new ArrayList<>(Arrays.asList(133,2,1,1,1));
		int expected=1;
		int actual=duplicateProducts(name,price,weight);
		Assert.assertEquals(expected, actual);
	}
	public int duplicateProducts(List<String> name,List<Integer> price,List<Integer> weight){
		int count=0;
		String[] strArray=new String[name.size()];
		String s="";
		for(int i=0;i<strArray.length;i++) {
			s=name.get(i)+" "+price.get(i)+" "+weight.get(i);
			strArray[i]=s;
			s="";
		}
		System.out.println(Arrays.toString(strArray));
		Set<String> set=new HashSet<>();
		for (String string : strArray) {
			if(!set.add(string)) count++;
		}
			return count;
	}
}
