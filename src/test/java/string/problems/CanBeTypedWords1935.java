package string.problems;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class CanBeTypedWords1935 {

	@Test
	public void tdp1() {
		String text = "hello world";
		String brokenLetters = "ad";
		int expected=1;
		int actual=canBeTypedWords(text,brokenLetters);
		Assert.assertEquals(expected,actual);
	}

	@Test
	public void tdp2() {
		String text = "leet code";
		String brokenLetters  = "lt";
		int expected=1;
		int actual=canBeTypedWords(text,brokenLetters);
		Assert.assertEquals(expected,actual);
	}


	@Test
	public void tdp3() {
		String text = "leet code";
		String brokenLetters  = "e";
		int expected=0;
		int actual=canBeTypedWords(text,brokenLetters);
		Assert.assertEquals(expected,actual);
	}
	
	public int canBeTypedWords(String text, String brokenLetters) {
		Set<Character> set = new HashSet<>();
		for (char ch : brokenLetters.toCharArray()) {
			set.add(ch);
		}

		String[] words = text.split(" ");
		int count = words.length;
		for (String word : words) {
			for (char c : word.toCharArray()) {
				if (set.contains(c)) {
					count=count-1;
					break;
				}
			}
		} 
		return count;
	}
}
