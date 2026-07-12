package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//TASK1--> click on the radio button
		driver.findElement(By.xpath("//input[@value='radio1']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK-->2 identify the dropdown and store it in element object
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		
		//create the select class and pass the element as a paramtere into constructor
		Select selectDropdown=new Select(dropDown);
		
		//select the value by using text
		selectDropdown.selectByVisibleText("Option2");
		
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//TASK3---> Select the checkbox
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		
	}
	
	
}
