package problemsolving;

import java.util.Arrays;

public class ProductOfArrayElements {
	/* Problem - Given integer array, Ignore current index value, remains elements product store in current position and print the array
	 *Examples:
	 * Input: int[] 
	 * 
	 * Test Data: Positive -  s="eat", Negative - s="", Edge
	 * /*Steps:
-------
1. Get the integer array with input elements and Declare output Array to store Product of the elements
	int[] s={1,2,3,4} int[] o=new [s.length]
2.First for loop ->s.length for(int i=0;i<s.length;i++)
3.Initialize integer variable with value 1 int product=1;
4.Second for loop->s.length for(int j=0j<s.length;j++)
5.Add if condition to perform Product of elements expect current iteration position element
	if(i!=j)
		product=product*arr[j];

6.Once Second iteration completed, add final Product Value in out Array for current iterated element position
		o[i]=product;
7.Continue the Next iteration till condition gets Failed
8.return output array and compare with Expected array and Print true*/

	public static int[] getProductOftheArray(int[] s,int length,int[] o){

		for(int i=0;i<length;i++){
			int product=1;
			for(int j=0;j<length;j++){
				if(i!=j) {
					product=product*s[j];
				}
			}
			o[i]=product;
		}
		return o;
	}
	public static void main(String[] args) {
		int[] s={1,2,3,4};
		int[] e={24,12,8,6};
		int[] o=new int[s.length];
		int length=s.length;
		getProductOftheArray(s,length,o);
		for (int i : o) {
			System.out.print(i+" ");
		}
		System.out.println(Arrays.equals(e, o));

	}

}
