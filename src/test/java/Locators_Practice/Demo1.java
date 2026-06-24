package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	//XPATH BY STARTS-WITH 
		public static void main(String[] args) throws InterruptedException {
			
			//launch the browser: Chrome
			WebDriver driver = new ChromeDriver();
			
			//enter the url
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
			//maximize the window
			driver.manage().window().maximize();
			
			//wait for 2sec
			Thread.sleep(2000);
			
			//Task click on the login button
			driver.findElement(By.xpath("//button[starts-with(@class,'oxd-button oxd-button--medium ')]")).click();
			
			
			
		}
}
