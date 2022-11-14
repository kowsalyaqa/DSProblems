package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UncommonWordsfromTwoSentences884 {
	@Test
	public void tdp1() {
		String s1= "apple apple";
		String s2= "banana";
		String[] expected={"banana"};
		String[] actual=uncommonFromSentences(s1,s2);
		Assert.assertArrayEquals(expected,actual);
	}
	
	@Test
	public void tdp2() {
		String s1= "this apple is sweet";
		String s2= "this apple is sour";
		String[] expected={"sweet","sour"};
		String[] actual=uncommonFromSentences(s1,s2);
		Assert.assertArrayEquals(expected,actual);
	}

	public String[] uncommonFromSentences(String s1, String s2) {
		Map<String,Integer> map=new HashMap<>();
        List<String> list=new ArrayList<>();
        String[] s3=s1.split(" ");
        String[] s4=s2.split(" ");
       for(int i=0;i<s3.length;i++) map.put(s3[i],map.getOrDefault(s3[i],0)+1);
        for(int j=0;j<s4.length;j++) map.put(s4[j],map.getOrDefault(s4[j],0)+1);   
       for(String s:map.keySet()){
           if(map.get(s)==1){
               list.add(s);
           }
       }
       
       return list.toArray(new String[list.size()]);

	}
}
