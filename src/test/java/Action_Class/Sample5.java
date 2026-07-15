package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample5 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the source element and store it in object
		WebElement source=driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		//identify the destination element and store it in object
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//call the method
		action.dragAndDrop(source, destination).perform();
		
	}
}
