package twopointer;

import org.junit.Assert;
import org.junit.Test;

public class FlippingAnImage832 {
/*
 * 832. Flipping an Image
 * 
 * 	Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
	To flip an image horizontally means that each row of the image is reversed.
	
	For example, flipping [1,1,0] horizontally results in [0,1,1].
	To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
	
	For example, inverting [0,1,1] results in [1,0,0].
	
	Example 1:
	
	Input: image = [[1,1,0],[1,0,1],[0,0,0]]
	Output: [[1,0,0],[0,1,0],[1,1,1]]
	Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
	Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
	Example 2:
	
	Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
	Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
	Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
	Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
	
	Constraints:
	
	n == image.length
	n == image[i].length
	1 <= n <= 20
	images[i][j] is either 0 or 1.
 * 
 * Understand Question - 19:22 - 19:31
 * 
 * PseudoCode - 19:31  - 19:35
 * ---------------------
 * 1.Read image two-dimensional integer array
 * 2.Iterate using for loop with image.length for each row travers
 * 3.Inside for loop add while loop to reverse elements 
 * 4.while(left<right) swap elements 
 * 5.Once complete the row need to invert for the row elements using if else condition
 * 6.Once first loop is over, return array 
 * 
 * Code - 20:00- 20:19
 * 
 * Run & Debug - 20:19 - 20:20
 * 
 * Time Complexity - O(N)
 * Space Complexity - Constant
 * 
 */
	
	@Test
	public void tdp1() {
		int[][]image= {{1,1,0},{1,0,1},{0,0,0}};
		int[][]expected={{1,0,0},{0,1,0},{1,1,1}};
		int[][] actual=flipAndInvertImage(image);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void tdp2() {
		int[][]image= {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
		int[][]expected={{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
		int[][] actual=flipAndInvertImage(image);
		Assert.assertArrayEquals(expected, actual);
	}
	public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++) {
        	int left=0,right=image[i].length-1;
        	while(left<right) {
        		int temp=image[i][left];
        		image[i][left++]=image[i][right];
        		image[i][right--]=temp;
        	}
        	for(int j=0;j<image[i].length;j++) {
        		if(image[i][j]==0) image[i][j]=1;
        		else image[i][j]=0;
        	}
        }
		return image;
    }
}
