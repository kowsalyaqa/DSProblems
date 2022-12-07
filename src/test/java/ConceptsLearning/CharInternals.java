package ConceptsLearning;

public class CharInternals {

	public static void main(String[] args) {
		char c='a';
		int a=c;
		System.out.println(c);
		System.out.println(a);
		boolean upperCase = Character.isUpperCase(c);
		System.out.println(upperCase);
		boolean upperCase2 = Character.isUpperCase(c);
		System.out.println(upperCase2);
		
		char c1='A';
		int a1=c1;
		System.out.println(c1);
		System.out.println(a1);
		boolean upperCase1 = Character.isUpperCase(c);
		System.out.println(upperCase1);
		boolean upperCase3 = Character.isUpperCase(c);
		System.out.println(upperCase3);
	}

}
