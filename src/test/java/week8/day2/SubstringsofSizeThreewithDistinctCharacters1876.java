package week8.day2;

import org.junit.Assert;
import org.junit.Test;

public class SubstringsofSizeThreewithDistinctCharacters1876 {
	@Test
	public void tdp1() {
		String s = "xyzzaz";
		int k = 3;
		int expected = 1;
		int actual = countGoodSubstrings(s);
		Assert.assertEquals(expected, actual);
	}
	
	public int countGoodSubstrings(String s) {
        int pointer=0,count=0,result=0,k=3;
        while(pointer<s.length()-k){
            while(pointer<k){
                if(!String.valueOf(s.charAt(pointer)).equals(String.valueOf(s.charAt(pointer+1)))){
                    count++;
                }
            }
            if(count==k) result++;
            pointer=pointer-k+1;
        }

        return result;
    }
}
