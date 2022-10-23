package problemsolving;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class MinimumRecolors2379SlidingWindowApproach {

	/* 2379. Minimum Recolors to Get K Consecutive Black Blocks
	 * 
	 * 	Question:
	 * 
	 *	1)You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block.
	 *	 The characters 'W' and 'B' denote the colors white and black, respectively.
		2)You are also given an integer k, which is the desired number of consecutive black blocks.
		3)In one operation, you can recolor a white block such that it becomes a black block.
		4)Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks. 
	 *  
	 *  
	 *  Example 1:

		Input: blocks = "WBBWWBBWBW", k = 7
		Output: 3
		Explanation:
		One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
		so that blocks = "BBBBBBBWBW". 
		It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
		Therefore, we return 3.
		
		Example 2:
		
		Input: blocks = "WBWBBBW", k = 2
		Output: 0
		Explanation:
		No changes need to be made, since 2 consecutive black blocks already exist.
		Therefore, we return 0.
		
	 *  
	 *  Pseudo code:
	 *  ==============
	 *  1.Read input string array blocks and consecutive blocks of window k
	 *  2.Initialize MinValue=0, count=0,pointer=0;
	 *  3.First Loop using while for input string length while(pointer<blocks.length())
	 *  4.Second Loop using while for K window size while(pointer<k)
	 *  5.Inside first while loop count=0
	 *  6.Inside Second while loop, find how many white char present in fixed window using indexof(), 
	 *  get char and compare with 'W', if true  increment count
	 *  				if(blocks[pointer].indexOf('W')=='W')
	 *  								count++;
	 *  7.Compare count with min value, if (min<count), min=count
	 *  8.Complete loop, Compare the min value with the expected value using Assert 
	 * 
	 *  */
	
	
	public  int recoloringBlocks(String blocks,int k){
		if(k==1){
			boolean flag=blocks.contains("W");
			if(flag) return 0;
		}
		int count=0,pointer=0,min=0;
		while(pointer<blocks.length()) {
			count=0;
			k=pointer+k;
			while(pointer<k) {
				if(blocks.charAt(pointer++)=='W') {
					count++;
				}	
			}	
			pointer=pointer-k+1;
			
			min=count;
			
			min=Math.min(min, count);
		}
		System.out.println(min);
		return min;
	}
	@Test
	public  void positive() {
		String blocks="WBBWWWWBBWWBBBBWWBBWWBBBWWBBBWWWBWBWW";
		int k=15;
		int expected=6;
		int actual=recoloringBlocks(blocks,k);
		Assert.assertEquals(expected,actual);
	}

}
