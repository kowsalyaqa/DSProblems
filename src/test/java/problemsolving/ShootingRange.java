package problemsolving;

import java.util.ArrayDeque;

public class ShootingRange {

	public static void main(String[] args) {
		  	long n=1000000;
	        ArrayDeque<Integer> queue = new ArrayDeque<>();
	        for(int i=1;i<=n;i++)queue.add(i);

	        int  count=0;
	        long sum=0;
	        while(queue.size()>1){
	            if(count%2==0) {
	                int x=queue.poll();
	                if(x>queue.peek())count=-1;
	                sum+=x;
	            }
	            else {
	                int x=queue.poll();
	                if(x>queue.peek())count=-1;
	                queue.addLast(x);
	            }
	            count++;
	        }
	        System.out.println(sum);
	}
}
