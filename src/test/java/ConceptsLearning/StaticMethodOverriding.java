package ConceptsLearning;


//Can you override private or static method in java?
/*
  you cannot override private or static method in java,
  If you create similar method with same return type and same method arguments 
  that's called method hiding
*/
class A {

	static void x() {
		System.out.println("x() in A (Parent)");
	}
}

public class StaticMethodOverriding extends A {

	static void x() {
		System.out.println("x() in StaticMethodOverriding (child)");
	}

	public static void main(String[] args) {
		A a = new StaticMethodOverriding();
		a.x();//The static method x() from the type A should be accessed in a static way
	}
}
