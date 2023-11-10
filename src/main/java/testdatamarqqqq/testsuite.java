package testdatamarqqqq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsuite {
	
	@Test (priority=2)
		public void ab() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
		}
		
	
	@Test
		public void fb() { 
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
		}
	
	@Test 
		
		public void my() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
		}
		
	}


