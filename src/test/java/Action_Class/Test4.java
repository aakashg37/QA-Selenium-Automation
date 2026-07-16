package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//identify the element
		WebElement month=driver.findElement(By.cssSelector("#_r_9_"));
		
		
		//create Actions class
		Actions action=new Actions(driver);
		
		//click on the month list box
		action.click(month).perform();
		
		Thread.sleep(1000);
		
		
		//presss downkey button
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		action.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(1000);
		
		action.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
		action.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
		
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
	}
	
	
}
