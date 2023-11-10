package suiteparameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parametersclass12 {
   WebDriver driver;
   @Parameters("browsername")

	@BeforeTest
	public void a1(String browsername) {
		System.out.println(browsername);
		if (browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}
		else if (browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			
		}
		else {
			System.out.println("no browser found");
		}
	}
	
	@Test
	public void a2() {
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("diwali",Keys.ENTER);
		
	}
	@AfterTest
	public void testclo() {
		driver.close();
	}
	
	
}
