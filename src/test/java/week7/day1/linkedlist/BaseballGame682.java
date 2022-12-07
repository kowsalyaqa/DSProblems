package week7.day1.linkedlist;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class BaseballGame682 {

	@Test
	public void tdp1() {
		String[] ops={"5","2","C","D","+"};
		int expected=30;
		int actual=calPoints(ops);
		Assert.assertEquals(expected, actual);
	}

	public int calPoints(String[] operations) {
		Stack<Integer> stack=new Stack<>();
		for(String c:operations) {
			if(stack.isEmpty()) {
				stack.push(Integer.parseInt(c));
			}else if(Character.isDigit(Integer.parseInt(c))){
				stack.push(Integer.parseInt(c));
			}else if(c.charAt(0)=='D') {
				Integer pop = stack.pop();
				pop=pop*2;
				stack.push(pop);
			}else if(c.charAt(0)=='C') {

			}else if(c.charAt(0)=='+') {

			}
		}

		return 0;
	}

}
