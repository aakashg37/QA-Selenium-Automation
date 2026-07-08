package HandlingList_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.navigate().to("https://www.saucedemo.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//enter value into username input field
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//enter value in password  input field
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		//click on the login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		Thread.sleep(2000);
		
		//https://www.saucedemo.com/inventory.html
		driver.navigate().to("https://www.saucedemo.com/inventory.html");
		
		Thread.sleep(2000);
		
		//identify dropdown and store it in object
		WebElement	dropDown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		//create select class and pass the object as reference into constructor
		Select selectDropdown=new Select(dropDown);
		
		selectDropdown.selectByVisibleText("Name (Z to A)");
		
	}
}






