package problemsolving;

import java.util.HashMap;
import java.util.Map;

public class MaximumVowelsInSubstring {

	public static void main(String[] args) {
		String s="workaattech";
		int count=0,max=Integer.MIN_VALUE,k=3;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<=s.length()-k;i++){
			count=0;
			for(int j=i;j<k;j++){
				if(s.charAt(j)=='a'|s.charAt(j)=='e'|s.charAt(j)=='i'|s.charAt(j)=='o'|s.charAt(j)=='u'){
					count++;
				}
			}
		}
	}
}
