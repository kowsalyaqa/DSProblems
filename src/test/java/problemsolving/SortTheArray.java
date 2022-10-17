package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortTheArray {

	/* sort unsorted integer array
	 * Input: int[] s={90, 23, 5, 109, 12, 22, 67, 34};
	 * Output:int[] o={5 , 12, 22, 23, 34, 67, 90, 109 };
	 * 
	 * Test Data: Positive , Negative - Duplicate, Empty array, Edge - all elements are same 
	 * 
	 * Read the int put array
	 * iterate the first loop using input length
	 * compare first value with seond Value, 
	 * 	if(firstvalue>secondvalue)
	 * {
	 * Swape using temp variable 
	 * temp=firstvalue
	 * firstvalue=secondvalue;
	 * secondvalue=temp;
	 * }
	 * compare expectec array if same return true else return false
	 * */

	@Test
	public static int[] sort(int[] s) {
		int temp=0;

		if(s.length==0) {
			return new int[0];
		}else {
			for(int i=0;i<s.length;i++){
				for(int j=i+1;j<s.length-1;j++) {
					if(s[i]>s[j]) {
						temp=s[j];  
						s[j]=s[i];
						s[i]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(s));
			return s;
		}
	}
	
	public static void main(String[] args) {
		int[] s={90, 23, 5, 109, 12, 22, 67, 34};
		int[] t={5, 12, 22, 23, 67, 90, 109, 34};
		int o[]=sort(s);
		Assert.assertArrayEquals(t, o);	
		
		int[] s1={0};
		int[] t1={0};
		int o1[]=sort(s1);
		Assert.assertArrayEquals(t1, o1);		
	}

}
