package testdatamarqqqq;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb111 {
	
	@Test(dataProvider="data",dataProviderClass=excel22.class)
	
	
	public void dis(String username,CharSequence[] Password) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(Password);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	
	
	}
}
