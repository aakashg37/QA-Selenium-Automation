package Action_Class_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.testmuai.com/selenium-playground/drag-and-drop-demo/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Identify element and store it in object
		WebElement drag1=driver.findElement(By.xpath("//span[text()='Draggable 1']"));
		
		WebElement drag2=driver.findElement(By.xpath("//span[text()='Draggable 2']"));
		
		WebElement drop=driver.findElement(By.cssSelector("#mydropzone"));
		
		Thread.sleep(1000);
		
		//create Actions class object
		Actions action=new Actions(driver);
		
		Thread.sleep(1000);
		
		//call the method--> ddrag and drop 1st box
		action.dragAndDrop(drag1, drop).perform();
		
		
		Thread.sleep(1000);
		
		//drag and drop 2nd box
		action.dragAndDrop(drag2, drop).perform();
		
		
	}
}








