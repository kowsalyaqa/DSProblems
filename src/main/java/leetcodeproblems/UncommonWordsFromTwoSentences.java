package leetcodeproblems;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UncommonWordsFromTwoSentences {
    /**
     * 17:00 - 17:04 - 4 mins understand problem
     * Test Data - 17:06 - 17:09 - 3 mins
     * S1="this" s2="that" o/p=[this,that]
     * S1="this that" s2="that" o/p=[this]
     * S1="this that" s2="that this " o/p=[]
     * S1="that" s2="that this" o/p=[this]
     * s1="this that" s2="and" o/p=[and]
     * s1 = "this apple is sweet", s2 = "this apple is sour" Output: ["sweet","sour"]
     * Input: s1 = "apple apple", s2 = "banana"  Output: ["banana"]
     *
     * Pseudo Code:
     * 1.Split each words in 2 strings and store occurrence of word into Map
     * 2.Iterate,find value==1 ,add it into list
     */



    //code- 17:09 - 17:36 - 15 mins
    @Test
    public void testData1() {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] expectedListUncommonWords = new String[]{"sweet","sour"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }

    @Test
    public void testData2() {
        String s1 = "apple apple";
        String s2 = "banana";
        String[] expectedListUncommonWords = new String[]{"banana"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }
    @Test
    public void testData3() {
        String s1 = "this";
        String s2 = "that";
        String[] expectedListUncommonWords = new String[]{"that","this"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }
    @Test
    public void testData4() {
        String s1 = "this that";
        String s2 = "that";
        String[] expectedListUncommonWords = new String[]{"this"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }
    @Test
    public void testData5() {
        String s1 = "this that";
        String s2 = "that this";
        String[] expectedListUncommonWords = new String[]{};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }
    @Test
    public void testData6() {
        String s1 = "this";
        String s2 = "that this";
        String[] expectedListUncommonWords = new String[]{"that"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }
    @Test
    public void testData7() {
        String s1 = "this that";
        String s2 = "and";
        String[] expectedListUncommonWords = new String[]{"that","and","this"};
        String[] actualListUncommonWords = uncommonFromSentences(s1, s2);
        Assert.assertEquals(expectedListUncommonWords,actualListUncommonWords);
    }

    private String[] uncommonFromSentences(String s1, String s2) {
        List<String> uncommonWords=new ArrayList<>();
        Map<String,Integer> occurrenceOfWords=new HashMap<>();
        String[] strArr1=s1.split(" ");
        String[] strArr2=s2.split(" ");
        for(int i=0;i<strArr1.length;i++) occurrenceOfWords.put(strArr1[i],occurrenceOfWords.getOrDefault(strArr1[i],0)+1);
        for(int j=0;j<strArr2.length;j++) occurrenceOfWords.put(strArr2[j],occurrenceOfWords.getOrDefault(strArr2[j],0)+1);
      /*  for(Map.Entry<String,Integer> eachEntry:occurrenceOfWords.entrySet()){
            if(eachEntry.getValue().equals(1)) uncommonWords.add(eachEntry.getKey());
        }*/
        for(String s:occurrenceOfWords.keySet()){
            if(occurrenceOfWords.get(s)==1) uncommonWords.add(s);
        }
        return uncommonWords.toArray(new String[uncommonWords.size()]);
    }

}
