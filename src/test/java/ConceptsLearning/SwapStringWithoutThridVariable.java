package ConceptsLearning;

public class SwapStringWithoutThridVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bac";
		String s1 = "xyz";
		System.out.println(s);
		System.out.println(s1);
		s=s+s1;
		s1=s.substring(0,s1.length());
		s=s.substring(s1.length(),s.length());
		System.out.println(s);
		System.out.println(s1);
		

	}

}
