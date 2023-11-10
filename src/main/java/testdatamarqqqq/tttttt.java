package testdatamarqqqq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tttttt {

	@Test (priority=2)
	public void ab() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hr.marolix.com/hrm-dashboard");
	}
	@Test (priority=1)
	public void hrms() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://hrms.marolix.com/login");
	}
	
}
