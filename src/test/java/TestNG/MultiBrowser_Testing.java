package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser_Testing {
	
	@Parameters("browserName")
		
	@Test
	public void verify_PageOf_SwagsLab(String browserName) throws InterruptedException {
		WebDriver driver=null;
		//Edge
		if(browserName.equals("Chrome")) //false
		{
		driver=new ChromeDriver();
		}
		//Edge
		else if(browserName.equals("firefox")) //false
		{
		driver=new FirefoxDriver();
		}
		//Edge
		else if(browserName.equals("Edge")) //true
		{
			driver=new EdgeDriver();
		}

		driver.get("https://www.saucedemo.com/");
		//Enter Username

		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

		//Enter Password

		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");

		//Click Login Button

		driver.findElement(By.cssSelector("#login-button")).click();

		Thread.sleep(2000);
		//get Products Text
		String ActualResult =

		driver.findElement(By.cssSelector(".title")).getText(); //Products
		Assert.assertEquals(ActualResult, "Products"); //Pass
		Thread.sleep(2000);
		//Click on 3 Line

		driver.findElement(By.cssSelector("#react-burger-menu-btn")).click();

		Thread.sleep(2000);
		//Click on Logout

		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();

		Thread.sleep(2000);
		driver.close();
	}
	
	
}
