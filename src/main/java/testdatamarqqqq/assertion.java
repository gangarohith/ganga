package testdatamarqqqq;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertion {

	@Test
	public void dis() {
		int b=23;
		Assert.assertTrue(true);
		Assert.assertEquals("wednesday", "Wednesday");
		
		
		//System.out.println(a);
		System.out.println(b);
		System.out.println("Ravi");
		System.out.println("ajay");
	}
	
	@Test
	public void sai() {
		
		SoftAssert sa=new SoftAssert();
		
		
		sa.assertTrue(true);
		sa.assertEquals("wednesday", "Wednesday");
		
		System.out.println("santhosh");
		System.out.println("hari");
		
		
		
		
		
		
	}

}
