package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//identify the listbox for country and store it in object 
		WebElement	countryDropdown=driver.findElement(By.xpath("//select[@id='country']"));
		
		//maximize the screen
		driver.manage().window().maximize();
		
		//create object of select class
		Select selectCountry=new Select(countryDropdown);
		
		//select the country by using selectByVisibleText() in select class
		selectCountry.selectByVisibleText("Germany");
		
		WebElement countryName=selectCountry.getFirstSelectedOption();
		
		String country=countryName.getText();
		
		System.out.println("Selected country is : "+country);
		
	}
}




