package recursion;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciSeries {

	@Test
	public void tdp1() {
		int n=5;
		int expected=5;
		int actual=fibonacciseries(n);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		int n=0;
		int expected=0;
		int actual=fibonacciseries(n);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		int n=1;
		int expected=1;
		int actual=fibonacciseries(n);
		Assert.assertEquals(expected, actual);
	}

	public int fibonacciseries(int n){
		if(n==0||n==1)
			return n;
		int fibResult=fibonacciseries(n-1)+fibonacciseries(n-2);
		return fibResult;
	}	
	
	public int fibonacciseries1(int n){
		  int a=0,b=1,c=0;
	        for(int i=1;i<n;i++){
	            c=a+b;
	            a=b;
	            b=c;
	        }
	        return c;
	}	
}
