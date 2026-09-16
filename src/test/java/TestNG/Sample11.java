package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample11 {
		
	@Test
	public void verifyURL_Kite() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String URL=driver.getCurrentUrl();
		
		Assert.assertEquals(URL, "https://kite.zerodha.com/");
	}
	
	
}
