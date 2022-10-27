package problemsolving;

import org.junit.Test;

import junit.framework.Assert;

public class ReversePrefix2000 {

	/*Test data:
	 *Positive:
	 *Input string: "abcdefg" char='d' 2.xyxzxe,ch = "z",zxyxxe
	 *output string: "dcbafg"
	 *
	 *Negative:
	 *Input string: "abcdefg" char=''
	 *output string: "abcdefg"
	 *
	 *Pseudo Code:
	 *-------------
	 *1.Read input string world and character ch
	 *2.Initialize int variables left=0,right=0 and Char variable char temp=' '
	 *3.Iterate using for loop with condition world.length()
	 *4.Convert world string to char array
	 *4.Inside for loop add if condition to find first occurence of the ch in input string
	 *5.If condition is true, get index of the ch from world string and assign to right variable
	 *6.Then break the loop;
	 *7.Iterate using while loop with condition left char must be less than right char element
	 *8.If condition satisfies, Swap left char element with right char element using char Array
	 *9.Once loop is completed, convert char array to String
	 *10.return output string from function
	 *10.Received string from function and compare with expected string using Assert class
	 * 
	 * */
	public String reversePrefix(String world,char ch) {
		int left=0,right=0;
		char temp=' ';
		char[] chArr=world.toCharArray();
		for(int i=0;i<world.length();i++) {
			if(world.charAt(i)==ch) {
				right=world.indexOf(ch);
				break;
			}
		}
		while(left<right) {
			temp=chArr[left];
			chArr[left]=chArr[right];
			chArr[right]=temp;
			left++;
			right--;
		}
		String.valueOf(chArr);
		System.out.println(String.valueOf(chArr));
		return String.valueOf(chArr);
	}
	
	@Test
	public void tdp1() {
		String world="abcd";
		char ch='z';
		String expected="abcd";
		String actual=reversePrefix(world,ch);
		Assert.assertEquals(expected, actual);
	}
	
	
	
}
