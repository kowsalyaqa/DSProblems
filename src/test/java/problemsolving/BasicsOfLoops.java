package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class BasicsOfLoops {
	
	public boolean whileLoop(int left,int right) {
		boolean flag=false;
		while(left<right) {
			flag=true;
			++right;
			left++;	
		}
		System.out.println(flag);
		return flag;
	}

	
	@Test
	public void loop() {
		boolean status=whileLoop(0,1);
		Assert.assertEquals(true,status);
	}
	
}
