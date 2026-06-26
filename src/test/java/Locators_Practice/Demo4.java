package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//give the input in full name
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Virat Kohli");
		
		//give the email
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("virat.kohli@rcb.com");
		
		//give the current address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Alibag");

		//enter the permanent address
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Delhi");
		
		//Thread.sleep(1000);
		
		//click on the submit button
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//close the tab
		driver.close();
	}

}









