package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByTagName {
	
	public static void main(String[] args) {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url:
		driver.get("https://kite.zerodha.com/");
		
		//TASK--> click on Login button
		//Locator By Using Tag Name
		driver.findElement(By.tagName("button")).click();
		
	}

}


