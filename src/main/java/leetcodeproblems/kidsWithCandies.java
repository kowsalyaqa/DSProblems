package leetcodeproblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidsWithCandies {
    /**
     *1431. Kids With the Greatest Number of Candies
     *
     * There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
     *
     * Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
     *
     * Note that multiple kids can have the greatest number of candies.
     *
     *
     *
     * Example 1:
     *
     * Input: candies = [2,3,5,1,3], extraCandies = 3
     * Output: [true,true,true,false,true]
     * Explanation: If you give all extraCandies to:
     * - Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
     * - Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     * - Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
     * - Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
     * - Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
     * Example 2:
     *
     * Input: candies = [4,2,1,1,2], extraCandies = 1
     * Output: [true,false,false,false,false]
     * Explanation: There is only 1 extra candy.
     * Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.
     * Example 3:
     *
     * Input: candies = [12,1,12], extraCandies = 10
     * Output: [true,false,true]
     *
     *
     * Constraints:
     *
     * n == candies.length
     * 2 <= n <= 100
     * 1 <= candies[i] <= 100
     * 1 <= extraCandies <= 50
     *
     * 1431. Kids With the Greatest Number of Candies
     *
     * 1.Understand the problem - 10 mins
     *
     * 2.Pseudo Code:
     * ------------
     * 1.Find maximum  in Candies[i]
     * 2.Add candies[i]+extraCandies>=maximun Candies[i]
     * 3.Condition is true, Add true in result[i]
     * 4.return after convert array into list
     *
     * 3.Code:
     * -------
     * class Solution {
     * public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     *   	int original[]=Arrays.copyOf(candies,candies.length);
     * 	Arrays.sort(candies);
     * 	int maximumCandy=candies[candies.length-1];
     * 	boolean result[]=new boolean[original.length];
     * 	int i=0;
     * 	List<Boolean> list=new ArrayList<>();
     * 	for(int eachKidCandies:original){
     * 		int count=0;
     * 		count=eachKidCandies+extraCandies;
     * 		if(count>=maximumCandy){
     * 			result[i]=true;
     * 			list.add(result[i++]);
     *                }else{
     * 			result[i]=false;
     * 			list.add(result[i++]);
     *     }* 	}
     * 	 return list;
     *     }
     * }
     *
     * Time complexity - O(N)
     * Space complexity - Constant
     *
     * Total time to complete - 30 mins
     *
     */

    @Test
    public void testData1(){
        int[] candies={2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> expected= new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);
        expected.add(true);
        List<Boolean> actual= kidsWithCandies(candies,extraCandies);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testData2(){
        int[] candies={4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> expected= new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        List<Boolean> actual= kidsWithCandies(candies,extraCandies);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testData3(){
        int[] candies={12,1,12};
        int extraCandies = 10;
        List<Boolean> expected= new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(true);
        List<Boolean> actual= kidsWithCandies(candies,extraCandies);
        Assert.assertEquals(expected,actual);
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int original[]= Arrays.copyOf(candies,candies.length);
        Arrays.sort(candies);
        int maximumCandy=candies[candies.length-1];
        boolean result[]=new boolean[original.length];
        int i=0;
        List<Boolean> list=new ArrayList<>();
        for(int eachKidCandies:original){
            int count=0;
            count=eachKidCandies+extraCandies;
            if(count>=maximumCandy){
                result[i]=true;
                list.add(result[i++]);
            }else{
                result[i]=false;
                list.add(result[i++]);
            }
        }
        return list;
    }

}
