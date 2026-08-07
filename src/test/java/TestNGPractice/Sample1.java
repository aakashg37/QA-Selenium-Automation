package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {

	WebDriver driver;
	
	@Test(priority=-1)
	public void launchChromeBrowser() {
		driver=new ChromeDriver();
		Reporter.log("Chrome browser launched",true);
	}
	
	@Test
	public void enterUrl() {
		driver.get("https://kite.zerodha.com/");
		Reporter.log("URL entered into browser: Kite Zerodha",true);
	}
	
	@Test(priority=1)
	public void enterUname() {
		driver.findElement(By.cssSelector("#userid")).sendKeys("Virat K");
		Reporter.log("Username entered",true);
	}
	
	@Test(priority=2)
	public void enterPass() {
		driver.findElement(By.cssSelector("#password")).sendKeys("Virat@123");
		Reporter.log("Password entered",true);
	}
	
	
}







