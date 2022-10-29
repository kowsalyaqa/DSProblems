package problemsolving;

public class Assessment {

	
	 public int[] twoSum(int[] numbers, int target) {
		    /**1.Pseudo Code - Brute force
		=========================
		1.Read integer input array numbers and target
		2.Iterate using for loop for outerloop with condition i=0;i<numbers.length-1;i++
		3.Iterate using for loop for inner with condition j=1;j <numbers.length;j++
		4.Inside inner loop initialize int sum =numbers[i]+ numbers[j] and compare with target
		5.if target is matched add index of the the i and j element output intger array
		6.once loop is completd return output array and compare with expected int array using assert

		2.Test Data
		===============
		Test Data - Positive
			int[] numbers={2,7,11,15};
			int target=9
			output: 1,2

			int[] numbers={-1,0};
			int target=-1
			output: 1,2

		Test Data - Negative
			int[] numbers={2,8,11,15};
			int target=9
			output:0

			int[] numbers={};
			int target=9
			output:0


		Test Data - Edge
			int[] numbers={1,1,1,1};
			int target=2
			output:1,2

		         */

		   /**  int output[]=new int[numbers.length];
		    int x=0,k=0;
		    if(numbers.length==0) return new int[]{};
		    for(int i=0;i<numbers.length-1;i++){
		        for(int j=i+1;j<numbers.length;j++){
		            int sum=numbers[i]+numbers[j];
		            if(sum==target){
		                k=k+2;
		                output[x++]=i+1;
		                output[x++]=j+1;
		                break;
		            }

		        }

		    }
		    int[] actual=new int[k];
		    for(int i=0;i<k;i++){
		        actual[i]=output[i];
		    }
		 return actual;
		*/



		/**
		Two-pointer approach
		1. Read Input arrat and target,intialize left=0,right-numbers-1;
		2.Iterate While loop with(left<right)
		3.Inside loop int sum=numbers[left]+numbers[right] 
		4.Compare with target, sum== target, rturn index of left and right from function
		5.else increment left and decrement right

		 **/


		int left=0,right=numbers.length-1;
		while(left<right){
		    int sum=numbers[left]+numbers[right];
		    if(sum<target){
		        left++;
		    }else if(sum>target){
		        right--;
		    }else{
		        return new int[]{left+1,right+1};
		    }
		}

		return new int[]{};


		    }
	
	
	
}
