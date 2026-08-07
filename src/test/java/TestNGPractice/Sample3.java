package TestNGPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample3 {
	
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Reporter.log("open browser chrome",true);
	}
	
	@BeforeMethod
	public void Login() throws InterruptedException {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(2000);
		Reporter.log("Login into SauceDemo App",true);
	}
	
	
	@Test
	public void verifyAddToCart() {
		driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']")).click();
		Reporter.log("Verified Add To Cart Button,by clicking on it.",true);
	}
	
	/*@Test
	public void TC1() {
		Reporter.log("Running TC1",true);
	}*/
	
	@Test
	public void verifyRemoveToCart() {
		driver.findElement(By.cssSelector("#remove-sauce-labs-backpack")).click();
		Reporter.log("Verified Remove Button,by clicking on it.",true);
	}
	
	
	@AfterMethod
	public void Logout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		Reporter.log("Logout from SauceDemo App",true);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
		Reporter.log("closed chrome browser",true);
	}

}




