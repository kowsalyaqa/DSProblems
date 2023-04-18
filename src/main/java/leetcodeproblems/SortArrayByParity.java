package leetcodeproblems;


import org.junit.Assert;
import org.junit.Test;

public class SortArrayByParity {
    /**
     * 905. Sort Array By Parity
     * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     * Return any array that satisfies this condition.
     *
     *Example 1:
     * Input: nums = [3,1,2,4]
     * Output: [2,4,3,1]
     * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     *
     * Example 2:
     * Input: nums = [0]
     * Output: [0]
     *
     * Constraints:
     * 1 <= nums.length <= 5000
     * 0 <= nums[i] <= 5000
     */

    @Test
    public void testData1(){
        int[] nums={3,2,1,4};
        int[] expected={4,2,1,3};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testData2(){
        int[] nums={0,2,1,4};
        int[] expected={0,2,4,1};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testData3(){
        int[] nums={1,3,5,7};
        int[] expected={1,3,5,7};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testData4(){
        int[] nums={2,4,6,8};
        int[] expected={2,4,6,8};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void testData5(){
        int[] nums={};
        int[] expected={};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void testData6(){
        int[] nums={1};
        int[] expected={1};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
     public void testData7(){
        int[] nums={2};
        int[] expected={2};
        int[] actual= sortArrayByParity(nums);
        Assert.assertArrayEquals(expected,actual);
    }

    private int[] sortArrayByParity(int[] nums) {
        int left=0,right=nums.length-1,temp=0;
        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0 ){
                temp=nums[left];
                nums[left++]=nums[right];
                nums[right--]=temp;
            }else if(nums[left]%2==0 && nums[right]%2==0 ){
                left++;
            }else{
                right--;
            }
        }
        return nums;
    }


    /**
     * Bruteforce approach
     */


    private int[] sortArrayByParityBFA(int[] nums) {
        int left=0,right=nums.length-1,temp=0;
        while(left<right){
            if(nums[left]%2!=0 && nums[right]%2==0 ){
                temp=nums[left];
                nums[left++]=nums[right];
                nums[right--]=temp;
            }else if(nums[left]%2==0 && nums[right]%2==0 ){
                left++;
            }else{
                right--;
            }
        }
        return nums;
    }
}
