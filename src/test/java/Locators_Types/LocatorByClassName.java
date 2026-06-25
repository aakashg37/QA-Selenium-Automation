package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByClassName {
	public static void main(String[] args) {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//TASK--> click on Login 
		//Locator By ClassName
		//SYNTAX: By.className("classattributevalue")
		driver.findElement(By.className("ico-login")).click();
		
		//close the browser
		driver.quit();
	}
}


