package week7.day1.linkedlist;

import org.junit.Test;

import junit.framework.Assert;

public class BackspaceCompare844 {
	
	@Test
	public void tdp1() {
		String s="";
		String t="";
		boolean expected=true;
		boolean actual=backspaceCompare(s,t);
		Assert.assertEquals(expected, actual);
	}
	
	public boolean backspaceCompare(String s,String t) {
		int left=s.length()-1,right=t.length()-1;
		Singly_Linked_List list1 = new Singly_Linked_List();
		Singly_Linked_List list2 = new Singly_Linked_List();
		for(int i=0;i<s.length();i++) {
			list1.add(s.charAt(i));
			System.out.println(list1);
		}
		for(int i=0;i<t.length();i++) {
			list2.add(t.charAt(i));
		}
		
		while(left>=0&& right>=0) {
			if((s.charAt(left)=='#')&&(t.charAt(right)=='#')){
				list1.remove(left);
				left--;
				list1.remove(left);
				right--;
				list2.remove(right);
			}
		}
		
		list1.print();
		System.out.println("------------");
		list2.print();
		
		if(list1.equals(list2)) {
			return true;
		}
		
		return false;
	}
	
	

}
