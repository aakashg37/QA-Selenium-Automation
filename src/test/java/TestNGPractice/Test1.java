package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	
	@Test	(groups="Smoke",priority=-1)
	public void verifyLoginPageOpen() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test	(groups="Smoke",priority=1)
	public void verifyLoginBtn() {
		boolean isBtnEnabled=driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
		System.out.println("is Button Enabled ? :"+isBtnEnabled);
	}
	
	@Test	(groups="Regression",priority=2)
	public void verifyLogoDisplayed() {
		boolean isLogoDisplayed=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("is Logo Displayed? : "+isLogoDisplayed);
		
	}
	

	@Test	(groups="Sanity",priority=2)
	public void verifyHeadingDisplayed() {
		boolean isDisplayed=driver.findElement(By.xpath("//h5[text()='Login']")).isDisplayed();
		Assert.assertEquals(isDisplayed, true);
	}
	
	@Test	(priority=2)
	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test	(groups="Smoke",priority=1)
	public void verifyUnameFiled() {
		boolean isUnameDisplayed=driver.findElement(By.xpath("//input[@name='username']")).isDisplayed();
		Assert.assertEquals(isUnameDisplayed, true);	
	}
	
	@Test	(groups="Smoke",priority=1)
	public void verifyPassField() {
		boolean isPassDisplayed=driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
		Assert.assertEquals(isPassDisplayed, true);
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}


