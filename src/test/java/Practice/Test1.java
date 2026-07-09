package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	
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
		
		Thread.sleep(2000);
		
		//Add onesie Product to the cart
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		
		Thread.sleep(1000);
		
		//Click on to the add to cart page
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//Add Backpack product to the cart
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		
		Thread.sleep(1000);
		
		//Click on to the add to cart page
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		//Remove onesie Product to the cart
		driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
				
		Thread.sleep(1000);
				
		//Click on to the add to cart page
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		
	}
	
}
