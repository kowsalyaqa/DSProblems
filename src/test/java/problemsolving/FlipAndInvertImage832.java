package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class FlipAndInvertImage832 {

	/* 
	 * Test Data :
			Input: s = "Tesii"
			Output: 2

			Input: s = "abcd"
			Output: 0

			Pseudo Code: 
			============
				1.Read input two-dimensional array integers
				2.Iterate outer loop using for loop with condition i less than array length
				3.Initialize left=0,right=first row length-1,temp=0;
				4.Iterate using while with condition left <right
				5.If(array first value is not equal to array right value) -swap  using temp variable
					temp=arr[i][left]
					arr[i][left]=arr[i][right];
					arr[i][right]=temp
					left++;
					right--;
				6.Once while is over do intersection for the row values using for loop
				   for(int j=0;j<arr[i][arr.length];j++)
				   	if(array value is equal to i)
				   		assign value as zero
				7.Once complete loop return array and compare with expected array


			Time Complexity - O(n2) - only one for loop used
			Space Complexity - constant

			Total - 43 mins
			======================
			1.understand problem- 8 mins
			2.Logic build -  10 mins
			3.Pseudo Code -  15 mins
			4.Script - 5 mins
			5.Run and Debug - 5 mins

	 *
	 * */

	@Test
	public void tdp1(){
		int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
		int expected[][]= {{1,0,0},{0,1,0},{1,1,1}};
		int[][] actual=flipAndInvertImage(image);
		Assert.assertEquals(expected,actual);
	}

	public int[][] flipAndInvertImage(int[][] image){
		for(int i=0;i<image.length;i++) {
			int left=0,right=image[i].length-1,temp=0;
			while(left<right) {
				temp=image[i][left];
				image[i][left]=image[i][right];
				image[i][right]=temp;
				left++;
				right--;
			}
			
			for(int j=0;j<image[i].length;j++) {
				if(image[i][j]==0) {
					image[i][j]=1;
				}else {
					image[i][j]=0;
				}
			}
		}

		return image;
	}



}
