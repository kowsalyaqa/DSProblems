package stack;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class CrawlerLogFolder1598 {

	// @Test
	public void tdp1() {
		String[] logs = { "d1/", "d2/", "../", "d21/", "./" };
		int expected = 2;
		int actual = minOperations(logs);
		Assert.assertEquals(expected, actual);
	}

	// @Test
	public void tdp2() {
		String[] logs = { "d1/", "d2/", "./", "d3/", "../", "d31/" };
		int expected = 3;
		int actual = minOperations(logs);
		Assert.assertEquals(expected, actual);
	}

	// @Test
	public void tdp3() {
		String[] logs = { "d1/", "../", "../", "../" };
		int expected = 0;
		int actual = minOperations(logs);
		Assert.assertEquals(expected, actual);
	}

	// @Test
	public void tdp4() {
		String[] logs = { "./", "../", "./" };
		int expected = 0;
		int actual = minOperations(logs);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void tdp5() {
		String[] logs = { "d1/", "../", "../", "../" };
		int expected = 0;
		int actual = minOperations1(logs);
		Assert.assertEquals(expected, actual);
	}
	
	//@Test
	public void tdp6() {
		String[] logs = { "d1/","d2/","../","d21/","./"};
		int expected = 2;
		int actual = minOperations1(logs);
		Assert.assertEquals(expected, actual);
	}
	//@Test
	public void tdp7() {
		String[] logs = {"a7/","mi4/","o2/","./","../","q9/","./","../","je2/","../","../","../","g3/","f4/","./","lg5/","wx4/","../","f9/","../","./","vo3/","../"};
		int expected = 3;
		int actual = minOperations1(logs);
		Assert.assertEquals(expected, actual);
	}
	public int minOperations(String[] logs) {
		int count = 0;
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < logs.length; i++) {
			if (!logs[i].equals("./") && !logs[i].equals("../")) {
				stack.push(logs[i]);
				count++;
			} else if (!stack.isEmpty() && logs[i].equals("../")) {
				stack.pop();
				count--;
			}
		}
		return count;
	}

	public int minOperations1(String[] logs) {
		int count = 0,length=0;
		for (int i = 0; i < logs.length; i++) {
			if (!logs[i].equals("../") && !logs[i].equals("./")) {
				count++;
				length++;
			} else if (length>=1 && logs[i].equals("../")) {
				length--;
				count--;
			}
		}
		return count;
	}
}
