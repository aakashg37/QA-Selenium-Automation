package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		
		WebElement	password=driver.findElement(By.xpath("//input[@id='password']"));
		
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		//enter user name
		username.sendKeys("tomsmith");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//press TAB==> Keyboard Action
		action.sendKeys(Keys.TAB).perform();
		
		//enter password
		password.sendKeys("SuperSecretPassword!");
	
		//wait for 2 sec
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ENTER).perform();
		
	}
	
	
}
