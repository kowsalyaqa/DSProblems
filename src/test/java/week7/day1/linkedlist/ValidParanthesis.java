package week7.day1.linkedlist;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class ValidParanthesis {
	@Test
	public void tdp1() {
		String s="";
		String t="";
		boolean expected=true;
		boolean actual=isValidParanthesis(s);
		Assert.assertEquals(expected, actual);
	}
	
	public boolean isValidParanthesis(String s) {
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
