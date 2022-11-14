package string.problems;
import org.junit.Assert;
import org.junit.Test;

public class SumOfUniqueElements1748 {

	//@Test
	public void tdp1() {
		int[] nums= {1,2,3,2};
		int expected=4;
		int actual=sumOfUnique(nums);
		Assert.assertEquals(expected,actual);	
	}

	//@Test
	public void tdp2() {
		int[] nums= {1,2,3,2};
		int expected=4;
		int actual=sumOfUnique(nums);
		Assert.assertEquals(expected,actual);	
	}

	@Test
	public void tdp3() {
		int[] nums= {1,2,3,2};
		int expected=4;
		int actual=sumOfUnique(nums);
		Assert.assertEquals(expected,actual);	
	}

	public int sumOfUnique(int[] nums) {
		int[] count=new int[101];
		int res=0;
		for(int n:nums){
			count[n]++;
		}
		for(int i=0;i<101;i++){
			if(count[i]==1){
				res=res+i;
			}
		}
		return res;

	}
}
