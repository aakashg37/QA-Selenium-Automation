package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByName {
	public static void main(String[] args) {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//TASK--> search the product 'Laptop' using search store input
		//Locator By Name
		//SYNTAX: By.name(nameattributevvalue)
		driver.findElement(By.name("q")).sendKeys("Laptop");
		
		
		//close the browser
		driver.quit();
		
	}
}
