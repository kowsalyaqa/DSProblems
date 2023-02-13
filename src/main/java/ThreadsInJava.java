
public class ThreadsInJava {

	public static void main(String[] args) {
		final Shared s1=new Shared();
		Thread t1=new Thread("First Thread") {
			@Override
			public void run() {
				super.run();
				s1.sharedMethod();
			}
		};
		Thread t2=new Thread("Thread - 2") {
			@Override
			public void run() {
				super.run();
				s1.sharedMethod();
			}
		};
		t1.start();
		t2.start();
	}
	
	
}
