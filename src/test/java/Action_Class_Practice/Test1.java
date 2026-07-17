package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement inputBar=driver.findElement(By.xpath("//input[@name='_nkw']"));
		
		Thread.sleep(1000);
		
		//craete Actions class object
		Actions action=new Actions(driver);
		
		
		//call the method
		//enter into input field
		inputBar.sendKeys("Shoes");
		
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
		
		
	}
}







