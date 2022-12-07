package twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SwapTwoDigitsToGetGreaterNumber {

	@Test
	public void tdp1() {
		int nums=2736;
		int expected=7236;
		int actual=swapTwoDigitsToGetGreaterNumber(nums);
		Assert.assertEquals(expected, actual);
	}

	public int swapTwoDigitsToGetGreaterNumber(int nums){
		int original=nums,left=0,right=1,temp=0;
		List<Integer> list=new ArrayList<>();

		while(nums!=0){
			int reminder=nums%10;
			nums=nums/10;
			list.add(reminder);
		}
		Integer[] numArr=new Integer[list.size()-1];
		int x=0;
		for(int i=list.size()-1;i>=0;i++) {
			numArr[x++]=list.get(i);
		}
		System.out.println(Arrays.toString(numArr));

		while(left<numArr.length && right<numArr.length){
			if(numArr[left]<numArr[right]){
				temp=numArr[left];
				numArr[left]=numArr[right];
				numArr[right]=temp;
				String string = Arrays.toString(numArr);
				int number=Integer.parseInt(string);
				if(number>original){
					return number;
				}
			}else if(numArr[left]>numArr[right]){
				right++;
			}
		}
		
		return nums;
	}
}
