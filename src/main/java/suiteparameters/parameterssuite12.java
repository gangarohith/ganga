package suiteparameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterssuite12 {

	WebDriver driver;
	@Parameters ("browsername")
	@BeforeTest
	public void launch(String browsername) {
		System.out.println(browsername);
		if(browsername.equalsIgnoreCase("fiefox")) {
			driver=new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else {
			System.out.println("browser not found");
		}
		
	}
	@Parameters("url")
	@Test
	public void Q1(String url) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	@Parameters({"username","password"})
	@Test
	public void Q2(String username,String password) {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@title='Please enter your password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='Login']")).click();
	}
	
	@AfterTest
	public void clos() throws Throwable {
		Thread.sleep(3000);
		driver.close();
	}
	
}
