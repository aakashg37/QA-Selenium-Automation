package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement selectColor=driver.findElement(By.xpath("//select[@id='colors']"));
		
		//create the select class object and pass the element into constructor
		Select color=new Select(selectColor);
		
		//selet the color by using Index
		color.selectByIndex(0);
		color.selectByIndex(1);
		color.selectByIndex(2);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//deselect the color by using index
		color.deselectByIndex(0);
		color.deselectByIndex(1);
		
	}
	
}
