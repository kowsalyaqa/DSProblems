package stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class ValidParentheses20 {
	@Test
	public void tdp1() {
		String s="()";
		boolean expected=true;
		boolean actual=isValid(s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp2() {
		String s="()[]{}";
		boolean expected=true;
		boolean actual=isValid(s);
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void tdp3() {
		String s="(]";
		boolean expected=false;
		boolean actual=isValid(s);
		Assert.assertEquals(expected, actual);
	}
	public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            stack.push(')');
            }else if(s.charAt(i)=='{'){
                 stack.push('}');
            }else if(s.charAt(i)=='['){
            stack.push(']');
            }else if(stack.isEmpty() || stack.pop()!=s.charAt(i)){
                 return false;
            }
        }
        boolean flag= stack.isEmpty();
        return flag;
    }	
	

}
