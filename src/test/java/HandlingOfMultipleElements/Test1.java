package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		
		//Launch browser : Chrome	
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//Identify all Checkboxes
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
		for(WebElement check : checkBoxes)
		{
			check.click();
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		
		driver.quit();
		
	}
}
