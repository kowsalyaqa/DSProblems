package string.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class KeyboardRow500 {

	@Test
	public void tdp1() {
		String[] words = {"Hello","Alaska","Dad","Peace"};
		String[] expected= {"Alaska","Dad"};
		String[] actual=findWords(words);
		Assert.assertArrayEquals(expected,actual);
	}

	@Test
	public void tdp2() {
		String[] words = {"omk"};
		String[] expected= {};
		String[] actual=findWords(words);
		Assert.assertArrayEquals(expected,actual);
	}

	@Test
	public void tdp3() {
		String[] words = {"adsdf","sfd"};
		String[] expected= {"adsdf","sfd"};
		String[] actual=findWords(words);
		Assert.assertArrayEquals(expected,actual);
	}

	public String[] findWords(String[] words) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] c1 = new char[]{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		char[] c2 = new char[]{'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
		char[] c3 = new char[]{'z', 'x', 'c', 'v', 'b', 'n', 'm'};

		for(int i=0;i<c1.length;i++) map.put(c1[i], map.getOrDefault(c1[i],0)+1);
		for(int j=0;j<c2.length;j++) map.put(c2[j], map.getOrDefault(c2[j],0)+2);
		for(int k=0;k<c3.length;k++) map.put(c3[k], map.getOrDefault(c3[k],0)+3);

		if(words == null || words.length == 0)
			return new String[0];

		List<String> list = new ArrayList<String>();
		for(String word: words) {
			String s = word.toLowerCase();
			int row = map.get(s.charAt(0));
			int i=1;
			for(; i < s.length(); i++) {
				if(map.get(s.charAt(i)) != row)
					break;
			}
			if(i == s.length())
				list.add(word);
		}

		String[] count = new String[list.size()];
		for(int i = 0; i < count.length; i++)
			count[i] = list.get(i);

		return count;
	}

}
