package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//identify the element and store it in object
		WebElement datePicker1=driver.findElement(By.xpath("//input[@id='datepicker']"));
		
		//create action class object
		Actions action=new Actions(driver);
		
		Thread.sleep(2000);
		
		//call the method
		action.click(datePicker1).perform();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		WebElement datePicker2=driver.findElement(By.xpath("//input[@id='txtDate']"));
		
		Actions action1=new Actions(driver);
		
		Thread.sleep(2000);
		
		action1.click(datePicker2).perform();
		
	}
}
