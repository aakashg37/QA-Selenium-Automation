package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	
	//XPATH By INDEX
	public static void main(String[] args) throws InterruptedException {
		
		//lanch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url: https://www.facebook.com/reg/?entry_point=login&next=
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//TASK : enter the surname
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Kohli");
		
		Thread.sleep(2000);
		
		//enter the mobile number or email address
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9912345677");
		
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
