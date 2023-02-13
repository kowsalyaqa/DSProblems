package string.problems;

public class SplitLimitString {
	public static void main(String[] args) {
		String str="geeks@for@geeks";
		String[] split = str.split("@",2);
		for (String s: split) {
			System.out.println(s);
		}
	}

}
