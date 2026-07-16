package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify element and store it in object
		WebElement userName=driver.findElement(By.cssSelector("#name"));
		
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		//enter name
		userName.sendKeys("Virat");
		
		Thread.sleep(1000);
		
		//select entered name (CTRL + A)
		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		//copy entered name (CTRL + C)
		action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(1000);
		
		//press tab key
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		Thread.sleep(1000);
		
		//paste the entered key (CTRL + V)
		action.keyDown(Keys.CONTROL).sendKeys("V").keyDown(Keys.CONTROL).perform();
		
	}
}












