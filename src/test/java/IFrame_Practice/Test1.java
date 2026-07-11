package IFrame_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {	
	
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.testmuai.com/selenium-playground/iframe-demo/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to frame1
		driver.switchTo().frame("iFrame1");
		
		//identify element and enter the input
		driver.findElement(By.xpath("//div[@class='rsw-ce']")).sendKeys("IFrame 1");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to main page
		driver.switchTo().defaultContent();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//switch to frame2  from main page
		driver.switchTo().frame("iFrame2");
		
		//identify the HomeIcon element  and click on it
		driver.findElement(By.xpath("//a[@class='logoLink_xaSN']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//navigate back to iframe2
		driver.navigate().back();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the home page icon and click on it
		driver.findElement(By.xpath("//a[@role='link']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
				
		//navigate back to iframe2
		driver.navigate().back();
				
		//close the browser
		driver.quit();
	}

}
