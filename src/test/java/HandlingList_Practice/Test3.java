package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.get("https://www.amazon.in/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify element and store it in object
		WebElement	allDropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		//create select class
		Select selectAll=new Select(allDropdown);
		
		selectAll.selectByValue("search-alias=fashion");
		
		
		WebElement selected=selectAll.getFirstSelectedOption();
		
		System.out.println("Selected dropdown is :"+selected.getText());
		
		
	}
	
	
}	



