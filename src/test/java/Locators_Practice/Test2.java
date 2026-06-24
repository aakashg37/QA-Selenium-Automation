package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		//launch the browser : Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url: naukri.com
		//driver.get("https://www.naukri.com/");
		
		//using navigate().to() for navigation
		driver.navigate().to("https://www.naukri.com/");
		
		//maximize 
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//enter the designation field By using Xpath
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("QA Automation");
		
		//enter the location 
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]")).sendKeys("Bangalore");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//now hit the search button
		driver.findElement(By.xpath("//div[@class='qsbSubmit']")).click();
		
		//wait for 3 sec
		Thread.sleep(3000);
		
		//navigate backward 
		driver.navigate().back();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK-->click on the login button
		driver.findElement(By.cssSelector("a#login_Layer")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK-->> enter the username
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("aakashg");
		
		//TASK-->> enter the password
		driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("aakash@123");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> hit the login button
		driver.findElement(By.cssSelector("button[class='btn-primary loginButton']")).click();
		
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK-->> close the login pop-up
		driver.findElement(By.xpath("//i[starts-with(@class,'naukicon cross ni-gnb-icn ')]")).click();
		
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> click on the register button
		driver.findElement(By.cssSelector("a#register_Layer")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> navigate back to home page
		driver.navigate().back();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//click on the companies 
		driver.findElement(By.xpath("(//a[@class='nI-gNb-menuItems__anchorDropdown'])[2]")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK--> navigate back to home page
		driver.navigate().back();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//quit the browser
		driver.quit();
		
	}
}




