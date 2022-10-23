package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class Palindrome2 {



	public boolean validPalindrome(String s) {
		int left=0, right=s.length()-1;

		while(left<right) {
			if(s.charAt(left)!=s.charAt(right)) {
				boolean flag=palindrome(s,left++,right);
				return flag;
			}else {
				return true;
			}
		}
	}

	public boolean palindrome(String s,int left,int right) {
		if(s.charAt(left)==s.charAt(right)) {
			left++;
			right--;
			return true;
		}else {
			left++;
			return false;
		}
	}

	@Test
	public  void positive() {
		String s="deeee";
		boolean actual=validPalindrome(s);
		System.out.println(actual);
		Assert.assertEquals(true,actual);
	}
}
