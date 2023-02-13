
public class Shared {

	int i;
	public void sharedMethod() {
		Thread currentThread = Thread.currentThread();
		for(int i=0;i<=1000;i++) {
			System.out.println(currentThread.getName()+" : "+i);
		}
	}
}
