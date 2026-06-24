package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Tag & Class: TASK--> Enter username
		//syntax: tagname#Idattributevalue
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		
		//TASK--> enter password
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		
		//TASK--> Click Login Button
		//tagname.classAttributevalue
		//driver.findElement(By.cssSelector("input.submit-button")).click();
		
		//tagname.classAttributrvalue[attributename='attributealue']
		driver.findElement(By.cssSelector("input.submit-button[value='Login']")).click();
		
		
	}
}
