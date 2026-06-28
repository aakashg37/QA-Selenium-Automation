package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch browser
		WebDriver driver=new ChromeDriver();
		
		
		//enter the url: https://www.irctc.co.in/nget/train-search
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//driver.switchTo(driver);
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait
		Thread.sleep(3000);
		
		//click the language as : English
		driver.findElement(By.xpath("//button[text()='English']")).click();
		
		//wait
		Thread.sleep(2000);
		
		//Task: enter the input in : FROM 
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c68-7 ui-inputtext ui-widget ui-state-default ')]")).sendKeys("Pune");
		
		//Thread.sleep(2000);
		
		//close the pop-up of login page
		//driver.findElement(By.xpath("//a[contains(@class,'fa-window-close pull-right loginCloseBtn')]")).click();
		
		//wait 
		Thread.sleep(2000);
		
		//enter the input in : TO
		driver.findElement(By.xpath("//input[contains(@class,'ng-tns-c68-8 ui-inputtext ui-widget ui-state-default ')]")).sendKeys("Bangalore");
		
		//wait
		Thread.sleep(2000);
		
		//driver.quit();
		
		
		
		
		
		
		
		
		//TASK: click the button : Search Trains
		//driver.findElement(By.xpath("//button[text()=' Search Trains ']")).click();
		
		//close the pop-up of login page
		//driver.findElement(By.xpath("//a[contains(@class,'fa-window-close pull-right loginCloseBtn')]")).click();
	
	}
}














