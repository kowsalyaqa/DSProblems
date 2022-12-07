package stack;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class MakeTheStringGreat1544 {
	@Test
	public void tdp1(){
		String s="leEeetcode";
		String expected="leetcode";
		String actual=makeGood(s);
		Assert.assertEquals(expected,actual);
	}

	//@Test
	public void tdp2(){
		String s="abBAcC";
		String expected="";
		String actual=makeGood(s);
		Assert.assertEquals(expected,actual);
	}
	//@Test
	public void tdp3(){
		String s="AbBcCc";
		String expected="";
		String actual=makeGood(s);
		Assert.assertEquals(expected,actual);
	}

	public String makeGood(String s) {
		if(s.length()==0 ||  s.length()==1) return s;
		Stack<String> stringStack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()){
			if(stringStack.isEmpty()){
				stringStack.push(String.valueOf(c));
			}else if(!stringStack.isEmpty() && stringStack.peek().equalsIgnoreCase(String.valueOf(c))){
				int a=c;
				String c2=stringStack.peek();
				int b=c2.charAt(c2.length()-1);
				if(a!=b) {
					stringStack.pop();
				}
			}else {
				stringStack.push(String.valueOf(c));
			}
		}

		while (!stringStack.empty()) {//Can use reverse of string, to reduce time complexity to O(N)
			sb.insert(0, stringStack.pop());
		}
		return sb.toString();
	}
	
}
