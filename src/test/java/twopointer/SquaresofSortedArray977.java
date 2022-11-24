package twopointer;

public class SquaresofSortedArray977 {
	
	/*Input: nums = [-4,-1,0,3,10]
		Output: [0,1,9,16,100]
		Explanation: After squaring, the array becomes [16,1,0,9,100].
		After sorting, it becomes [0,1,9,16,100].
		
		Understand Problem - 8:15 - 8:18
		Logic Build - 
		
		Pseudo Code: 8:50
		-------------
		1.Declare left=0,right=nums.length-1
		2.Iterate while loop when (left<nums.length)
		3.if left is less than right, square left and right and again compare left and right
			if left square value is less than right squared value, decrement right pointer by 1
			square the right value;
			else swap left and right value,  increment left by 1 and decrement right by 1
			
		4.if left is greater than right, swap left and right , increment left by 1 and decrement right by 1
		5. return the array
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
