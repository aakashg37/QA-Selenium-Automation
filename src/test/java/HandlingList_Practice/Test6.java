package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test6 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//wait for 2 sec
		Thread.sleep(2000);
	
		//identify the element and store it in object
		WebElement animalList=driver.findElement(By.xpath("//select[@id='animals']"));
		
		//crate the select class and pass the identified webelement into constructor
		Select animal=new Select(animalList);
		
		//select the multiple animal
		animal.selectByValue("giraffe");
		animal.selectByValue("lion");
		animal.selectByValue("elephant");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//deselect all the values
		animal.deselectAll();
		
		//wait for 2 sec
		Thread.sleep(1000);
		
		//quit the browser
		driver.quit();
		
	}
	
}
