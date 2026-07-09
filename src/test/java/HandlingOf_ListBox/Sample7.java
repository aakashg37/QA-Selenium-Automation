package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample7 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//identify the listbox for color and store it in object 
		WebElement color=driver.findElement(By.xpath("//select[@id='colors']"));
		
		
		//create the select class object and pass the webelement as parameter to select class constructor 
		Select selectColor=new Select(color);
		
		//select the color by using value
		selectColor.selectByValue("white");
		
		selectColor.selectByValue("yellow");
		
		
		//select the color by using index
		selectColor.selectByIndex(0);
		selectColor.selectByIndex(1);
		
	}
	
	
}
