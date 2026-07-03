package Locators_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.redbus.in/railways");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//click on the Bus tickets tab
		driver.findElement(By.xpath("(//a[@class='lobContainer___1c63ea '])[1]")).click();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.cssSelector("div#rails-search-widget-source")).click();
		
		Thread.sleep(1000);
		
		//from element
		WebElement source=driver.findElement(By.xpath("//input[@id='src-search-input']"));
		
		Thread.sleep(1000);
		
		source.sendKeys("Pune");
		
		Thread.sleep(2000);
		
		//source wrapper
		//driver.findElement(By.xpath("(//div[@class='srcDestWrapper___53a15d'])[2]")).click();
		driver.findElement(By.cssSelector("div.inputWrapper___4285cd")).click();
		
		Thread.sleep(1000);
		
		//driver.findElement(By.cssSelector("div.suggestionsWrapper___098646")).click();
		//Thread.sleep(1000);
		
		/*currently not able to give input in destination--->giving error on line 51
		//destination element
		WebElement destination=driver.findElement(By.xpath("//input[@id='dst-search-input']"));
			
		Thread.sleep(1000);
		
		destination.sendKeys("Bangalore");
		
		Thread.sleep(2000);
		*/
		
		//search button
		driver.findElement(By.xpath("//button[contains(@class,'primaryButton___0dc9db')]")).click();
		
		
	}
	
}





