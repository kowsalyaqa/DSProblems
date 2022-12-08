package twopointer;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies455 {
	/*
	 * 455. Assign Cookies
	 * 
	Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
	Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

	Example 1:

	Input: g = [1,2,3], s = [1,1]
	Output: 1
	Explanation: You have 3 children and 2 cookies. The greed factors of 3 children are 1, 2, 3. 
	And even though you have 2 cookies, since their size is both 1, you could only make the child whose greed factor is 1 content.
	You need to output 1.
	Example 2:

	Input: g = [1,2], s = [1,2,3]
	Output: 2
	Explanation: You have 2 children and 3 cookies. The greed factors of 2 children are 1, 2. 
	You have 3 cookies and their sizes are big enough to gratify all of the children, 
	You need to output 2.

	Constraints:
	1 <= g.length <= 3 * 104
	0 <= s.length <= 3 * 104
	1 <= g[i], s[j] <= 231 - 1

    UQ - 6:00 to 6:26
	Constraints:
	1 <= g.length <= 3 * 104
	0 <= s.length <= 3 * 104
	1 <= g[i], s[j] <= 231 - 1

	Test Data:
	-----------
	int[] g={1}
	int[] s={1}
	o/p:1

	int[] g={2}
	int[] s={1}
	o/p:1

	int[] g={1,2,3}
	int[] s={1,1}
	o/p:1

	int[] g={1,2}
	int[] s={1,2,3}
	o/p:2

	int[] g={1};
	int[] s={};
	o/p=0

	Approach:
	1)Bruteforce Time Complexity - O(N2), Space Complexity - O(1)
	2)Two pointer Time Complexity - O(N), Space Complexity - O(1)

	Pseudo Code:18:57 - 7:10
	-----------
	1.Sort the given two arrays using Arrays.sort()
	2.Declare left=0,right=0,childCount=0;
	2.Iterate while loop with condition left<g.length && right<s.length
	3.If  g[left] is greater or equals to s[left] increment left and right and increment childCount by 1
	4.else increment left by 1
	5.return childCount

	Code - 7:15 to 7:30
	Run & Debug - 7:45 t0 8:30

	Total Time - 2 hours
	 */

	@Test
	public void tdp1() {
		int[] g = {1};
		int[] s = {1};
		int expected = 1;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int[] g = {2};
		int[] s = {1};
		int expected = 0;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void tdp7() {
		int[] g = {1};
		int[] s = {2};
		int expected = 1;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void tdp3() {
		int[] g = {1,2,3};
		int[] s = {1,1};
		int expected = 1;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void tdp4() {
		int[] g = {1,2};
		int[] s = {1,2,3};
		int expected = 2;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp5() {
		int[] g = {1};
		int[] s = {};
		int expected = 0;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp6() {
		int[] g = {10,9,8,7};
		int[] s = {5,6,7,8};
		int expected = 2;
		int actual = findContentChildren(g,s);
		Assert.assertEquals(expected, actual);
	}
	//Two pointer solution
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int left=0,right=0,count=0;
		while(left<s.length && right<g.length){
			if(s[left]>=g[right]){
				count++;
				right++;
			}
			left++;
		}
		return count;
	}

	//Simple Greedy Solution
	public int findContentChildrenGreedySolution(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int left=0,right=0,count=0;
		while(left<s.length && right<g.length){
			if(s[left]>=g[right]){
				count++;
				right++;
			}
			left++;
		}
		return count;
	}

}
