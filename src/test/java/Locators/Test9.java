package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {
	
	//XPATH BY STARTS-WITH
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://kite.zerodha.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(2000);
		
		//TASK: click on Forgot user ID or password?
		driver.findElement(By.xpath("//a[starts-with(@class,'text-light ')]")).click();
		
	
		
		
	}
}
