package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("(//iframe[@class='demo-frame'])[2]"));
		
		driver.switchTo().frame(frame);
		
		
		Thread.sleep(1000);
		
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//create Actionc class object
		Actions action=new Actions(driver);
		
		Thread.sleep(1000);
		
		//call th method
		action.dragAndDrop(drag, drop).perform();
		
		
	}
}







