package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	//working
	public static void main(String[] args) throws InterruptedException {
	
			//Open the browser : Chrome
			WebDriver driver=new ChromeDriver();
			
			//Enter the URL
			driver.get("https://en.wikipedia.org/wiki/Main_Page");
			
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Wait for 2 sec
			Thread.sleep(2000);
			
			//Enter the Cricket World Cup into the search field
			driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys("Cricket World Cup");
			
			//Wait for 2 sec
			Thread.sleep(2000);
	
			//Identify all the suggestions and store it 
			List<WebElement> Autosuggestions = driver.findElements(By.xpath("//div[contains(@class,'cdx-menu cdx-menu--has-footer cdx-typeahead-search__menu')]//li"));
			
			//can use the bdi tag instead of li
			//List<WebElement> Autosuggestions = driver.findElements(By.xpath("//div[contains(@class,'cdx-menu cdx-menu--has-footer cdx-typeahead-search__menu')]//bdi"));
			
			//print the size of the list
			//System.out.println("Start--size:"+Autosuggestions.size());
			for(WebElement Demo: Autosuggestions) 
			{
				//System.out.println("inside for loop");
				String text=Demo.getText();
				
				//System.out.println("[ "+text+" ]");
				
				if(text.contains("2011 Cricket World Cup"))
				{
					System.out.println("Matching one: "+text);
					Demo.click();
					
					break;
				}
				//System.out.println("outside if");
			}
			//System.out.println("outside for loop");
		}
		
		
}
