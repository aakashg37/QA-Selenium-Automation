package Locators_Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorByLinktext {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Edge
		WebDriver driver=new EdgeDriver();
		
		//enter the url
		driver.get("https://kite.zerodha.com/");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> Click on the Forgot User Id link 
		//By Using Linktext
		//SYNTAX: By.linkText("");
		
		driver.findElement(By.linkText("Forgot user ID or password?")).click();
		
		//wait for 1 sec
		Thread.sleep(1000);
				
		
		//close the browser
		driver.quit();
	}
}


