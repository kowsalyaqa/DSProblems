package slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolors2379 {

	//@Test
	public void tdp1() {
		String blocks="WBBWWBBWBW";
		int k=7;
		int expected=3;
		int actual=minimumRecolorsSW(blocks,k);
		Assert.assertEquals(expected,actual);
	}
	@Test
	public void tdp2() {
		String blocks="WBWBBBW";
		int k=2;
		int expected=0;
		int actual=minimumRecolorsSW(blocks,k);
		Assert.assertEquals(expected,actual);
	}

	public int minimumRecolors(String blocks,int k) {
		int countB=0;
		int maxCountB=0;
		for(int i=0;i<blocks.length();i++) {
			if(blocks.charAt(i)=='B')
				countB++;
			if(i>=k && blocks.charAt(i-k)=='B'){
				countB--;
				maxCountB=Math.max(maxCountB, countB);
			}
		}
		
		return k-maxCountB;
	}
	   public int minimumRecolorsSW(String blocks, int k) {
	       int  pointer =0, count=0, min=Integer.MAX_VALUE;
	     while(pointer<blocks.length()-k-1){
	            k=pointer+k;
	            count=0;
	            while(pointer<k){
	            if(blocks.charAt(pointer)=='W'){
	                count++;     
	            }
	                pointer++;
	            }
	        min= Math.min(min,count);    
	        pointer=pointer-k+1;
	     }
	        
	        return min;

	    }
	
}
