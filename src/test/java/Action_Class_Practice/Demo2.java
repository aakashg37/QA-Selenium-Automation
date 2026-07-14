package Action_Class_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the element and store it in object
		WebElement rightClk=driver.findElement(By.xpath("//button[@id='rightBtn']"));
		
		Thread.sleep(2000);
		
		//create action class
		Actions action=new Actions(driver);
		
		//call the method
		action.contextClick(rightClk).perform();
		
		Thread.sleep(2000);
		
		List<WebElement> asgs=driver.findElements(By.xpath("//div[@id='contextMenu']//button"));
		
		Thread.sleep(2000);
		
		for(WebElement asg : asgs)
		{
			String text=asg.getText();
			
			if(text.equals("Delete")) {
				asg.click();
				break;
			}
			
		}
		
		
		
	}
}










