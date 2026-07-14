package Action_Class_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser : Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the element
		WebElement mouseHover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		//call the method
		action.moveToElement(mouseHover).perform();
		
		//identify all the autosuggestions and store it in List
		List<WebElement> asgs=driver.findElements(By.xpath("//div[@class='mouse-hover-content']//a"));
		
		for(WebElement asg: asgs)
		{
			String text=asg.getText();
			
			if(text.equals("Top")) {
				asg.click();
				break;
			}
			
		}
	}
	
	
}
