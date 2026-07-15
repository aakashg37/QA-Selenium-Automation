package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the brpwser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the element and store it in object
		WebElement	doubleClk=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//create Actions class object
		Actions action=new Actions(driver);
	
		
		//call the method
		action.doubleClick(doubleClk).perform();
	
		
	}
	
	
}
