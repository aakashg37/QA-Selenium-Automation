package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		driver.navigate().to("https://www.myntra.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//wait for 2 sec
		Thread.sleep(2000);
		
		//identify the search bar and search for Laptop
		WebElement searchBar= driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products,')]"));
				
		WebElement search=driver.findElement(By.xpath("//a[@data-reactid='1040']"));
				
		searchBar.sendKeys("Laptop");
		search.click();
				
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
				
		searchBar.clear();
		Thread.sleep(1000);
		searchBar.sendKeys("Mobile");
		search.click();		
				
		Thread.sleep(3000);
		driver.navigate().back();
				
		Thread.sleep(3000);
		
		//identify men tab and click on it
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		
		//wait for 2 sec
		Thread.sleep(2000);
		//navigate back to home page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify female tab and click on-it
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		Thread.sleep(2000);
		//navigate back to home page
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify kids tab and click on it
		driver.findElement(By.xpath("//a[text()='Kids']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify Home tab and click on it
		driver.findElement(By.xpath("//a[@data-reactid='499']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify beauty tab and click on it
		driver.findElement(By.xpath("//a[@data-reactid='643']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify GENZ tab and click on it
		driver.findElement(By.xpath("//a[@data-reactid='805']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify studio tab and click on it
		driver.findElement(By.xpath("//a[@data-reactid='970']")).click();
		
		Thread.sleep(3000);		
		driver.navigate().back();
		Thread.sleep(2000);
		
		//identify wishlist tab and click on it
		driver.findElement(By.xpath("//span[@data-reactid='1032']")).click();
	
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
	
		//identify Bag tab and click on it
		driver.findElement(By.xpath("//span[@data-reactid='1035']")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);

		
		
		
		
	}
}















