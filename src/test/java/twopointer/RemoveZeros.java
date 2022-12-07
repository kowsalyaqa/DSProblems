/**
 * 
 */
package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author kowsalya Karuppusamy
 *
 */
public class RemoveZeros {
	@Test
	public void tdp1() {
		int[] nums= {1,0,0,1,1,1};
		int[] expected= {1,1,1,1,0,0};
		int[] actual=moveZeros(nums);
		Assert.assertArrayEquals(expected, actual);
	}
	
	public int[] moveZeros(int[] nums){
		int left=0,right=nums.length-1,temp=0;
		while(left<right) {
			if(nums[left]==0 && nums[right]!=0) {
				temp=nums[left];
				nums[left++]=nums[right];
				nums[right--]=temp;
			}else if(nums[left]!=0) {
				left++;
			}else {
				right--;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	}

}
