package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
		//switch to iframe
		driver.switchTo().frame("courses-iframe");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the login button and click on it
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		
		//wait for 2 sec
		//Thread.sleep(2000);
		
		//navigate back to iframe
		driver.navigate().back();
		
		//wait for 2 sec
		Thread.sleep(2000);
				
		//identify the register button and click on it 
		//driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
				
		//navigate back to iframe
		driver.navigate().back();
				
		//wait for 2 sec
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		
		//wait for 2 sec
		//Thread.sleep(2000);
						
		//navigate back to iframe
		//driver.navigate().back();
		
			
	}
}



