package string.problems;

public class Palindrome {

	public static void findPalindromesInSubString(String input, int j, int k) {
		for (; j >= 0 && k < input.length(); --j, ++k) {
			if (input.charAt(j) != input.charAt(k)) {
				break;
			}
			String s = input.substring(j, k + 1);
			if (s.length() >= 3) {
				System.out.println(input.substring(j, k + 1));
			}
		}
	}

	public static void main(String[] args) {
		String str = "aabbbaa";
		for (int i = 0; i < str.length(); ++i) {
			findPalindromesInSubString(str, i - 1, i + 1);
		}
	}

}
