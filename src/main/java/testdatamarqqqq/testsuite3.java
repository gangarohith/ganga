package testdatamarqqqq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsuite3 {
	
	
	@Test (priority=3)
	public void hotstar() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hotstar.com/in/mypage");
	}
	
	
	@Test
	public void netflix() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/");
	}

}
