package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample13 {
	
	@Test
	public void verifyURL_Amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String URL=driver.getCurrentUrl();
		
		Assert.assertEquals(URL, "https://www.amazon.in/");
	}
	

}
