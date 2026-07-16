package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.cssSelector("#user-name"));
		
		WebElement password=driver.findElement(By.cssSelector("#password"));
		
		
		//create Actions class object
		Actions action = new Actions(driver);
		
		//call the method
		//enter the username into the field
		username.sendKeys("problem_user");
		
		Thread.sleep(1000);
		
		//press tab key
		action.sendKeys(Keys.TAB).perform();
		
		Thread.sleep(1000);
		
		//enter the password into field
		password.sendKeys("secret_sauce");
		
		Thread.sleep(1000);
		
		
		//press enter keyword
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(1000);
		
		//close the browser
		driver.quit();
	}
}





