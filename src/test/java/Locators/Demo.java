package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {

		// open the browser: Chrome
		WebDriver driver = new ChromeDriver();

		// open the url
		driver.get("https://kite.zerodha.com/");

		Thread.sleep(3000);

		// Task enter user ID //input[@id="userid"]
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys("AKASH123");

		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Akash@123");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}
}
