package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the element and store it in object
		WebElement hoverBtn=driver.findElement(By.xpath("//button[@class='dropbtn']"));
		
		
		//create object of Action class
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		action.moveToElement(hoverBtn).perform();
		
		
		
		
		
	}

}
