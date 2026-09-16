package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample12 {

	@Test
	public void verifyURL_Flipkart() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String URL=driver.getCurrentUrl();
		
		Assert.assertEquals(URL, "https://www.flipkart.com/");
	}
	
	
	
}
