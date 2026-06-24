package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser: Chrome
		WebDriver driver =new ChromeDriver();
		
		//open the url
		driver.navigate().to("https://www.atlassian.com/software/jira");
		
		//TASK--> send email on work email input
		//using css selector
		//driver.findElement(By.cssSelector("input.css-1cab8vv")).sendKeys("velocity@gmail.com");
	
		//TASK--> maximize the open window of browser
		driver.manage().window().maximize();
		
		//TASK--> click on continue with GOOGLE
		driver.findElement(By.xpath("// button[contains(@class,'_4cvr1h6o _bfhkvuon _19itj0fz _2rko183y _syazazsu _80omtlke ')]")).click();
		
		//TASK--> After continue with GOOGLE, comeback to main website
		driver.navigate().back();
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//TASK--> click on the Sign-in button
		driver.findElement(By.cssSelector("button.css-48ccbj")).click();
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//enter email to login
		//driver.findElement(By.cssSelector("input#username-uid11")).sendKeys("akash.gangule3@gmail.com");
		//will be not able to do because the url is different
		
		//TASK--> After clicking sig-in button, come back to main website
		driver.navigate().back();
		
		//wait for 2sec
		Thread.sleep(2000);
		
		//close the browser
		driver.quit();
	}

}





