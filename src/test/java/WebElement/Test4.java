package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(1000);
		
		//TASK--> click on the radio button
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
		//wait for 1 sec
		Thread.sleep(1000);
		
		//quit the browser
		driver.quit();
	}
}






