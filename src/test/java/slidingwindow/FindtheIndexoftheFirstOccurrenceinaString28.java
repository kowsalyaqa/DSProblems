package slidingwindow;

public class FindtheIndexoftheFirstOccurrenceinaString28 {
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public int strStr(String haystack, String needle) {
		int pointer=0,k=pointer+needle.length();
		String substring="";
		while(pointer<(pointer+k) && pointer<=haystack.length()-needle.length()){
			substring=haystack.substring(pointer,pointer+k);
			if(substring.equals(needle)){
				return pointer;
			}
			pointer++;
		}
		return -1;
	}
}
