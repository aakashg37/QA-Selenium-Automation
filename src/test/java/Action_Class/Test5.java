package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/?entry_point=login&next");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement month=driver.findElement(By.cssSelector("#_r_9_"));
		
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		//call the method
		action.click(month).perform();
		
		Thread.sleep(1000);
		
		//press end key to reach to bottom
		action.keyDown(Keys.END).keyUp(Keys.END).perform();
		
		for(int i=1; i<=6; i++) {
			
			action.keyDown(Keys.ARROW_UP).keyUp(Keys.ARROW_UP).perform();
			Thread.sleep(1000);
			
		}
		
		Thread.sleep(1000);
		
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
		
	}

}







