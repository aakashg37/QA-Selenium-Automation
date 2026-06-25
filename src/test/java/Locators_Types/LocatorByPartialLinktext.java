package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorByPartialLinktext {
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser: Firefox
		WebDriver driver=new FirefoxDriver();
		
		//enter the url
		driver.get("https://kite.zerodha.com/");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> click on the Forgot user ID
		//By Using Partial text
		//SYNTAX: By.partialLinkeText("");
		
		driver.findElement(By.partialLinkText("Forgot user")).click();
		
		//wait for 1 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}
}
