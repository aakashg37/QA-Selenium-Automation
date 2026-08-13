package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample4 {
	
	@Test
	public void verifyURL_Kite() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://kite.zerodha.com/");
	}
	
	
	@Test
	public void verifyURL_Kite1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"1_https://kite.zerodha.com/");
	}

}
