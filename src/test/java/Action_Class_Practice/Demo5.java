package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		
		//identify an element and store it in object
		WebElement doubleClk=driver.findElement(By.xpath("//p[text()='Double-click this paragraph to trigger a function.']"));
		
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		//call the method
		action.doubleClick(doubleClk).perform();
		
		
		
	}
	
	
}
