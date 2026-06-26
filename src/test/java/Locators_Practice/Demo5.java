package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		//wait for 1 sec
		Thread.sleep(1000);
				
		//click on the elements tab
		driver.findElement(By.xpath("//a[@href='/elements']")).click();
		
		Thread.sleep(2000);		
		driver.navigate().back();
		
		//click on the forms tab
		driver.findElement(By.xpath("//a[@href='/forms']")).click();
				
		Thread.sleep(2000);				
		driver.navigate().back();
		
		//click on the alertswindows tab
		driver.findElement(By.xpath("//a[@href='/alertsWindows']")).click();
				
		Thread.sleep(2000);				
		driver.navigate().back();
		
		//click on the widgets tab
		driver.findElement(By.xpath("//a[@href='/widgets']")).click();
						
		Thread.sleep(2000);						
		driver.navigate().back();
		
		//click on the interaction tab
		driver.findElement(By.xpath("//a[@href='/interaction']")).click();
						
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.close();
		
	}
}









