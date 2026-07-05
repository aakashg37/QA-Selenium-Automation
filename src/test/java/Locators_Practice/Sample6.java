package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hotels.irctc.co.in/hotels");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='inputbox']")).sendKeys("Pune");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@class='hvr-shutter-in-vertical'])[1]")).click();
		
	}
	
	
}
