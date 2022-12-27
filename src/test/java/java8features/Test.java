package java8features;

public class Test{

	public static void main(String[] args) {
		/*
		 * Sample sampref=new Sample() {
		 * 
		 * @Override public void draw() { System.out.println("Hi");
		 * 
		 * } }; sampref.draw();
		 */
		
		//Lamda Expression -()->{}
		
		
		/*
		 * Sample sampref=()->{ System.out.println("Hi"); System.out.println("revathi");
		 * }; sampref.draw();
		 */
		
		Sample sampref=(a,b)->{
			int c=0;
			c=a+b;
			System.out.println(c);
			return c;
		};
		sampref.draw(5,10);
	}

	

}
