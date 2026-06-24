package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//xpath by contains  //tagname[contains(@attributename,'attributevalue')]
		
		//enter the username
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		
		//enter the password
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		
		Thread.sleep(2000);
		
		//login button
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main')]")).click();
	
		Thread.sleep(3000);
		
		//click on user dropdown
		//driver.findElement(By.xpath("//p[contains(@class,'oxd-userdropdown-name')]")).click();
		
		driver.findElement(By.xpath("//a[contains(@href,'/web/index.php/leave/viewLeaveModule')]")).click();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		//click on pending self review
		driver.findElement(By.xpath("//button[contains(@class,'oxd-icon-button oxd-icon-button--danger')]")).click();
		System.out.println("pending self review clicked");
		
		Thread.sleep(3000);
		
		//go back
		driver.navigate().back();
		System.out.println("navigate back");
		
	//	Thread.sleep(2000);
		
		//click on candidate to interview
	//	driver.findElement(By.xpath("//button[contains(@class,'oxd-icon-button oxd-icon-button--info')]")).click();
	//	System.out.println("candidate self review");
		
	}
	
}









