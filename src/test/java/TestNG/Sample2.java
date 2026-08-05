package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {
	
	@Test
	public void openKite() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");		
		Thread.sleep(2000);
		
		Reporter.log("openKite",true);		
	}
	
	@Test
	public void openFacebook() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");		
		Thread.sleep(2000);
		
		Reporter.log("openFacebook",true);
	}
	
}
