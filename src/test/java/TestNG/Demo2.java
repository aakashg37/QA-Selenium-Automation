package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {

	
	
	@Test
	public void verifyURL_Amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		//Reporter.log(driver.getCurrentUrl(), true);
		//Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.inn");
	}
	
	@Test
	public void verifyTitle_Amazon() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
	}
	
	
}
