package Autosuggestion_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 {
	//working on Firefox
	//earlier it was not working on Chrome
	//prblm with chromeDriver was it was showing pop-up
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shoes");
		
		Thread.sleep(4000);
		
		//identify the element suggestions and store it in list
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[@class='FUM3I']//li"));
		
		System.out.println(autosuggestions.size());
		
		for(WebElement asg: autosuggestions)
		{
			String text=asg.getText();
			
			if(text.equals("Shoes For Men")) {
				asg.click();
				break;
			}
			
		}
		
	}
}







