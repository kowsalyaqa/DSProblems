package problemsolving;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class UniqueMorseCodeWords804 {
	/*Test Data:
	 * 	Example 1:
	 * 	Input: words = ["gin","zen","gig","msg"]
		Output: 2
		
		Explanation: The transformation of each word is:
		"gin" -> "--...-."
		"zen" -> "--...-."
		"gig" -> "--...--."
		"msg" -> "--...--."
		There are 2 different transformations: "--...-." and "--...--.".
				
		Example 2:
		Input: words = ["a"]
		Output: 1
	 * 
	 * Pseudo Code:
	 * -------------
	 * 1.Read String Array words 
	 * 2.Declare String[] array to store mappings for 26 letters
	 * 3.Declare set<String> set=new HashSet<>() 
	 * 4.Iterate words using for each loop
	 * 5.Second for loop for each string in array and find mapping words arrays and into new string
	 * 6.Once Second for loop complete, add into set
	 * 7.Once loop complete return se.size() from function and compare with expected value using Assert
	 * 
	 * Time Complexity - O(N^2)
	 * Space Complexity - O(N)
	 * 
	 */
	
	@Test
	public void tdp1() {
		String[] words={"gin","zen","gig","msg"};
		int expected=2;
		int actual=uniqueMorseRepresentations(words);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void tdp2() {
		String[] words={"a"};
		int expected=1;
		int actual=uniqueMorseRepresentations(words);
		Assert.assertEquals(expected, actual);
	}
	 public int uniqueMorseRepresentations(String[] words) {
		String[] codeforLetters={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		 Set<String> set = new HashSet<>();
	        for (String word: words) {
	            String s = new String();
	            for (char c: word.toCharArray()) {
	                s = s + codeforLetters[c - 'a'];
	            }
	            set.add(s);
	        }
	        return set.size();
	}	
}
