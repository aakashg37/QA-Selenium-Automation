package WebElement_Pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//launch the browser
		WebDriver driver=new ChromeDriver();
		
		//enter the url
		//driver.get("https://www.naukri.com/");
		driver.navigate().to("https://www.naukri.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//TASK--> identify the webelments of designation,location,search
		WebElement designation=driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]"));
		
		WebElement location=driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]"));		
		
		WebElement search=driver.findElement(By.cssSelector("div.qsbSubmit"));
		
		//TASK--> With the help of webelement perform search action by providing designation & location
		designation.sendKeys("QA Automation");
		
		location.sendKeys("Bangalore");
		
		Thread.sleep(3000);
		
		//search.click();
		
		//Thread.sleep(2000);
		
		//navigate back to home page
		//driver.navigate().back();
		
		//click on search button on results page
		//driver.findElement(By.cssSelector("button.nI-gNb-sb__icon-wrapper")).click();
		
		//Thread.sleep(1000);
		
		//clear the designation input & location input
		designation.clear();
		location.clear();
		
		//Thread.sleep(1000);
		
		designation.sendKeys("Automation Test Engineer");
		location.sendKeys("Mumbai");
		
		Thread.sleep(2000);
		
		search.click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		
		
	}
	
}



