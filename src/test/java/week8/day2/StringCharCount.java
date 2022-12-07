package week8.day2;

import java.util.HashMap;
import java.util.Map;

public class StringCharCount {

	public static void main(String[] args) {
		String s="aaabbccaad";
		String out="a3b2c2a2d1";
		String ans="";
		char temp=0;
		int count=0;
		Map<Character,Integer> map=new HashMap<>();
		temp=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(temp==s.charAt(i)) {
				map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
				count++;
			}else {
				ans=ans+temp+String.valueOf(count);
				temp=s.charAt(i);
				count=0;
			}
		}
		System.out.println(ans);
		if(out.equals(ans)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
