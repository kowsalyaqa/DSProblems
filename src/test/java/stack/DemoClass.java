package stack;

public class DemoClass {

	public static void main(String[] args) {
		int k=0;
		String s="0123456789";

		for(char c: s.toCharArray()) {
			k = (k * 10) + (c - '0');
			System.out.println(k+":"+k);
		}

	}

}
