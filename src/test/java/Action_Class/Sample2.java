package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the element and store in a object
		WebElement rightClick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Thread.sleep(2000);
		
		//create Action class object
		Actions action=new Actions(driver);
		
		//call the method
		action.contextClick(rightClick).perform();
		
		
		
		
	}
	
	
}










