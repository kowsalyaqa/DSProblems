package assessment;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class CircularPrinterMinsForString {

	@Test
	public void tdp12() {
		String s="BZA";
		int expected=4;
		int actual=timeToMoveGiveStarttoEnd(s);
		Assert.assertEquals(expected, actual);
	}
	public int timeToMoveGiveStarttoEnd(String s){
	int countSecs=0, number=25;
	int[] upperAlphabets=new int[26];//65 to 90
	for(int i=0;i<26;i++) {
		upperAlphabets[i]=number--;
	}
	for(int j=0;j<s.length();j++) {
		char c=s.charAt(j);
		int a=90-c;
		System.out.println(26-a);	
	}
	System.out.println(Arrays.toString(upperAlphabets));
	
	return countSecs;
	}
}

