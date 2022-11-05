package problemsolving;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindCommonCharacters1002 {
	
	
@Test
public void findCommonCharacters() {
	String[] s= {"bella","label","roller"};
	List<String> expected=new ArrayList<>();
	expected.add("e");
	expected.add("l");
	expected.add("l");
	List<String> actual=commonChars(s);
	Assert.assertEquals(expected,actual);	
}


public List<String> commonChars(String[] words) {
    int[][] ascillLetters = new int[26][words.length];
    for(int i = 0 ; i< words.length ; i++){
        for(int j =0; j<words[i].length();j++)
        	ascillLetters[words[i].charAt(j)-'a'][i] ++;            
    }

     List<String> charArr = new ArrayList<>();
     for(int i =0; i < ascillLetters.length ;i++){
        int min = ascillLetters[i][0];
        for(int j = 0 ; j< words.length ; j++){
            if(ascillLetters[i][j]<min)
                min = ascillLetters[i][j];
        }
        while(min!=0){
            charArr.add(Character.toString((char)(i+'a')));
            min--;

        }
    }
    return charArr;
}
}
