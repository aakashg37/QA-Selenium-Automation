package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser: Edge
		WebDriver driver=new ChromeDriver();
		
		//open the url
		driver.get("https://www.linkedin.com/login/?trk=guest_homepage-basic_nav-header-signin");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//Task enter the email
		driver.findElement(By.xpath("//input[contains(@id,'«r3»')]")).sendKeys("akashg@gmail.com");
		
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@id,'«r4»')]")).sendKeys("Akash@123");
		
		
	}
}
