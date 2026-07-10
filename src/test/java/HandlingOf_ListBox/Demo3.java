package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement	colorDropdown=driver.findElement(By.cssSelector("select#colors"));
		
		
		Select color=new Select(colorDropdown);
		
		color.selectByIndex(0);
		color.selectByIndex(1);
		color.selectByIndex(2);
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		color.deselectAll();
	}

}








