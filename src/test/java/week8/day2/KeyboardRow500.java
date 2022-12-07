package week8.day2;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRow500 {

	@Test
	public void tdp1() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] expected = {"Alaska","Dad"};
		String[] actual = findWords(words);
		Assert.assertArrayEquals(expected, actual);
	}

	public String[] findWords(String[] words) {
		int count=0,x=0;
		String firstRow="qwertyuiop";
		String secondRow="asdfghjkl";
		String thirdRow="zxcvbnm";
		String[] output=new String[words.length];
		for(int i=0;i<words.length;i++) {
			for(char c:words[i].toLowerCase().toCharArray()) {
				if(firstRow.contains(String.valueOf(c))){
					count=1;
				}else if(secondRow.contains(String.valueOf(c))) {
					count=2;
				}else {
					count=3;
				};
			}
			output[x++]=words[i];
			count=0;
			Math.min(x, i)
		}
		return words;
	}


}
