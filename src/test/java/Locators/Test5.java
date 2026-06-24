package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://groww.in/login");
		
		driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("akash@gmail.com");
		
		
	}
}
