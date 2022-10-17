package problemsolving;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SumOfelements {


	@Test
	public static int[] sum2(int[] n){
		int loop=0;
		int[] o=new int[n.length-2];
		int sum=0;
		for(int i=0;i<n.length-2;i++){
				sum=n[i]+n[i+1]+n[i+2];
				o[i]=sum;
				sum=0;
				loop++;
		}
		System.out.println(loop);
		System.out.println(Arrays.toString(o));
		return o;
	}
	
	@Test
	public static int[] sum3(int[] n){
		int loop=0;
		int[] o=new int[n.length-2];
		int sum=0;
		for(int i=0;i<n.length-2;i++){
				sum=n[i]+n[i+1]+n[i+2];
				o[i]=sum;
				sum=0;
				loop++;
		}
		System.out.println(loop);
		System.out.println(Arrays.toString(o));
		return o;
	}

	@Test
	public static int[] sum1(int[] n){
		int loop=0,loop1=0;
		int[] o=new int[n.length-1];
		int sum=0;
       	for(int i=0;i<n.length-1;i++){ 
       		loop1++;
			for(int j=i+1;j<=(i+1);j++) {
				sum=n[i]+n[j];
				o[i]=sum;
				sum=0;
				loop++;
               }
		}
    	System.out.println(loop1);
       	System.out.println(loop);
       	System.out.println(Arrays.toString(o));
		return o;
     }	
	
	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		int[] o={3,5,7,9};
		int[] t=sum1(n);
		Assert.assertArrayEquals(o,t);

	}

}
