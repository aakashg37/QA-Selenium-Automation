package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
				WebDriver driver = new ChromeDriver();
				
				//Enter the URL :https://www.airindia.com/in/en/sign-in
				driver.get("https://www.airindia.com/in/en/sign-in");
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//button[@class='btn btn-red send-otp']")).click();
	}
}
