package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://www.flipkart.com/account/login?ret=/");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("9122987601");
		
		driver.findElement(By.xpath("//input[@class=\"c3Bd2c yXUQVt\"]")).sendKeys("9900167801");
		
	
		
	}

}
