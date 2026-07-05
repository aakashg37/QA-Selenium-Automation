package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample5 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(6000);
		
		//close the login tab
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		
		Thread.sleep(2000);
		
		WebElement element=driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input')]"));
		
		Thread.sleep(2000);
		
		element.sendKeys("Pune");
		
		
	}
}







