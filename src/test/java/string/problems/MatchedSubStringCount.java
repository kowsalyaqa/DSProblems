package string.problems;

public class MatchedSubStringCount {

	public static void main(String[] args) {
		String s="dhimanman";
		String s1="man";
		int count=0,k=s1.length();
		for(int i=0;i<s.length()-s1.length()+1;i++) {
			String subString=s.substring(i,i+k);
			if(subString.equals(s1)) {
				count++;
			}
		}
		System.out.println("Substring Count: "+count);
	}

}
