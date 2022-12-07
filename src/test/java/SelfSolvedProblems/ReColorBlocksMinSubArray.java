package SelfSolvedProblems;

public class ReColorBlocksMinSubArray {

	public static void main(String[] args) {
		String blocks="WBBWWBBWBW";
		int k=7,count=0,min=Integer.MAX_VALUE;
        for(int i=0;i<=blocks.length()-k;i++){
            count=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W') {
                    count++;
                    System.out.println(blocks.charAt(j));
                }
            }
            min=Math.min(min,count);
        }
      System.out.println(min);
	}

}
