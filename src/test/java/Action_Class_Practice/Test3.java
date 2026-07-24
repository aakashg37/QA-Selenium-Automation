package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		
		Thread.sleep(2000);
		
		//identify the search bar and enter the input
		WebElement input=driver.findElement(By.xpath("(//input[@name='q'])[1]"));
		
		Actions action=new Actions(driver);
		
		input.sendKeys("Mobile");
		
		Thread.sleep(1000);
		
		//press arrow down key
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(2000);
		
		//press enter tab
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
