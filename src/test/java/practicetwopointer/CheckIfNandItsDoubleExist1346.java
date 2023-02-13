package practicetwopointer;

public class CheckIfNandItsDoubleExist1346 {
	/*1346. Check If N and Its Double Exist
	 * 
	 * Given an array arr of integers, check if there exist two indices i and j such that :

		i != j
		0 <= i, j < arr.length
		arr[i] == 2 * arr[j]
		 
		Example 1:
		Input: arr = [10,2,5,3]
		Output: true
		Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
		
		Example 2:
		Input: arr = [3,1,7,11]
		Output: false
		Explanation: There is no i and j that satisfy the conditions.
		 
		Constraints:
		
		2 <= arr.length <= 500
		-103 <= arr[i] <= 103
	 * 
	 * UQ - 16:06 - 16:09
	 * 
	 * Test Data: 16:09 - 16:13
	 * 
	 * 1.arr=[2,-1,1,3] o/p: true 0,2 indices 2=2*1 ==2 0<=0, 2<4 
	 * 
	 * 2.arr[-2,-1,1,3] o/P: true 0,1 indices -2=2*-1=-2 0<=0, 1<4
	 * 
	 * 3.arr[1,3] o/p: false
	 * 
	 * 4.arr[4, -2] o/P:false
	 * 
	 * Approach - Brute force TC- O(N*2) SC - O(1)
	 * 
	 * PC: 16:14 -16:16
	 * ----
	 * 1.Iterate for loop from i=0 and i<arr.length-2 i++
	 * 2.Inner for loop starts form j=i+1, j++
	 * 3.if(i>=0 && j<arr.length && arr[i]==2*arr[j]) return true
	 * 4.return false;
	 * 
	 * Code 
	 * Run & Debug -
	 * 
	 * Approach - Two Pointer TC - O(N) SC - O(1)
	 * PC: 16:16 -16:17
	 * -------------------
	 * 1.Declare left=0, right=1
	 * 2.if arr.length<2 return false
	 * 3.Do Arrays.sort(arr)
	 * 4.Iterate using while loop with condition right<nums.length
	 * 5.if(left==right) && right<arr.length-1 right++
	 * 6.if(nums[left]<0) compare left with 2*right, equal return true;
	 * 7.left>2*right leftt++ , left<2*right right++
	 * 8.
	 * 
	 *
	 * 
	 * 
	 */

}
