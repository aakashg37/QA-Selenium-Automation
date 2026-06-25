package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorById {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser : Chrome
		WebDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://kite.zerodha.com/");
		
		//TASK--> enter user id
		//By using ID Locator
		//SYNTAX: By.id("idattributevalue")
		driver.findElement(By.id("userid")).sendKeys("AKASH16");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}
	
}



