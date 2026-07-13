package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	//working
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		/*
		//identify search bar and enter skybags in it
		WebElement searchInput=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		searchInput.sendKeys("skybags");
		
		Thread.sleep(2000);
		
		//identify all the autosuggestions 
		List<WebElement> autosuggestions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
		*/
		
		for(int i=0; i<10; i++)
		{
			
			//identify search bar and enter skybags in it
			WebElement searchInput=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
			
			searchInput.clear();
			
			searchInput.sendKeys("skybags");
			
			Thread.sleep(2000);
			
			//identify all the autosuggestions 
			List<WebElement> autosuggestions=driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]//li"));
			
			autosuggestions.get(i).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		}
					
	}
}
