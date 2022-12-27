package recursion;

import org.junit.Assert;
import org.junit.Test;


public class CountOfPairsRecursion {
	
	@Test
	public void tdp1() {
		String s="axa";
		int expected=1;
		int actual=countPairs(s);
		Assert.assertEquals(expected, actual);
	}

	public int countPairs(String str) {
		char[] charArray = str.toCharArray();
        return recFun(charArray, new StringBuilder(), 0, 0);
    }

    public int recFun(char[] charArray, StringBuilder sb, int next, int count) {
        if(next == charArray.length) {
            if (sb.length() == 3) {
                if(sb.charAt(0) == sb.charAt(2)) {
                    count++;
                }
            }
            return count;
        }
        if (sb.length() == 3) {
            if(sb.charAt(0) == sb.charAt(2)) {
                count++;
            }
            sb.deleteCharAt(0); 
        }
        sb.append(charArray[next]); 
        next++;
        return recFun(charArray, sb, next, count); //axaxa "axa" 3
    }
}
