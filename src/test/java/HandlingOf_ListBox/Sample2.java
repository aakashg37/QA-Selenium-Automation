package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {

	public static void main(String[] args) {
		
		//launch the browser: Chrome
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//identify the element and store it in object
		WebElement countryDropdown=driver.findElement(By.xpath("//select[@id='country']"));
		
		
		//create select class object and pass the element as parameter to constructor
		Select selectCountry=new Select(countryDropdown);
		
		//select the value by using selectValue()
		selectCountry.selectByValue("germany");
		
		
	}
	
}




