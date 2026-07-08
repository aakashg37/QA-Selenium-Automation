package HandlingOf_ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the listbox for colors and store it in object
		WebElement colorsList=driver.findElement(By.xpath("//select[@id='colors']"));
		
		//create object of select class 
		Select selectColor=new Select(colorsList);
		
		//select the color by using selectByVisibleText() in select class
		selectColor.selectByVisibleText("Yellow");
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the listbox for sortedList and store it in object
		WebElement	animalList=driver.findElement(By.xpath("//select[@id='animals']"));
		
		//create object of select class
		Select selectAnimal=new Select(animalList);
		
		selectAnimal.selectByVisibleText("Deer");
		
	}

}
