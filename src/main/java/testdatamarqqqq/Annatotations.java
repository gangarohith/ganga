package testdatamarqqqq;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annatotations {
	@AfterClass
	public void Ac() {
		
		System.out.println("After class ");
	}

	@BeforeSuite
	public void bs() {
		
		System.out.println("Before Suite ");
	}
	@BeforeClass
	public void bc() {
		
		System.out.println("Before Class ");
	}
	

@AfterMethod
	public void AM() {
		
		System.out.println(" After method");
	}


@AfterSuite
public void AS() {
	
	System.out.println("After suite ");
}
@BeforeMethod
public void bm() {
	
	System.out.println("Before method ");
}
@Test
public void ts() {
	System.out.println("Test");
}


	
}
