package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		 WebElement frameName=driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[1]"));
		
		driver.switchTo().frame(frameName);
		
		Thread.sleep(1000);
		
		WebElement img1=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[1]"));
		
		WebElement img2=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'])[3]"));
		
		WebElement drop=driver.findElement(By.cssSelector("div#trash"));
		
		//crate Actions class
		Actions action=new Actions(driver);
		
		Thread.sleep(1000);
		
		//call the method
		action.dragAndDrop(img1, drop).perform();
		
		Thread.sleep(1000);
		
		//call the method
		action.dragAndDrop(img2, drop).perform();
		
	}
	
	
}
