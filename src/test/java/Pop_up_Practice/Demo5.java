package Pop_up_Practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//click on the New Tab button
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
		Thread.sleep(2000);
		
		//find all window IDs present on the browser
		Set<String> allID=driver.getWindowHandles();
		
		//print the IDs
		System.out.println(allID);
		
		//store it in ArrayList -> pass the allIdas a parameter to AL
		ArrayList<String> al=new ArrayList<>(allID);
		
		String MpID=al.get(0);	//to get MainPage ID -->return String  
		
		String WpID=al.get(1);	//to get Child Window pop ID -->return String
		
		Thread.sleep(2000);
		
		//switch to Window pop
		driver.switchTo().window(WpID);
		
		Thread.sleep(2000);
		
		//click on the Mock Interview Button
		driver.findElement(By.xpath("//a[text()='Mock Interviews']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//close the current window
		driver.close();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(MpID);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Udemy Courses']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}





