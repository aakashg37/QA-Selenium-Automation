package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testmuai.com/selenium-playground/checkbox-demo/");
		
		Thread.sleep(2000);
		
		//identify all elements
		List<WebElement> allCheckboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int count=0;
		
		for(WebElement checkbox : allCheckboxes )
		{
			//click on the checkbox: if it is enabled then only click
			if(checkbox.isEnabled()) {
				checkbox.click();
				count++;
				Thread.sleep(2000);
			}			
			
		}
		
		System.out.println("Clicked checkboxes count is : "+count);
		
		driver.quit();
	}
	
	
}
