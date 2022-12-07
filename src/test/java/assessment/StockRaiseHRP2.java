package assessment;

import org.junit.Assert;
import org.junit.Test;

public class StockRaiseHRP2 {
	//@Test
	public void tdp1() {
		int[] nums= {7,1,5,3};
		int expected=4;
		int actual=stockMaxPrice(nums);
		Assert.assertEquals(expected, actual);
	}
	
	//@Test
	public void tdp2() {
		int[] nums= {7,6,5,4};
		int expected=0;
		int actual=stockMaxPrice(nums);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp3() {
		int[] nums= {100,200,500,50,700,35};
		int expected=650;
		int actual=stockMaxPrice(nums);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp12() {
		int[] nums= {7,1,5,3};
		int expected=4;
		int actual=stockMaxPrice2(nums);
		Assert.assertEquals(expected, actual);
	}
	
	//@Test
	public void tdp22() {
		int[] nums= {7,6,5,4};
		int expected=0;
		int actual=stockMaxPrice2(nums);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp32() {
		int[] nums= {100,200,500,50,700,35};
		int expected=650;
		int actual=stockMaxPrice2(nums);
		Assert.assertEquals(expected, actual);
	}
	
	
	public int stockMaxPrice(int[] nums){
		int max=0,diff=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					diff=nums[j]-nums[i];
					max=Math.max(max,diff);
				}
			}
		}
		return max;
	}
	
	public int stockMaxPrice2(int[] nums){
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			min=Math.min(min, nums[i]);
			max=Math.max(max,nums[i]-min);
		}
		return max;
	}
}
