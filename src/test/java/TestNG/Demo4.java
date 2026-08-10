package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4 {
		
	@Test
	public void verifyURL_Kite() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test
	public void verifyTitle_Kite() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		System.out.println(driver.getTitle());
	}

}
