package testdatamarqqqq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testtask1 {

	@Test
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
	
	@Test
	public void aha() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.aha.video/");
	}
	
	@Test
	public void zee5() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.zee5.com/signin");
	}
	
	@Test
	public void gaana() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://gaana.com/");
	}
	
	@Test
	public void spotify() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://open.spotify.com/");
	}
	
	@Test
	public void sunnxt () {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.sunnxt.com/");
	}
	
	@Test
	public void jiocinema() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jiocinema.com/");
	}
	
	@Test
	public void jiosavan() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jiosaavn.com/");
	}
	
	@Test
	public void myjio() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jio.com/selfcare/login/");
	}
}
