package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testmuai.com/selenium-playground/context-menu/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the element
		WebElement rightClk=driver.findElement(By.xpath("//div[@id='hot-spot']"));
		
		
		//create actions class object
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		//call the method
		action.contextClick(rightClk).perform();
		
		
		
	}
	
	
}
