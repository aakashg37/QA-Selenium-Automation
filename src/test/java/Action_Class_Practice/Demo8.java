package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/droppable.php#load_box");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		//switch to iframe
		driver.switchTo().frame(frame);
		
		//identify the element and store it in object
		WebElement dragable=driver.findElement(By.xpath("(//div[@id='draggable'])[1]"));
		
		WebElement dropable=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Thread.sleep(2000);
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		//call the method
		action.dragAndDrop(dragable, dropable).perform();
		
		
	}

}
