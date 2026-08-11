package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Group1 {
	
	@Test(groups="smoke")
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test(groups="Regression")
	public void verifyURL() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://kite.zerodha.com/");
	}
	
	@Test(groups="Sanity")
	public void verifyLogo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		boolean logo=driver.findElement(By.xpath("//img[@alt='Kite logo']")).isDisplayed();
		System.out.println("Is logo displayed? "+logo);
		
	}
	
	@Test(groups="Regression")
	public void verifyHeading() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		boolean heading=driver.findElement(By.xpath("//h2[text()='Login to Kite']")).isDisplayed();
		System.out.println("Is heading displayed? : "+ heading);
	}

}








