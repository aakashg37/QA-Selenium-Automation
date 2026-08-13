package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample5 {

	@Test
	public void VerifyURL_Kite() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String URL = driver.getCurrentUrl();

		Assert.assertNotEquals(URL,"https://kite.zerodha.com/");
	}
	
	@Test
	public void VerifyURL_Kite1() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String URL = driver.getCurrentUrl();

		Assert.assertNotEquals(URL,"1_https://kite.zerodha.com/");
	}
	
	
}
