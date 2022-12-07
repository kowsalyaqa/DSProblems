package ConceptsLearning;

public class CharacterClass {

	public static void main(String[] args) {
		char[] c={'a','b','c',' ','1','2','$',' '};
		Character.isAlphabetic(c[0]);
		Character.isDigit(c[1]);
		Character.isLetter(c[2]);
		Character.isUpperCase(c[3]);
		Character.isLowerCase(c[4]);
		System.out.println(Character.isWhitespace(c[3]));
		

	}

}
