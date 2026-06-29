package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	//APPROACH - II
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver =new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Identify an element
		WebElement text=driver.findElement(By.cssSelector("input#name"));
		
		//enter name
		text.sendKeys("Rohit Sharma");
		
		Thread.sleep(1000);
		
		text.clear();
		
		Thread.sleep(2000);
		
		text.sendKeys("Virat Kohli");
		
		Thread.sleep(1000);
		
		text.clear();
		
		driver.quit();
	}
	
}





